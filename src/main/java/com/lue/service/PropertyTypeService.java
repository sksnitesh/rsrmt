package com.lue.service;

import com.lue.model.PropertyType;
import java.util.List;
import org.springframework.data.domain.Sort;

/**
 *
 * @author
 */
public interface PropertyTypeService {
    
    public List<PropertyType> findAll();

    public List<PropertyType> findAll(Sort sort);

    public List<PropertyType> saveAll(Iterable<PropertyType> itrbl);

    public void flush();

    public PropertyType saveAndFlush(PropertyType s);

    public void deleteInBatch(Iterable<PropertyType> itrbl);

    public void deleteAllInBatch();

    public PropertyType getOne(Long id);
}
