package com.lue.service;

import com.lue.model.Activity;
import com.lue.repository.ActivityRepository;
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
public class ActivityServiceImpl implements ActivityService {

    @Autowired
    private ActivityRepository activityRepository;

    @Override
    public List<Activity> findAll() {
        return activityRepository.findAll();
    }

    @Override
    public List<Activity> findAll(Sort sort) {
        return activityRepository.findAll(sort);
    }

    @Override
    public List<Activity> saveAll(Iterable<Activity> itrbl) {
        return activityRepository.saveAll(itrbl);
    }

    @Override
    public void flush() {
        activityRepository.flush();
    }

    @Override
    public Activity saveAndFlush(Activity s) {
        return activityRepository.saveAndFlush(s);
    }

    @Override
    public void deleteInBatch(Iterable<Activity> itrbl) {
        activityRepository.deleteInBatch(itrbl);
    }

    @Override
    public void deleteAllInBatch() {
        activityRepository.deleteAllInBatch();
    }

    @Override
    public Activity getOne(Long id) {
        return activityRepository.getOne(id);
    }

}
