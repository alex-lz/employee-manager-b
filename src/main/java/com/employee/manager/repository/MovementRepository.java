package com.employee.manager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.manager.model.Movement;
import com.employee.manager.model.MovementId;

@Repository
public interface MovementRepository extends JpaRepository<Movement, MovementId>{

}
