package com.elifcan.carrentproject.controller;

import com.elifcan.carrentproject.dto.request.DoRegisterRequestDto;
import com.elifcan.carrentproject.dto.response.BaseResponse;
import com.elifcan.carrentproject.entity.Car;
import com.elifcan.carrentproject.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.elifcan.carrentproject.config.RestApis.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(CAR)
public class CarController {

    private final CarService carService;

    @PostMapping(REGISTER)
    public ResponseEntity<BaseResponse<Car>> register(@RequestBody DoRegisterRequestDto dto){
       Car car = carService.doRegister(dto);
       return ResponseEntity.ok(BaseResponse.<Car>builder()
                       .code(1000)
                       .isSuccess(true)
                       .message("Car is registered successfully")
                       .data(car)
               .build());
    }

    @GetMapping(LIST)
    public ResponseEntity<BaseResponse<List<Car>>> list(){
        List<Car> carList = carService.getAll();
        return ResponseEntity.ok(BaseResponse.<List<Car>>builder()
                        .code(1000)
                        .isSuccess(true)
                        .message("Cars are listed below.")
                        .data(carList)
                .build());
    }

    @GetMapping(CAR_BY_BRAND)
    public ResponseEntity<BaseResponse<List<Car>>> getCarByBrand(String brand){
        List<Car> carList = carService.getCarByBrand(brand);
        return ResponseEntity.ok(BaseResponse.<List<Car>>builder()
                        .code(1000)
                        .isSuccess(true)
                        .message( brand + " brand cars are listed below.")
                        .data(carList)
                .build());
    }

    @GetMapping(CAR_BY_COLOR)
    public ResponseEntity<BaseResponse<List<Car>>> getCarByColor(String color){
        List<Car> carList = carService.getCarByColor(color);
        return ResponseEntity.ok(BaseResponse.<List<Car>>builder()
                        .code(1000)
                        .isSuccess(true)
                        .message(color + " color cars are listed below.")
                        .data(carList)
                .build());
    }
}
