package com.lue.service;

import com.lue.model.CustomerType;
import java.util.List;
import org.springframework.data.domain.Sort;

/**
 *
 * @author
 */
public interface CustomerTypeService {

    public List<CustomerType> findAll();

    public List<CustomerType> findAll(Sort sort);

    public List<CustomerType> saveAll(Iterable<CustomerType> itrbl);

    public void flush();

    public CustomerType saveAndFlush(CustomerType s);

    public void deleteInBatch(Iterable<CustomerType> itrbl);

    public void deleteAllInBatch();

    public CustomerType getOne(Long id);

}
