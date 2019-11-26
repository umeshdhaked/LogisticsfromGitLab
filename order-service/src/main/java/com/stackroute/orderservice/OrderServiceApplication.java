package com.stackroute.orderservice;

import com.stackroute.orderservice.service.Consumer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Properties;

@SpringBootApplication
public class OrderServiceApplication implements CommandLineRunner {
	@Value("${zookeeper.groupId}")
	private String zookeeperGroupId;
	@Value("${kafka.bootstrap.servers}")
	private String kafkaBootstrapServers;
	@Value("${kafka.topic.vehicle_slots}")
	private static String vehicleSlotsTopicName;

	public static void main(String[] args) {
		SpringApplication.run(OrderServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Properties consumerProperties = new Properties();
		consumerProperties.put("bootstrap.servers", kafkaBootstrapServers);
		consumerProperties.put("group.id", zookeeperGroupId);
		consumerProperties.put("zookeeper.session.timeout.ms", "6000");
		consumerProperties.put("zookeeper.sync.time.ms","2000");
		consumerProperties.put("auto.commit.enable", "false");
		consumerProperties.put("auto.commit.interval.ms", "1000");
		consumerProperties.put("consumer.timeout.ms", "-1");
		consumerProperties.put("max.poll.records", "1");
		consumerProperties.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
		consumerProperties.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");

		/*
		 * Creating a thread to listen to the kafka topic
		 */
		Thread kafkaConsumerThread = new Thread(() -> {
			System.out.println("Starting Kafka consumer thread.");

			Consumer simpleKafkaConsumer = new Consumer(
					/*vehicleSlotsTopicName*/ "vehicle_slots",
					consumerProperties
			);

			simpleKafkaConsumer.runSingleWorker();
		});

		/*
		 * Starting the first thread.
		 */
		kafkaConsumerThread.start();
	}
}
