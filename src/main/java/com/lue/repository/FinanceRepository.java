package com.lue.repository;

import com.lue.model.Finance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 
 */

@Repository
public interface FinanceRepository extends JpaRepository<Finance, Long> {

}
