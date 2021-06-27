package com.hexagon_architecture.admission_system.port.api.service;

import com.hexagon_architecture.admission_system.core_application.busineess_logic.Application;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ApplicationService {
    List<Application> getAllApplication();
    List<Application> getStatusWiseApplication(Integer status_code);
    Application getInfoById(Long application_id);
    Application save(Application application);
}
