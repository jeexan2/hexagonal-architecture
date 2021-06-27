package com.hexagon_architecture.admission_system.core_application.busineess_logic;

import lombok.Data;

import javax.persistence.Entity;

@Data
public class Application {
    private Long application_id;
    private String application_name;
    private String application_info;
}
