package il.receiver.service;

import il.receiver.controller.dto.FreeCarsResponse;
import il.receiver.external.TogoApiService;
import il.receiver.external.dto.vflat.FreeFlatInput;
import il.receiver.external.dto.vflat.FreeVFlatResponse;
import il.receiver.mapper.FreeVFlatMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class ReceiverFromTogoApiServiceImpl implements MvpReceiverService {

    private final TogoApiService togoApiService;
    private final FreeVFlatMapper freeVFlatMapper;


    @Override
    public FreeCarsResponse receiveAllFreeCar(String startDate, String endDate, Double longitude, Double latitude) {

        FreeFlatInput freeFlatInput = freeVFlatMapper.toFreeFlatInput(startDate, endDate, longitude, latitude);
        FreeVFlatResponse freeVFlatResponse = togoApiService.receiveFreeVehicles(freeFlatInput);

        return freeVFlatMapper.toFreeCarsResponse(freeVFlatResponse);
    }

}
