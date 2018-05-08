package com.lue.service;

import com.lue.model.Customers;
import java.util.List;
import org.springframework.data.domain.Sort;

/**
 *
 * @author
 */
public interface CustomerService {

    public List<Customers> findAll();

    public List<Customers> findAll(Sort sort);

    public List<Customers> saveAll(Iterable<Customers> itrbl);

    public void flush();

    public Customers saveAndFlush(Customers s);

    public void deleteInBatch(Iterable<Customers> itrbl);

    public void deleteAllInBatch();

    public Customers getOne(Long id);

}
