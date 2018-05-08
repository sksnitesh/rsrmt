package com.lue.service;

import com.lue.model.Lang;
import com.lue.model.PriceRange;
import java.util.List;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;

/**
 *
 * @author
 */
public interface PriceRangeService {

    public List<PriceRange> findAll();

    public List<PriceRange> findAll(Sort sort);

    public List<PriceRange> saveAll(Iterable<PriceRange> itrbl);

    public void flush();

    public PriceRange saveAndFlush(PriceRange s);

    public void deleteInBatch(Iterable<PriceRange> itrbl);

    public void deleteAllInBatch();

    public PriceRange getOne(Long id);

}
