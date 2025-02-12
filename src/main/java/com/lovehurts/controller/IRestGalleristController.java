package com.lovehurts.controller;

import com.lovehurts.dto.DtoGallerist;
import com.lovehurts.dto.DtoGalleristIU;

public interface IRestGalleristController {

    public RootEntity<DtoGallerist> savegallerist(DtoGalleristIU dtoGalleristIU);
}
