package com.hexagon_architecture.admission_system.adapter.rest_gateway;

import com.hexagon_architecture.admission_system.core_application.busineess_logic.Application;
import com.hexagon_architecture.admission_system.port.api.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/application",method = RequestMethod.GET)
public class ApplicationGatewayAdapter {

    @Autowired
    ApplicationService applicationService;
    @RequestMapping(value="/submit-applicaiton",method = RequestMethod.POST)
    public ResponseEntity<Application> postApplication(Application application){
        applicationService.save(application);

        return ResponseEntity.ok(application);
    }

}
