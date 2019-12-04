package com.stackroute.routing.service;

import com.stackroute.routing.domain.Depot;
import com.stackroute.routing.domain.Order;
import com.stackroute.routing.repository.DepotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DepotServiceImpl implements  DepotService{
    DepotRepository depotRepository;

    @Autowired
    public DepotServiceImpl(DepotRepository depotRepository) {
        this.depotRepository = depotRepository;
    }

    @Override
    public Depot addDepot(Depot depot) throws Exception {
        return depotRepository.save(depot);
    }

    @Override
    public Depot deleteDepot(int wholesalerId) throws Exception {
        Depot depot=depotRepository.findByWholesalerId(wholesalerId);
         depotRepository.deleteById(depot.getId());
        return depotRepository.findByWholesalerId(wholesalerId);
    }

    @Override
    public Depot updateDepot(Depot depot) throws Exception {

        return depotRepository.save(depot);
    }
}
