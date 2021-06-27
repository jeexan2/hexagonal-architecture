package com.hexagon_architecture.admission_system.port.api.service;

import com.hexagon_architecture.admission_system.core_application.busineess_logic.Application;
import com.hexagon_architecture.admission_system.core_application.busineess_logic.ApplicationReview;
import com.hexagon_architecture.admission_system.port.api.repository.ApplicationReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationReviewerServiceImpl implements ApplicationReviewerService{
    @Autowired
    ApplicationReviewRepository applicationReviewRepository;
    @Override
    public List<Application> getListOfApplicationReviewedBy(Long reviewer_id) {
        return applicationReviewRepository.getListOfApplicationReviewedBy(reviewer_id);
    }

    @Override
    public ApplicationReview save(ApplicationReview applicationReview) {
        return applicationReviewRepository.save(applicationReview);
    }
}
