package com.lue.service;

import com.lue.model.CustomerType;
import com.lue.repository.CustomerTypeRepository;
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
public class CustomerTypeServiceImpl implements CustomerTypeService {

    @Autowired
    private CustomerTypeRepository customerTypeRepository;

    @Override
    public List<CustomerType> findAll() {
        return customerTypeRepository.findAll();
    }

    @Override
    public List<CustomerType> findAll(Sort sort) {
        return customerTypeRepository.findAll(sort);
    }

    @Override
    public List<CustomerType> saveAll(Iterable<CustomerType> itrbl) {
        return customerTypeRepository.saveAll(itrbl);
    }

    @Override
    public void flush() {
        customerTypeRepository.flush();
    }

    @Override
    public CustomerType saveAndFlush(CustomerType s) {
        return customerTypeRepository.saveAndFlush(s);
    }

    @Override
    public void deleteInBatch(Iterable<CustomerType> itrbl) {
        customerTypeRepository.deleteInBatch(itrbl);
    }

    @Override
    public void deleteAllInBatch() {
        customerTypeRepository.deleteAllInBatch();
    }

    @Override
    public CustomerType getOne(Long id) {
        return customerTypeRepository.getOne(id);
    }

}
