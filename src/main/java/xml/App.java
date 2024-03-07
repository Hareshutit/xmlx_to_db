package xml;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import java.util.List;

import org.apache.poi.sl.usermodel.ObjectMetaData.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.poiji.bind.Poiji;
import com.poiji.exception.PoijiExcelType;
import com.poiji.option.PoijiOptions;

import controller.AccountingController;
import service.AccountingService;
import service.BTIService;
import service.ResultService;
import model.Accounting;
import model.BTI;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "repository")
@EntityScan(basePackages = "model")
@ComponentScan(basePackages = { "repository", "service"})
public class App {
  
  private final AccountingService serviceACC;
  private final BTIService serviceBTI;
  
  @Autowired
  public App(AccountingService serviceACC, BTIService serviceBTI) {
    this.serviceACC = serviceACC;
    this.serviceBTI = serviceBTI;
    }
  
  public static void main(String[] args) throws FileNotFoundException {
    PoijiOptions options = PoijiOptions.PoijiOptionsBuilder.settings()
        .addListDelimiter(";")
        .build();
    InputStream stream = new FileInputStream(new File("./","employees.xlsx"));
    List<AccountingController> employees = Poiji.fromExcel(stream, PoijiExcelType.XLSX, AccountingController.class, options);
    ApplicationContext ctx =  SpringApplication.run(App.class, args);
    AccountingService team = ctx.getBean(AccountingService.class);
    for (int i = 1; i < employees.size(); i++) {
      Accounting acc = new Accounting();
      AccountingController firstEmployee = employees.get(i);
      Accounting res = firstEmployee.toAccounting(acc); // Снова, предполагается что это должно быть внутри цикла
      team.createAccounting(res);
  }
  }
}
