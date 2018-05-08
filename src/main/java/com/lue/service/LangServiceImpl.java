package com.lue.service;

import com.lue.model.Lang;
import com.lue.repository.LangRepository;
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
public class LangServiceImpl implements LangService {

    @Autowired
    private LangRepository langRepository;

    @Override
    public List<Lang> findAll() {
        return langRepository.findAll();
    }

    @Override
    public List<Lang> findAll(Sort sort) {
        return langRepository.findAll(sort);
    }

    @Override
    public List<Lang> saveAll(Iterable<Lang> itrbl) {
        return langRepository.saveAll(itrbl);
    }

    @Override
    public void flush() {
        langRepository.flush();
    }

    @Override
    public Lang saveAndFlush(Lang s) {
        return langRepository.saveAndFlush(s);
    }

    @Override
    public void deleteInBatch(Iterable<Lang> itrbl) {
        langRepository.deleteInBatch(itrbl);
    }

    @Override
    public void deleteAllInBatch() {
        langRepository.deleteAllInBatch();
    }

    @Override
    public Lang getOne(Long id) {
        return langRepository.getOne(id);
    }

}
