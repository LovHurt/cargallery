package com.lovehurts.service;

import com.lovehurts.dto.DtoCar;
import com.lovehurts.dto.DtoCarIU;

public interface ICarService {
    public DtoCar saveCar(DtoCarIU dtoCarIU);
}
