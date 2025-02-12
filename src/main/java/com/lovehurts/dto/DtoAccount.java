package com.lovehurts.dto;

import com.lovehurts.enums.CurrencyType;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class DtoAccount extends DtoBase {

    @NotNull
    private String accountNo;
    @NotNull
    private String iban;
    @NotNull
    private BigDecimal amount;
    @NotNull
    private CurrencyType currencyType;
}
