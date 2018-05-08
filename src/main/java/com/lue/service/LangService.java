package com.lue.service;

import com.lue.model.Gender;
import com.lue.model.Lang;
import java.util.List;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;

/**
 *
 * @author
 */
public interface LangService {
    
    public List<Lang> findAll();

    public List<Lang> findAll(Sort sort);

    public List<Lang> saveAll(Iterable<Lang> itrbl);

    public void flush();

    public Lang saveAndFlush(Lang s);

    public void deleteInBatch(Iterable<Lang> itrbl);

    public void deleteAllInBatch();

    public Lang getOne(Long id);
    
}
