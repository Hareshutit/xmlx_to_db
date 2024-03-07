package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import  org.springframework.transaction.annotation.Transactional;

import java.util.List;

import controller.AccountingController;
import model.Accounting;
import model.BTI;

@Service
public class ResultService {
    private final AccountingService accountingService;
    private final BTIService btiService;

    @Autowired
    public ResultService(AccountingService accountingService, BTIService btiService) {
        this.accountingService = accountingService;
        this.btiService = btiService;
    }

    @Transactional
    public void createAccountingAndBTI(List<AccountingController> employees) {
        for (int i = 1; i < employees.size(); i++) {
            Accounting acc = new Accounting();
            AccountingController firstEmployee = employees.get(i);
            Accounting res = firstEmployee.toAccounting(acc); // Снова, предполагается что это должно быть внутри цикла
            BTI buf = new BTI();
            buf.setId(res.getId());
            btiService.createBTI(buf); // Предполагается, что эти методы уже аннотированы @Transactional
            accountingService.createAccounting(res);
        }
    }
}
