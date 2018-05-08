package com.lue.service;

import com.lue.model.Agent;
import com.lue.repository.AgentRepository;
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
public class AgentServiceImpl implements AgentService {

    @Autowired
    private AgentRepository agentRepository;

    @Override
    public List<Agent> findAll() {
        return agentRepository.findAll();
    }

    @Override
    public List<Agent> findAll(Sort sort) {
        return agentRepository.findAll(sort);
    }

    @Override
    public List<Agent> saveAll(Iterable<Agent> itrbl) {
        return agentRepository.saveAll(itrbl);
    }

    @Override
    public void flush() {
        agentRepository.flush();
    }

    @Override
    public Agent saveAndFlush(Agent s) {
        return agentRepository.saveAndFlush(s);
    }

    @Override
    public void deleteInBatch(Iterable<Agent> itrbl) {
        agentRepository.deleteInBatch(itrbl);
    }

    @Override
    public void deleteAllInBatch() {
        agentRepository.deleteAllInBatch();
    }

    @Override
    public Agent getOne(Long id) {
        return agentRepository.getOne(id);
    }

}
