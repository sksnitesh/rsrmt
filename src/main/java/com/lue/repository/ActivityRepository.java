package com.lue.repository;

import com.lue.model.Activity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 
 */

@Repository
public interface ActivityRepository extends JpaRepository<Activity, Long> {

}
