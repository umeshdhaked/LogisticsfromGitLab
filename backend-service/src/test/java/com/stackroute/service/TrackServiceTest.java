package com.stackroute.service;

import com.stackroute.domain.Track;
import com.stackroute.repository.TrackRepository;
import org.junit.*;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.mockito.ArgumentMatchers.any;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class TrackServiceTest {

    private Track track;
    private Track updatedTrack;
    @Mock
    private TrackRepository trackRepository;

    @InjectMocks
    private TrackServiceImpl trackService;
    List<Track> list;


    @Before
    public void  setUp(){
        //Initialising the mock object
        MockitoAnnotations.initMocks(this);
        //track = new Track(1, "test-name", "test-artist", "test-comment");
        track = new Track();
        track.set_id(1);
        track.setName("test-name");
        track.setArtist("test-artist");
        track.setTrackComments("test-comment");
        list = new ArrayList<>();
        list.add(track);
        updatedTrack = new Track(4, "test-name", "test-artist", "updated-comment");

    }

    @After
    public void tearDown() throws Exception {
        this.track = null;
        this.list = null;
    }

    @Test
    public void getAllTracks() throws Exception{
        trackRepository.save(track);
        when(trackService.getAllTracks()).thenReturn(list);
        List<Track> trackList = trackService.getAllTracks();
        assertEquals(list, trackList);
    }

    @Test
    public void saveTrack() throws Exception{
        when(trackRepository.save((Track)any())).thenReturn(track);
        Track savedTrack = trackService.saveTrack(track);
        Assert.assertEquals(track,savedTrack);

        //verify here verifies that trackRepository save method is only called once
        verify(trackRepository,times(1)).save(track);
    }

 /*   @Test
    public void deleteTrackById() throws Exception{
        //when(trackService.getAlpackage com.stackroute.service;

import static org.junit.Assert.*;

public class TrackServiceTest {

}lTracks()).thenReturn(list); //for debugging
        //trackRepository.save(track);
        when(trackRepository.save((Track)any())).thenReturn(track);
        *//*List<Track> trackList = trackService.getAllTracks(); //for debugging
        System.out.println("test" + trackList); //for debugging*//*
        // System.out.println(trackRepository.findById(1)); //for debugging
        //  when(trackService.deleteTrackById((anyInt()))).thenReturn(track);
        Track savedTrack = trackService.saveTrack(track);
        Track deletedTrack = trackService.deleteTrackById(track.getTrackId());

        Assert.assertEquals(track, deletedTrack);
//        Track deletedTrack = new Track(1,"abc","asdsd","fddfsd");
//            trackService.saveTrack(deletedTrack);
//        trackService.deleteTrackById(1);
//        verify(trackRepository, times(1)).delete(track);
    }*/

 /*   @Test
    public void updateTrack() {
        trackRepository.save(track);
        when(trackService.updateTrack(any())).thenReturn(updatedTrack);

        Track updateTest = trackService.updateTrack(updatedTrack);
        assertEquals(updatedTrack, updateTest);
    }*/

    @Test
    public void findTrackByName() throws Exception{
        trackRepository.save(track);
        when(trackService.findTrackByName(any())).thenReturn(list);
        List<Track> tracks = trackService.findTrackByName(track.getName());
        assertEquals(tracks, list);
    }
}