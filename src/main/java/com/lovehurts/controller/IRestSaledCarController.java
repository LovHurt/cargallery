package com.lovehurts.controller;

import com.lovehurts.dto.DtoSaledCar;
import com.lovehurts.dto.DtoSaledCarIU;

public interface IRestSaledCarController {

    public RootEntity<DtoSaledCar> buyCar(DtoSaledCarIU dtoSaledCarIU);
}
