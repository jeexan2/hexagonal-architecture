package com.hexagon_architecture.admission_system.port.spi.service;

import com.hexagon_architecture.admission_system.port.spi.repository.ApplicationBackgroundCheckingConnector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationBackgroundCheckingServiceImpl implements ApplicationBackgroundCheckingService {
    @Autowired
    ApplicationBackgroundCheckingConnector applicationBackgroundCheckingConnector;

    String connected;

    @Override
    public void doConnect() {
        String con = "Connection-String";
        connected = applicationBackgroundCheckingConnector.doConnectWithBackgroundChecking(con);
    }

    @Override
    public List<String> retrieveInfo() {
        return applicationBackgroundCheckingConnector.getInfo(connected);
    }
}
