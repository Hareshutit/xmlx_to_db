package model;




import javax.persistence.*;

import com.poiji.annotation.ExcelCellName;

import java.time.LocalDate;

@Entity
@Table(name = "MEASURE_OBJECT")
public class Accounting {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID",nullable=false)
  Long id;

  @Column(name = "REG_NUMBER")
  String reg_number;

  @Column(name = "ADDRESS_ID")
  Long address_id;

  @ExcelCellName("ADDRESS_INFO")
  String address_info;

  @ExcelCellName("ADDRESS_DESC")
  String address_desc;

  @ExcelCellName("DESCRIPTION")
  String description;

  @ExcelCellName("CREATED")
  LocalDate   created;

  @ExcelCellName("CONTRACT_NUM")
  Integer contract_num;

  @ExcelCellName("HEAT_STATION")
  String heat_station;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getReg_number() {
    return reg_number;
  }

  public void setReg_number(String reg_number) {
    this.reg_number = reg_number;
  }

  public Long getAddress_id() {
    return address_id;
  }

  public void setAddress_id(Long address_id) {
    this.address_id = address_id;
  }

  public String getAddress_info() {
    return address_info;
  }

  public void setAddress_info(String address_info) {
    this.address_info = address_info;
  }

  public String getAddress_desc() {
    return address_desc;
  }

  public void setAddress_desc(String address_desc) {
    this.address_desc = address_desc;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public LocalDate getCreated() {
    return created;
  }

  public void setCreated(LocalDate created) {
    this.created = created;
  }

  public Integer getContract_num() {
    return contract_num;
  }

  public void setContract_num(Integer contract_num) {
    this.contract_num = contract_num;
  }

  public String getHeat_station() {
    return heat_station;
  }

  public void setHeat_station(String heat_station) {
    this.heat_station = heat_station;
  }

  public Accounting(Long id, String reg_number, Long address_id, String address_info, String address_desc,
      String description, LocalDate created, Integer contract_num, String heat_station) {
    this.id = id;
    this.reg_number = reg_number;
    this.address_id = address_id;
    this.address_info = address_info;
    this.address_desc = address_desc;
    this.description = description;
    this.created = created;
    this.contract_num = contract_num;
    this.heat_station = heat_station;
  }

  public Accounting() {
  this.id = null;
  this.reg_number = null;
  this.address_id = null;
  this.address_info = null;
  this.address_desc = null;
  this.description = null;
  this.created = null;
  this.contract_num = null;
  this.heat_station = null;
}

  @Override
  public String toString() {
    return "Accounting [id=" + id + ", reg_number=" + reg_number + ", address_id=" + address_id + ", address_info="
        + address_info + ", address_desc=" + address_desc + ", description=" + description + ", created=" + created
        + ", contract_num=" + contract_num + ", heat_station=" + heat_station + "]";
  }

}
