package com.lue.repository;

import com.lue.model.Lang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 
 */

@Repository
public interface LangRepository extends JpaRepository<Lang, Long> {

}
