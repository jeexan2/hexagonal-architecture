package com.hexagon_architecture.admission_system.port.api.service;

import com.hexagon_architecture.admission_system.core_application.busineess_logic.Reviewer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ReviewerService {
    List<Reviewer> getAllReviewerList();
}
