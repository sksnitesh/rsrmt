package com.lue.service;

import com.lue.model.PropertyType;
import com.lue.repository.PropertyTypeRepository;
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
public class PropertyTypeServiceImpl implements PropertyTypeService {

    @Autowired
    private PropertyTypeRepository propertyTypeRepository;

    @Override
    public List<PropertyType> findAll() {
        return propertyTypeRepository.findAll();
    }

    @Override
    public List<PropertyType> findAll(Sort sort) {
        return propertyTypeRepository.findAll(sort);
    }

    @Override
    public List<PropertyType> saveAll(Iterable<PropertyType> itrbl) {
        return propertyTypeRepository.saveAll(itrbl);
    }

    @Override
    public void flush() {
        propertyTypeRepository.flush();
    }

    @Override
    public PropertyType saveAndFlush(PropertyType s) {
        return propertyTypeRepository.saveAndFlush(s);
    }

    @Override
    public void deleteInBatch(Iterable<PropertyType> itrbl) {
        propertyTypeRepository.deleteInBatch(itrbl);
    }

    @Override
    public void deleteAllInBatch() {
        propertyTypeRepository.deleteAllInBatch();
    }

    @Override
    public PropertyType getOne(Long id) {
        return propertyTypeRepository.getOne(id);
    }

}
