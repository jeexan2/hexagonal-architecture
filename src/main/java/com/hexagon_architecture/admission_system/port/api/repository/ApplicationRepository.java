package com.hexagon_architecture.admission_system.port.api.repository;

import com.hexagon_architecture.admission_system.core_application.busineess_logic.Application;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface ApplicationRepository extends JpaRepository<Application,Long> {
    List<Application> getStatusWiseApplication(Integer status_code);
}
