package com.lue.service;

import com.lue.model.Property;
import com.lue.repository.PropertyRepository;
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
public class PropertyServiceImpl implements PropertyService {

    @Autowired
    private PropertyRepository propertyRepository;

    @Override
    public List<Property> findAll() {
        return propertyRepository.findAll();
    }

    @Override
    public List<Property> findAll(Sort sort) {
        return propertyRepository.findAll(sort);
    }

    @Override
    public List<Property> saveAll(Iterable<Property> itrbl) {
        return propertyRepository.saveAll(itrbl);
    }

    @Override
    public void flush() {
        propertyRepository.flush();
    }

    @Override
    public Property saveAndFlush(Property s) {
        return propertyRepository.saveAndFlush(s);
    }

    @Override
    public void deleteInBatch(Iterable<Property> itrbl) {
        propertyRepository.deleteInBatch(itrbl);
    }

    @Override
    public void deleteAllInBatch() {
        propertyRepository.deleteAllInBatch();
    }

    @Override
    public Property getOne(Long id) {
        return propertyRepository.getOne(id);
    }

}
