package controller;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Random;

import com.poiji.annotation.ExcelCellName;
import com.poiji.annotation.ExcelSheet;
import model.Accounting;

@FunctionalInterface
interface Generater<T> {
  T generate();
}

@ExcelSheet("Sheet1")
public class AccountingController {
  @ExcelCellName("iD УУ")
  BigDecimal id;

  @ExcelCellName("Инвентарный номер")
  String reg_number;

  @ExcelCellName("БТИ")
  BigDecimal address_id;

  @ExcelCellName("Уточнение")
  String address_info;

  @ExcelCellName("Адрес")
  String address_desc;

  @ExcelCellName("Адрес")
  String description;

  @ExcelCellName("Дата создания")
  LocalDate   created;

  @ExcelCellName("ДКУ")
  String contract_num;

  @ExcelCellName("ЦТП")
  String heat_station;

  BigDecimal block_level;

  BigDecimal working_uspd_state_exist;

  private static LocalDate generateLocalDate() {
    // Определяем начальную и конечную даты интервала
    LocalDate startDate = LocalDate.of(2000, 1, 1);
    LocalDate endDate = LocalDate.now(); // Сегодняшняя дата

    // Вычисляем количество дней между начальной и конечной датами
    long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);

    // Создаем объект Random для генерации случайного числа
    Random random = new Random();

    // Генерируем случайное количество дней для добавления к начальной дате
    long randomDays = (long) (random.nextDouble() * daysBetween);

    // Добавляем случайное количество дней к начальной дате
    LocalDate randomDate = startDate.plusDays(randomDays);
    return randomDate;
  }

  private static BigDecimal generateBigDecimal() {
    BigDecimal min = new BigDecimal("10000000");
    BigDecimal max = new BigDecimal("99999999");

    BigDecimal randomBigDecimal = min.add(new BigDecimal(Math.random()).multiply(max.subtract(min)));

    randomBigDecimal = randomBigDecimal.setScale(0, BigDecimal.ROUND_DOWN);
    return randomBigDecimal;
  }

  private static String generateString() {
    // Определяем набор символов, из которых будет сгенерирована строка
    String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    // Указываем длину генерируемой строки
    int length = 8;

    // Создаем объект Random для генерации случайных чисел
    Random random = new Random();

    // Создаем StringBuilder для построения строки
    StringBuilder sb = new StringBuilder();

    // Генерируем строку заданной длины
    for (int i = 0; i < length; i++) {
        // Выбираем случайный индекс из строки characters
        int index = random.nextInt(characters.length());

        // Добавляем выбранный символ в StringBuilder
        sb.append(characters.charAt(index));
    }

    // Преобразуем StringBuilder в строку
    String randomString = sb.toString();

    return randomString;
  }

  private static <T> T getValue(T obj, Generater<T> g) {
    if (obj == null) {
      return g.generate();
    }
    return obj;
  }

  public Accounting toAccounting(Accounting acc) {
    Generater<BigDecimal> genBigDec = () -> generateBigDecimal();
    Generater<String> genStr = () -> generateString();
    Generater<LocalDate> genLocDat = () -> generateLocalDate();

    id = getValue(id, genBigDec);
    System.out.println("dwdwdw  " + id);
    acc.setId(id);

    reg_number = getValue(reg_number, genStr);
    acc.setReg_number(reg_number);

    address_id = getValue(address_id, genBigDec);
    acc.setAddress_id(address_id);

    address_info = getValue(address_info, genStr);
    acc.setAddress_info(address_info);

    address_desc = getValue(address_desc, genStr);
    acc.setAddress_desc(address_desc);
    
    description = getValue(description, genStr);
    acc.setDescription(description);

    created = getValue(created, genLocDat);
    acc.setCreated(created);

    contract_num = getValue(contract_num, genStr);
    acc.setContract_num(contract_num);

    heat_station = getValue(heat_station, genStr);
    acc.setHeat_station(heat_station);

    return acc;
  }

}
