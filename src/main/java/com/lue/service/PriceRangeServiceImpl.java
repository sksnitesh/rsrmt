package com.lue.service;

import com.lue.model.PriceRange;
import com.lue.repository.PriceRangeRepository;
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
public class PriceRangeServiceImpl implements PriceRangeService {

    @Autowired
    private PriceRangeRepository priceRangeRepository;

    @Override
    public List<PriceRange> findAll() {
        return priceRangeRepository.findAll();
    }

    @Override
    public List<PriceRange> findAll(Sort sort) {
        return priceRangeRepository.findAll(sort);
    }

    @Override
    public List<PriceRange> saveAll(Iterable<PriceRange> itrbl) {
        return priceRangeRepository.saveAll(itrbl);
    }

    @Override
    public void flush() {
        priceRangeRepository.flush();
    }

    @Override
    public PriceRange saveAndFlush(PriceRange s) {
        return priceRangeRepository.saveAndFlush(s);
    }

    @Override
    public void deleteInBatch(Iterable<PriceRange> itrbl) {
        priceRangeRepository.deleteInBatch(itrbl);
    }

    @Override
    public void deleteAllInBatch() {
        priceRangeRepository.deleteAllInBatch();
    }

    @Override
    public PriceRange getOne(Long id) {
        return priceRangeRepository.getOne(id);
    }

}
