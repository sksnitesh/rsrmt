package com.lue.service;

import com.lue.model.Customers;
import com.lue.repository.CustomerRepository;
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
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public List<Customers> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public List<Customers> findAll(Sort sort) {
        return customerRepository.findAll(sort);
    }

    @Override
    public List<Customers> saveAll(Iterable<Customers> itrbl) {
        return customerRepository.saveAll(itrbl);
    }

    @Override
    public void flush() {
        customerRepository.flush();
    }

    @Override
    public Customers saveAndFlush(Customers s) {
        return customerRepository.saveAndFlush(s);
    }

    @Override
    public void deleteInBatch(Iterable<Customers> itrbl) {
        customerRepository.deleteInBatch(itrbl);
    }

    @Override
    public void deleteAllInBatch() {
        customerRepository.deleteAllInBatch();
    }

    @Override
    public Customers getOne(Long id) {
        return customerRepository.getOne(id);
    }

}
