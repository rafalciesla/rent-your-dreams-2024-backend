package pl.ciesla.ryd.cars.web.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import pl.ciesla.ryd.cars.model.Car
import pl.ciesla.ryd.cars.service.CarService
import pl.ciesla.ryd.cars.web.dto.CarDTO
import pl.ciesla.ryd.lib.web.controller.RYDController

@RestController
@RequestMapping("/v1/cars")
class CarController(
    service: CarService
) : RYDController<Car, CarDTO>(service) {
}