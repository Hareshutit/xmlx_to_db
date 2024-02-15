package controller;

import java.time.LocalDate;

import com.poiji.annotation.ExcelCellName;
import com.poiji.annotation.ExcelSheet;
import model.Accounting;

@ExcelSheet("Sheet1")
public class AccountingController {
  @ExcelCellName("iD УУ")
  Long id;

  @ExcelCellName("Инвентарный номер")
  String reg_number;

  @ExcelCellName("БТИ")
  Long address_id;

  @ExcelCellName("Уточнение")
  String address_info;

  @ExcelCellName("Адрес")
  String address_desc;

  @ExcelCellName("Адрес")
  String description;

  @ExcelCellName("Дата создания")
  LocalDate   created;

  @ExcelCellName("ДКУ")
  Integer contract_num;

  @ExcelCellName("ЦТП")
  String heat_station;

  public Accounting toAccounting(Accounting acc) {
    acc.setId(id);
    acc.setReg_number(reg_number);
    acc.setAddress_id(address_id);
    acc.setAddress_info(address_info);
    acc.setAddress_desc(address_desc);
    acc.setDescription(description);
    acc.setCreated(created);
    acc.setContract_num(contract_num);
    acc.setHeat_station(heat_station);

    return acc;
  }

  @Override
  public String toString() {
    return "AccountingController [id=" + id + ", reg_number=" + reg_number + ", address_id=" + address_id
        + ", address_info=" + address_info + ", address_desc=" + address_desc + ", description=" + description
        + ", created=" + created + ", contract_num=" + contract_num + ", heat_station=" + heat_station + "]";
  }

  
}
