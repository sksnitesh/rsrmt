package com.lue.repository;

import com.lue.model.PriceRange;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 
 */

@Repository
public interface PriceRangeRepository extends JpaRepository<PriceRange, Long> {

}
