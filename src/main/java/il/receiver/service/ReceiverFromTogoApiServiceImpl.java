package il.receiver.service;

import il.receiver.external.TogoApiService;
import il.receiver.external.dto.carsV2.CarsV2Response;
import il.receiver.external.dto.v2get.FreeVehiclesV2Input;
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
        freeFlatInput.setCategoryId(32);
        freeFlatInput.setLongitude(null);
        freeFlatInput.setLatitude(null);
        freeFlatInput.setStartDate(null);
        freeFlatInput.setEndDate(null);
        freeFlatInput.setZoom(16);
        freeFlatInput.setIsALLRegion(true);
        freeFlatInput.setRequestType(0);


        FreeVehiclesV2Input freeInput = new FreeVehiclesV2Input();
        //TODO: Тут я хочу, что бы ты разобрался со спосабами передачи данных в метод, который мы используем для получение данных из вашей базы
        //Тут пишу по русски, так как это важно не проебать  Один из ключевых моментов  На нем мы будем строить логику дальнейщего написания приложения

        //TODO: find correct invocation and try to use here: like in your task

        String startDate = "startDate";
        String endDate = "endDate";
        Integer zoom = 1;
        Integer vType = 2;
        Integer categoryId = 123;
        Double longitude = 3D;
        Double latitude = 10.0;
        String requestType =  "requestType";



        freeInput.setStartDate(startDate);
        freeInput.setEndDate(endDate);
        freeInput.setZoom(zoom);
        freeInput.setVType(vType);
        freeInput.setCategoryId(categoryId);
        freeInput.setLongitude(longitude);
        freeInput.setLatitude(latitude);
        freeInput.setRequestType(requestType);

        togoApiService.receiveVehicles(freeInput);
//        togoApiService.receiveFreeVehicles(freeFlatInput);
    }
}
