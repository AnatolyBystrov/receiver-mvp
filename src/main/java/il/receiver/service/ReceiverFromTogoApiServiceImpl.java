package il.receiver.service;

import il.receiver.external.TogoApiService;
import il.receiver.external.dto.carsV2.CarsV2Response;
import il.receiver.external.dto.vflat.FreeFlatInput;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class ReceiverFromTogoApiServiceImpl implements MvpReceiverService {

    private final TogoApiService togoApiService;

    @Override
    public void invokeTheMainApiTogo() {

        Integer projectType = 1;
        String cars = "cars";
        Integer vType = 11;
        String licencePlate = "licencePlate";


        CarsV2Response response = togoApiService.receiveCardsData(projectType, cars, vType, licencePlate);

        log.info("");
    }

    @Override
    public void invokeVFlatTogo() {
        FreeFlatInput freeFlatInput = new FreeFlatInput();

        //TODO:: this part
        freeFlatInput.setZoom(16);


        togoApiService.receiveFreeVehicles(null);
    }
}
