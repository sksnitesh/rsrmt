package com.lue.service;

import com.lue.model.ActivityType;
import com.lue.repository.ActivityTypeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author
 */
@Service
@Transactional
public class ActivityTypeServiceImpl implements ActivityTypeService {

    @Autowired
    private ActivityTypeRepository activityTypeRepository;

    @Override
    public List<ActivityType> findAll() {
        return activityTypeRepository.findAll();
    }

    @Override
    public List<ActivityType> findAll(Sort sort) {
        return activityTypeRepository.findAll(sort);
    }

    @Override
    public List<ActivityType> saveAll(Iterable<ActivityType> itrbl) {
        return activityTypeRepository.saveAll(itrbl);
    }

    @Override
    public void flush() {
        activityTypeRepository.flush();
    }

    @Override
    public ActivityType saveAndFlush(ActivityType s) {
        return activityTypeRepository.saveAndFlush(s);
    }

    @Override
    public void deleteInBatch(Iterable<ActivityType> itrbl) {
        activityTypeRepository.deleteInBatch(itrbl);
    }

    @Override
    public void deleteAllInBatch() {
        activityTypeRepository.deleteAllInBatch();
    }

    @Override
    public ActivityType getOne(Long id) {
        return activityTypeRepository.getOne(id);
    }

}
