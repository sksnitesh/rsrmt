package com.lue.service;

import com.lue.model.Property;
import java.util.List;
import org.springframework.data.domain.Sort;

/**
 *
 * @author
 */
public interface PropertyService {
    
      public List<Property> findAll();

    public List<Property> findAll(Sort sort);

    public List<Property> saveAll(Iterable<Property> itrbl);

    public void flush();

    public Property saveAndFlush(Property s);

    public void deleteInBatch(Iterable<Property> itrbl);

    public void deleteAllInBatch();

    public Property getOne(Long id);
}
