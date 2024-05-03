package il.receiver.service;

import il.receiver.controller.dto.FreeCarsResponse;
import il.receiver.external.TogoApiService;
import il.receiver.external.dto.vflat.FreeFlatInput;
import il.receiver.external.dto.vflat.FreeVFlatResponse;
import il.receiver.mapper.FreeVFlatMapper;
import il.receiver.repository.dao.TogoFreeCarInformationDao;
import il.receiver.repository.dto.FleetFreeCars;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
@RequiredArgsConstructor
public class ReceiverFromTogoApiServiceImpl implements MvpReceiverService {

    private final TogoApiService togoApiService;
    private final FreeVFlatMapper freeVFlatMapper;

    //TODO:: change calling from controller (adding a new service)
    // I do not sure for a moment, that this is the right place for this.
    private final TogoFreeCarInformationDao carInformationDao;



    @Override
    public FreeCarsResponse receiveAllFreeCar(String startDate, String endDate, Double longitude, Double latitude) {

        FreeFlatInput freeFlatInput = freeVFlatMapper.toFreeFlatInput(startDate, endDate, longitude, latitude);
        FreeVFlatResponse freeVFlatResponse = togoApiService.receiveFreeVehicles(freeFlatInput);

        //TODO:: I need you to understand this part and think wat's we need to change
        carInformationDao.saveFleetCars(new FleetFreeCars(
                UUID.randomUUID().toString(),
                freeVFlatResponse.getPoints(),
                freeVFlatResponse.getA2A(),
                freeVFlatResponse.getA2B()
        ));

        return freeVFlatMapper.toFreeCarsResponse(freeVFlatResponse);
    }

    @Override
    public FreeCarsResponse receiveAllCar(Integer zoom, Integer requestType, Boolean isALLRegion) {

        FreeFlatInput freeFlatInput = freeVFlatMapper.toAllFlatInput(zoom, requestType, isALLRegion);
        FreeVFlatResponse freeVFlatResponse = togoApiService.receiveFreeVehicles(freeFlatInput);

        return freeVFlatMapper.toFreeCarsResponse(freeVFlatResponse);
    }


}
