package com.hexagon_architecture.admission_system.core_application.busineess_logic;

import lombok.Data;

import java.util.List;

@Data
public class ApplicationReview {
    private Long application_review_id;
    private Long application_id;
    private Long reviewed_by;
    private Boolean application_status;

}
