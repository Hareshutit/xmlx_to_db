package controller;

import java.math.BigDecimal;

import com.poiji.annotation.ExcelCellName;
import com.poiji.annotation.ExcelSheet;

@ExcelSheet("Export Worksheet")
public class MeasurePointController {
    @ExcelCellName("ТУ_ID")
    BigDecimal id;
}
