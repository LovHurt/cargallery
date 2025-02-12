package com.lovehurts.controller;

import com.lovehurts.dto.DtoCar;
import com.lovehurts.dto.DtoCarIU;

public interface IRestCarController {
    public RootEntity<DtoCar> saveCar(DtoCarIU dtoCarIU);
}
