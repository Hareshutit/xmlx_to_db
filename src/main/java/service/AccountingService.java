package service;

import repository.AccountingRepository;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import  org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

import model.Accounting;

@Service
public class AccountingService {

    @Resource
    private final AccountingRepository repository;

    @Autowired
    public AccountingService(AccountingRepository repository) {
        this.repository = repository;
        }
    
    @Transactional
    public Accounting createAccounting(Accounting acc) {
            System.out.println("dwdwdw2  " + acc.getId());
            return repository.save(acc);
        }
}
