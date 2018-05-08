package com.lue.repository;

import com.lue.model.PropertyType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 
 */

@Repository
public interface PropertyTypeRepository extends JpaRepository<PropertyType, Long> {

}
