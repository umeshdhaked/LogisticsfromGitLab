package com.stackroute.controller;

import com.stackroute.domain.VehicleCompanyProfile;
import com.stackroute.service.VehicleCompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehicleCompanyProfile")
public class VehicleController {

    VehicleCompanyService vehicleCompanyService;

    @Autowired
    public VehicleController(VehicleCompanyService vehicleCompanyService) {
        this.vehicleCompanyService = vehicleCompanyService;
    }

    @CrossOrigin
        @PostMapping("/saveVehicleCompanyDetail")
    public void saveVehicleCompanyData(@RequestBody VehicleCompanyProfile vehicleCompanyProfile){

        VehicleCompanyProfile existed = vehicleCompanyService.getVehicleCompanyProfileByEmail(vehicleCompanyProfile.getEmail());

        if(existed != null){
            vehicleCompanyProfile.setId(existed.getId());
        }

        vehicleCompanyService.saveData(vehicleCompanyProfile);
    }

    @CrossOrigin
    @GetMapping("/getProfile")
    public VehicleCompanyProfile getCompanyDetailFromEmail(@RequestParam("email") String email){
        return vehicleCompanyService.getVehicleCompanyProfileByEmail(email);
    }

    @CrossOrigin
    @GetMapping("/getAllProfile")
    public List<VehicleCompanyProfile> getAllCompanyDetail(@RequestParam("email") String email){
        return vehicleCompanyService.getAllVehicleCompanyProfile();
    }


}
