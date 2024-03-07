package model;




import javax.persistence.*;

import com.poiji.annotation.ExcelCellName;

import java.time.LocalDate;
import java.math.BigDecimal;

@Entity
@Table(name = "MEASURE_OBJECT")
public class Accounting {
  @Id
  @Column(name = "ID",nullable=false)
  BigDecimal id;

  @Column(name = "REG_NUMBER", length = 1024)
  String reg_number;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "ADDRESS_ID", nullable = false)
  BTI address_id;

  @Column(name = "ADDRESS_INFO")
  String address_info;

  @Column(name ="ADDRESS_DESC", nullable = false)
  String address_desc;

  @Column(name ="DESCRIPTION")
  String description;

  @Column(name ="CREATED", nullable = false)
  LocalDate   created;

  @Column(name ="CONTRACT_NUM")
  String contract_num;

  @Column(name ="HEAT_STATION")
  String heat_station;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "STATE_ID", nullable = false)
  NSISTATE state_id;

  @Column(name ="STATE_DATE", nullable = false)
  LocalDate   state_date;

  public BigDecimal getId() {
    return id;
  }


  public void setId(BigDecimal id) {
    this.id = id;
  }


  public String getReg_number() {
    return reg_number;
  }


  public void setReg_number(String reg_number) {
    this.reg_number = reg_number;
  }


  public BTI getAddress_id() {
    return address_id;
  }


  public void setAddress_id(BTI address_id) {
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


  public String getContract_num() {
    return contract_num;
  }


  public void setContract_num(String contract_num) {
    this.contract_num = contract_num;
  }


  public String getHeat_station() {
    return heat_station;
  }


  public void setHeat_station(String heat_station) {
    this.heat_station = heat_station;
  }

  


  public LocalDate getState_date() {
    return state_date;
  }


  public void setState_date(LocalDate state_date) {
    this.state_date = state_date;
  }





  public Accounting(BigDecimal id, String reg_number, BTI address_id, String address_info, String address_desc,
      String description, LocalDate created, String contract_num, String heat_station, NSISTATE state_id,
      LocalDate state_date) {
    this.id = id;
    this.reg_number = reg_number;
    this.address_id = address_id;
    this.address_info = address_info;
    this.address_desc = address_desc;
    this.description = description;
    this.created = created;
    this.contract_num = contract_num;
    this.heat_station = heat_station;
    this.state_id = state_id;
    this.state_date = state_date;
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
  this.state_id = null;
  this.state_date = null;
}


  public NSISTATE getState_id() {
    return state_id;
  }


  public void setState_id(NSISTATE state_id) {
    this.state_id = state_id;
  }

}
