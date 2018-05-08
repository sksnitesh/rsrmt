package com.lue.service;

import com.lue.model.AgeGroup;
import com.lue.repository.AgeGroupRepository;
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
public class AgeGroupServiceImpl implements AgeGroupService {

    @Autowired
    private AgeGroupRepository ageGroupRepository;

    @Override
    public List<AgeGroup> findAll() {
        return ageGroupRepository.findAll();
    }

    @Override
    public List<AgeGroup> findAll(Sort sort) {
        return ageGroupRepository.findAll(sort);
    }

    @Override
    public List<AgeGroup> saveAll(Iterable<AgeGroup> itrbl) {
        return ageGroupRepository.saveAll(itrbl);
    }

    @Override
    public void flush() {
        ageGroupRepository.flush();
    }

    @Override
    public AgeGroup saveAndFlush(AgeGroup s) {
        return ageGroupRepository.saveAndFlush(s);
    }

    @Override
    public void deleteInBatch(Iterable<AgeGroup> itrbl) {
        ageGroupRepository.deleteInBatch(itrbl);
    }

    @Override
    public void deleteAllInBatch() {
        ageGroupRepository.deleteAllInBatch();
    }

    @Override
    public AgeGroup getOne(Long id) {
        return ageGroupRepository.getOne(id);
    }

}
