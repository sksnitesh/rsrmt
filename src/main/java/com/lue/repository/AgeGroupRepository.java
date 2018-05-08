package com.lue.repository;

import com.lue.model.AgeGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 
 */

@Repository
public interface AgeGroupRepository extends JpaRepository<AgeGroup, Long> {

}
