package com.lue.service;

import com.lue.model.AgeGroup;
import com.lue.model.Agent;
import java.util.List;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;

/**
 *
 * @author
 */
public interface AgentService {
    
    public List<Agent> findAll();

    public List<Agent> findAll(Sort sort);

    public List<Agent> saveAll(Iterable<Agent> itrbl);

    public void flush();

    public Agent saveAndFlush(Agent s);

    public void deleteInBatch(Iterable<Agent> itrbl);

    public void deleteAllInBatch();

    public Agent getOne(Long id);
}
