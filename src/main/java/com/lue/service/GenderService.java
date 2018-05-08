package com.lue.service;

import com.lue.model.Finance;
import com.lue.model.Gender;
import java.util.List;
import org.springframework.data.domain.Sort;

/**
 *
 * @author
 */
public interface GenderService {
    
    public List<Gender> findAll();

    public List<Gender> findAll(Sort sort);

    public List<Gender> saveAll(Iterable<Gender> itrbl);

    public void flush();

    public Gender saveAndFlush(Gender s);

    public void deleteInBatch(Iterable<Gender> itrbl);

    public void deleteAllInBatch();

    public Gender getOne(Long id);
    
}
