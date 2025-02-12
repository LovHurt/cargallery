package com.lovehurts.service;

import com.lovehurts.dto.DtoGalleristCar;
import com.lovehurts.dto.DtoGalleristCarIU;

public interface IGalleristCarService {

    public DtoGalleristCar saveGalleristCar(DtoGalleristCarIU dtoGalleristCarIU);
}
