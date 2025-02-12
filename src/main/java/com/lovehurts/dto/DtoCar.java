package com.lovehurts.dto;

import com.lovehurts.enums.CarStatusType;
import com.lovehurts.enums.CurrencyType;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class DtoCar extends DtoBase{

    private String plaka;

    private String brand;

    private String model;

    private Integer productionYear;

    private CurrencyType currencyType;

    private BigDecimal damagePrice;

    private CarStatusType carStatusType;
}
