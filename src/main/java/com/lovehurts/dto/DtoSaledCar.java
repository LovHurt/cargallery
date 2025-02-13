package com.lovehurts.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DtoSaledCar extends DtoBase {

    private DtoCustomer customer;

    private DtoCar car;

    private DtoGallerist gallerist;
}
