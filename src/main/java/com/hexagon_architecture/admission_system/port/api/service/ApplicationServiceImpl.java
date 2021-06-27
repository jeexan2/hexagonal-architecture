package com.hexagon_architecture.admission_system.port.api.service;

import com.hexagon_architecture.admission_system.core_application.busineess_logic.Application;
import com.hexagon_architecture.admission_system.port.api.repository.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationServiceImpl implements ApplicationService {
    @Autowired
    ApplicationRepository applicationRepository;
    @Override
    public List<Application> getAllApplication() {
        return applicationRepository.findAll();
    }

    @Override
    public List<Application> getStatusWiseApplication(Integer status_code) {
        return applicationRepository.getStatusWiseApplication(status_code);
    }

    @Override
    public Application getInfoById(Long application_id) {
        return applicationRepository.getById(application_id);
    }

    @Override
    public Application save(Application application) {
        return applicationRepository.save(application);
    }
}
