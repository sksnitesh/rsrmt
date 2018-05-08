package com.lue.service;

import com.lue.model.Finance;
import java.util.List;
import org.springframework.data.domain.Sort;

/**
 *
 * @author
 */
public interface FinanceService {

    public List<Finance> findAll();

    public List<Finance> findAll(Sort sort);

    public List<Finance> saveAll(Iterable<Finance> itrbl);

    public void flush();

    public Finance saveAndFlush(Finance s);

    public void deleteInBatch(Iterable<Finance> itrbl);

    public void deleteAllInBatch();

    public Finance getOne(Long id);

}
