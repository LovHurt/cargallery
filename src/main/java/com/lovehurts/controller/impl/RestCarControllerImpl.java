package com.lovehurts.controller.impl;

import com.lovehurts.controller.IRestCarController;
import com.lovehurts.controller.RestBaseController;
import com.lovehurts.controller.RootEntity;
import com.lovehurts.dto.DtoCar;
import com.lovehurts.dto.DtoCarIU;
import com.lovehurts.service.ICarService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/api/car")
public class RestCarControllerImpl extends RestBaseController implements IRestCarController {

    @Autowired
    private ICarService carService;

    @PostMapping("/save")
    @Override
    public RootEntity<DtoCar> saveCar(@Valid @RequestBody DtoCarIU dtoCarIU) {
        return  ok(carService.saveCar(dtoCarIU));
    }
}
