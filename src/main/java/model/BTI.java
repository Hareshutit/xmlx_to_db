package model;

import javax.persistence.*;

import com.poiji.annotation.ExcelCellName;

import java.time.LocalDate;
import java.math.BigDecimal;

@Entity
@Table(name = "BTI_TREE")
public class BTI {
  @Id
  @Column(name = "ID",nullable=false)
  BigDecimal id;

  @Column(name = "PARENT_ID")
  BigDecimal parent_id;


  public BigDecimal getId() {
      return id;
  }

  public void setId(BigDecimal id) {
      this.id = id;
  }

  public BigDecimal getParent_id() {
      return parent_id;
  }

  public void setParent_id(BigDecimal parent_id) {
      this.parent_id = parent_id;
  }

  public BTI(BigDecimal id, BigDecimal parent_id) {
      this.id = id;
      this.parent_id = parent_id;
  }

  public BTI() {
    this.id = null;
    this.parent_id = null;
}




}
