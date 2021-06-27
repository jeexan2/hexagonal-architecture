package com.hexagon_architecture.admission_system.port.spi.repository;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ApplicationBackgroundCheckingConnector {
    String doConnectWithBackgroundChecking(String connectionString);
    List<String> getInfo(String connectionString);
}
