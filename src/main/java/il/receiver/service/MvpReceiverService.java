package il.receiver.service;

import il.receiver.controller.dto.FreeCarsResponse;

public interface MvpReceiverService {
    FreeCarsResponse receiveAllFreeCar(String startDate, String endDate, Double longitude, Double latitude);
    FreeCarsResponse receiveAllCar(Integer zoom, Integer requestType, Boolean isALLRegion);
}
