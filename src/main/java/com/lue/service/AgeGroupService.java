package com.lue.service;

import com.lue.model.AgeGroup;
import java.util.List;
import org.springframework.data.domain.Sort;

/**
 *
 * @author
 */
public interface AgeGroupService {
 
    public List<AgeGroup> findAll();

    public List<AgeGroup> findAll(Sort sort);

    public List<AgeGroup> saveAll(Iterable<AgeGroup> itrbl);

    public void flush();

    public AgeGroup saveAndFlush(AgeGroup s);

    public void deleteInBatch(Iterable<AgeGroup> itrbl);

    public void deleteAllInBatch();

    public AgeGroup getOne(Long id);
}
