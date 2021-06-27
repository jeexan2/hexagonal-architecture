package com.hexagon_architecture.admission_system.port.api.service;

import com.hexagon_architecture.admission_system.core_application.busineess_logic.Application;
import com.hexagon_architecture.admission_system.core_application.busineess_logic.ApplicationReview;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ApplicationReviewerService {
    List<Application> getListOfApplicationReviewedBy(Long reviewer_id);
    ApplicationReview save(ApplicationReview applicationReview);
}
