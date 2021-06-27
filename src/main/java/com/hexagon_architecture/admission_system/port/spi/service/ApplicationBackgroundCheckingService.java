package com.hexagon_architecture.admission_system.port.spi.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ApplicationBackgroundCheckingService {
    void doConnect();
    List<String> retrieveInfo();
}
