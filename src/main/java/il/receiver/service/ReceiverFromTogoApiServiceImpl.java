package il.receiver.service;

import il.receiver.external.TogoApiService;
import il.receiver.models.CarsV2Response;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
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
}
