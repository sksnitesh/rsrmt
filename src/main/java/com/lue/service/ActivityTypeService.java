package com.lue.service;

import com.lue.model.ActivityType;
import java.util.List;
import org.springframework.data.domain.Sort;

/**
 *
 * @author
 */
public interface ActivityTypeService {

    public List<ActivityType> findAll();

    public List<ActivityType> findAll(Sort sort);

    public List<ActivityType> saveAll(Iterable<ActivityType> itrbl);

    public void flush();

    public ActivityType saveAndFlush(ActivityType s);

    public void deleteInBatch(Iterable<ActivityType> itrbl);

    public void deleteAllInBatch();

    public ActivityType getOne(Long id);
}
