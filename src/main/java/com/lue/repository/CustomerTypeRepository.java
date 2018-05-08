package com.lue.repository;

import com.lue.model.CustomerType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 
 */

@Repository
public interface CustomerTypeRepository extends JpaRepository<CustomerType, Long> {

}
