package model;




import javax.persistence.*;

import com.poiji.annotation.ExcelCellName;

import java.time.LocalDate;
import java.math.BigDecimal;
import java.math.BigInteger;

@Entity
@Table(name = "MEASURE_OBJECT")
public class Accounting {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID",nullable=false)
  BigDecimal id;

  @Column(name = "REG_NUMBER", length = 1024)
  String reg_number;

  @Column(name = "ADDRESS_ID")
  BigDecimal address_id;

  @Column(name = "ADDRESS_INFO")
  String address_info;

  @Column(name ="ADDRESS_DESC")
  String address_desc;

  @Column(name ="DESCRIPTION")
  String description;

  @Column(name ="CREATED")
  LocalDate   created;

  @Column(name ="CONTRACT_NUM")
  String contract_num;

  @Column(name ="HEAT_STATION")
  String heat_station;
  
  @Column(name = "BLOCK_LEVEL")
  BigDecimal block_level;

  @Column(name = "WORKING_USPD_STATE_EXIST")
  BigDecimal working_uspd_state_exist;

  
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


  public BigDecimal getAddress_id() {
    return address_id;
  }


  public void setAddress_id(BigDecimal address_id) {
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


  public BigDecimal getBlock_level() {
    return block_level;
  }


  public void setBlock_level(BigDecimal block_level) {
    this.block_level = block_level;
  }


  public BigDecimal getWorking_uspd_state_exist() {
    return working_uspd_state_exist;
  }


  public void setWorking_uspd_state_exist(BigDecimal working_uspd_state_exist) {
    this.working_uspd_state_exist = working_uspd_state_exist;
  }


  public Accounting(BigDecimal id, String reg_number, BigDecimal address_id, String address_info, String address_desc,
      String description, LocalDate created, String contract_num, String heat_station, BigDecimal block_level,
      BigDecimal working_uspd_state_exist) {
    this.id = id;
    this.reg_number = reg_number;
    this.address_id = address_id;
    this.address_info = address_info;
    this.address_desc = address_desc;
    this.description = description;
    this.created = created;
    this.contract_num = contract_num;
    this.heat_station = heat_station;
    this.block_level = block_level;
    this.working_uspd_state_exist = working_uspd_state_exist;
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
  this.block_level = new BigDecimal(0);
  this.working_uspd_state_exist = new BigDecimal(1);
}

}
