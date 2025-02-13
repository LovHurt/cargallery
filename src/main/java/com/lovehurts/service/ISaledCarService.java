package com.lovehurts.service;

import com.lovehurts.dto.DtoSaledCar;
import com.lovehurts.dto.DtoSaledCarIU;

public interface ISaledCarService {

    public DtoSaledCar buyCar(DtoSaledCarIU dtoSaledCarIU);
}
