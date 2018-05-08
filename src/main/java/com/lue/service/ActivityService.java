package com.lue.service;

import com.lue.model.Activity;
import java.util.List;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;

/**
 *
 * @author
 */
public interface ActivityService {
    
    public List<Activity> findAll();

    public List<Activity> findAll(Sort sort);


    public List<Activity> saveAll(Iterable<Activity> itrbl);

    public void flush();

    public Activity saveAndFlush(Activity s);

    public void deleteInBatch(Iterable<Activity> itrbl);

    public void deleteAllInBatch();

    public Activity getOne(Long id);

    
}
