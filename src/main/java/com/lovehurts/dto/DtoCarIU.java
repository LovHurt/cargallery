package com.lovehurts.dto;

import com.lovehurts.enums.CarStatusType;
import com.lovehurts.enums.CurrencyType;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class DtoCarIU {

    @NotNull
    private String plaka;
    @NotNull
    private String brand;

    @NotNull
    private String model;

    @NotNull
    private Integer productionYear;

    @NotNull
    private CurrencyType currencyType;

    @NotNull
    private BigDecimal damagePrice;

    @NotNull
    private CarStatusType carStatusType;
}
