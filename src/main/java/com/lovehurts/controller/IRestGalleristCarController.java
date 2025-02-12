package com.lovehurts.controller;

import com.lovehurts.dto.DtoGalleristCar;
import com.lovehurts.dto.DtoGalleristCarIU;

public interface IRestGalleristCarController {
    public RootEntity<DtoGalleristCar> saveGalleristCar(DtoGalleristCarIU dtoGalleristCarIU);
}
