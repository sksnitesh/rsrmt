package com.lue.repository;

import com.lue.model.Agent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 
 */

@Repository
public interface AgentRepository extends JpaRepository<Agent, Long> {

}
