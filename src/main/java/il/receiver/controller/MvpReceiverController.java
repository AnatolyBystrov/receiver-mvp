package il.receiver.controller;


import il.receiver.controller.dto.FreeCarsResponse;
import il.receiver.repository.TogoReceiverRepository;
import il.receiver.repository.dto.FleetFreeCars;
import il.receiver.service.MvpReceiverService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class MvpReceiverController {

    //TODO:: this part also can be changed or renamed(this about this)
    private final MvpReceiverService mvpReceiverService;

    @GetMapping("/get-free-cars-location")
    public FreeCarsResponse receiveFreeCars(String startDate, String endDate, Double longitude, Double latitude) {

        return mvpReceiverService.receiveAllFreeCar(startDate, endDate, longitude, latitude);
    }

    @GetMapping("/get-all-cars-location")
    public FreeCarsResponse receiveAllCars(Integer zoom, Integer requestType, Boolean isALLRegion) {

        return mvpReceiverService.receiveAllCar(zoom, requestType, isALLRegion);
    }
}