package service;

import repository.BTIRepository;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import  org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

import model.BTI;

@Service
public class BTIService {
    @Resource
    private final BTIRepository repository;

    @Autowired
    public BTIService(BTIRepository repository) {
        this.repository = repository;
        }
    
    @Transactional
    public BTI createBTI(BTI acc) {
            return repository.save(acc);
        }
}
