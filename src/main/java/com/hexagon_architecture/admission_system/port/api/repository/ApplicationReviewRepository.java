package com.hexagon_architecture.admission_system.port.api.repository;

import com.hexagon_architecture.admission_system.core_application.busineess_logic.Application;
import com.hexagon_architecture.admission_system.core_application.busineess_logic.ApplicationReview;
import org.hibernate.secure.spi.JaccPermissionDeclarations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface ApplicationReviewRepository extends JpaRepository<ApplicationReview,Long> {
    List<Application> getListOfApplicationReviewedBy(Long reviewer_id);
}
