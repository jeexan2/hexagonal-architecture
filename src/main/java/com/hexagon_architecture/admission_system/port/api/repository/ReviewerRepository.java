package com.hexagon_architecture.admission_system.port.api.repository;

import com.hexagon_architecture.admission_system.core_application.busineess_logic.Reviewer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface ReviewerRepository extends JpaRepository<Reviewer,Long> {

}
