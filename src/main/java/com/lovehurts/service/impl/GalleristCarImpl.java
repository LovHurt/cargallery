package com.lovehurts.service.impl;

import com.lovehurts.dto.*;
import com.lovehurts.exception.BaseException;
import com.lovehurts.exception.ErrorMessage;
import com.lovehurts.exception.MessageType;
import com.lovehurts.model.Car;
import com.lovehurts.model.Gallerist;
import com.lovehurts.model.GalleristCar;
import com.lovehurts.repository.CarRepository;
import com.lovehurts.repository.GalleristCarRepository;
import com.lovehurts.repository.GalleristRepository;
import com.lovehurts.service.IGalleristCarService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Service
public class GalleristCarImpl implements IGalleristCarService {

    @Autowired
    private GalleristCarRepository GalleristCarRepository;
    @Autowired
    private GalleristRepository galleristRepository;
    @Autowired
    private CarRepository carRepository;

    private GalleristCar createGalleristCar(DtoGalleristCarIU dtoGalleristCarIU) {
        Optional<Gallerist> optGallerist = galleristRepository.findById(dtoGalleristCarIU.getGalleristId());
        if (optGallerist.isEmpty())
            throw new BaseException(new ErrorMessage(MessageType.NO_RECORD_EXIST, dtoGalleristCarIU.getGalleristId().toString()));

        Optional<Car> optCar = carRepository.findById(dtoGalleristCarIU.getCarId());
        if (optCar.isEmpty())
            throw new BaseException(new ErrorMessage(MessageType.NO_RECORD_EXIST, dtoGalleristCarIU.getCarId().toString()));


        GalleristCar galleristCar = new GalleristCar();
        galleristCar.setCreateTime(new Date());
        galleristCar.setGallerist(optGallerist.get());
        galleristCar.setCar(optCar.get());
        return galleristCar;
    }

    @Override
    public DtoGalleristCar saveGalleristCar(DtoGalleristCarIU dtoGalleristCarIU) {
        DtoGalleristCar dtoGalleristCar = new DtoGalleristCar();
        DtoGallerist dtoGallerist = new DtoGallerist();
        DtoCar dtoCar = new DtoCar();
        DtoAddress dtoAddress = new DtoAddress();

        GalleristCar savedGalleristCar = GalleristCarRepository.save(createGalleristCar(dtoGalleristCarIU));

        BeanUtils.copyProperties(savedGalleristCar, dtoGalleristCar);
        BeanUtils.copyProperties(savedGalleristCar.getGallerist(), dtoGallerist);
        BeanUtils.copyProperties(savedGalleristCar.getCar(), dtoCar);
        BeanUtils.copyProperties(savedGalleristCar.getGallerist().getAddress(), dtoAddress);

        dtoGallerist.setAddress(dtoAddress);
        dtoGalleristCar.setCar(dtoCar);
        dtoGalleristCar.setGallerist(dtoGallerist);

        return dtoGalleristCar;
    }
}
