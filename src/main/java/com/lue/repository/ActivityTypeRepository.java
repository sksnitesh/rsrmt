package com.lue.repository;

import com.lue.model.ActivityType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 
 */

@Repository
public interface ActivityTypeRepository extends JpaRepository<ActivityType, Long> {

}
