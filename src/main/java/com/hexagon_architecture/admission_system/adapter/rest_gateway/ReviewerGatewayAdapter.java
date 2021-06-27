package com.hexagon_architecture.admission_system.adapter.rest_gateway;

import com.hexagon_architecture.admission_system.core_application.busineess_logic.Application;
import com.hexagon_architecture.admission_system.core_application.busineess_logic.ApplicationReview;
import com.hexagon_architecture.admission_system.port.api.service.ApplicationReviewerService;
import com.hexagon_architecture.admission_system.port.api.service.ApplicationService;
import com.hexagon_architecture.admission_system.port.api.service.ReviewerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/reviewer",method = RequestMethod.GET)
public class ReviewerGatewayAdapter {
    @Autowired
    ApplicationService applicationService;

    @Autowired
    ApplicationReviewerService applicationReviewerService;

    @Autowired
    ReviewerService reviewerService;

    @RequestMapping(value = "/review-application",method = RequestMethod.POST)
    public ResponseEntity<?> submitApplicationReview(ApplicationReview applicationReview){
        applicationReviewerService.save(applicationReview);

        return ResponseEntity.ok(applicationReview);
    }

}
