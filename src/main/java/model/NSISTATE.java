package model;

import javax.persistence.*;

import com.poiji.annotation.ExcelCellName;

import java.time.LocalDate;
import java.math.BigDecimal;

@Entity
@Table(name = "NSI_STATE")
public class NSISTATE {
  @Id
  @Column(name = "ID",nullable=false)
  BigDecimal id = new BigDecimal(6000027);

  //@Column(name = "CODE", length = 128)
  //String code;

  //@Column(name = "NAME", length = 1024)
  //String name;

  @OneToOne(mappedBy = "address_id")
  Accounting acc;

}
