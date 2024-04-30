package il.receiver.controller;


import il.receiver.controller.dto.FreeCarsResponse;
import il.receiver.service.MvpReceiverService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class MvpReceiverController {
    private final MvpReceiverService mvpReceiverService;

    @GetMapping("/get-free-cars-location")
    public FreeCarsResponse receiveMvpData(String startDate, String endDate, Double longitude, Double latitude) {

        return mvpReceiverService.receiveAllFreeCar(startDate, endDate, longitude, latitude);
    }

}