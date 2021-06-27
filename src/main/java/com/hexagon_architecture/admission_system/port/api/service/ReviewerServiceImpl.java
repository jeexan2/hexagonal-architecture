package com.hexagon_architecture.admission_system.port.api.service;

import com.hexagon_architecture.admission_system.core_application.busineess_logic.Reviewer;
import com.hexagon_architecture.admission_system.port.api.repository.ReviewerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewerServiceImpl implements ReviewerService {
    @Autowired
    ReviewerRepository reviewerRepository;
    @Override
    public List<Reviewer> getAllReviewerList() {
        return reviewerRepository.findAll();
    }
}
