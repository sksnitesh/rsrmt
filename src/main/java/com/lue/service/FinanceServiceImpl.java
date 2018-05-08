package com.lue.service;

import com.lue.model.Finance;
import com.lue.repository.FinanceRepository;
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
public class FinanceServiceImpl implements FinanceService {

    @Autowired
    private FinanceRepository financeRepository;

    @Override
    public List<Finance> findAll() {
        return financeRepository.findAll();
    }

    @Override
    public List<Finance> findAll(Sort sort) {
        return financeRepository.findAll(sort);
    }

    @Override
    public List<Finance> saveAll(Iterable<Finance> itrbl) {
        return financeRepository.saveAll(itrbl);
    }

    @Override
    public void flush() {
        financeRepository.flush();
    }

    @Override
    public Finance saveAndFlush(Finance s) {
        return financeRepository.saveAndFlush(s);
    }

    @Override
    public void deleteInBatch(Iterable<Finance> itrbl) {
        financeRepository.deleteInBatch(itrbl);
    }

    @Override
    public void deleteAllInBatch() {
        financeRepository.deleteAllInBatch();
    }

    @Override
    public Finance getOne(Long id) {
        return financeRepository.getOne(id);
    }

}
