package com.lue.service;

import com.lue.model.Gender;
import com.lue.repository.GenderRepository;
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
public class GenderServiceImpl implements GenderService{

    @Autowired
    private GenderRepository genderRepository;

    @Override
    public List<Gender> findAll() {
        return genderRepository.findAll();
    }

    @Override
    public List<Gender> findAll(Sort sort) {
        return genderRepository.findAll(sort);
    }

    @Override
    public List<Gender> saveAll(Iterable<Gender> itrbl) {
        return genderRepository.saveAll(itrbl);
    }

    @Override
    public void flush() {
        genderRepository.flush();
    }

    @Override
    public Gender saveAndFlush(Gender s) {
        return genderRepository.saveAndFlush(s);
    }

    @Override
    public void deleteInBatch(Iterable<Gender> itrbl) {
        genderRepository.deleteInBatch(itrbl);
    }

    @Override
    public void deleteAllInBatch() {
        genderRepository.deleteAllInBatch();
    }

    @Override
    public Gender getOne(Long id) {
        return genderRepository.getOne(id);
    }

}
