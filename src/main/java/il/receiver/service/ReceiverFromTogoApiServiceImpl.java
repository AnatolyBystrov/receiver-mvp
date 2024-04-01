package il.receiver.service;

import il.receiver.external.TogoApiService;
import il.receiver.external.dto.parkings.GetParkingsResponse;
import il.receiver.external.dto.singleA2A.SearchA2ASingleInput;
import il.receiver.external.dto.carsV2.CarsV2Response;
import il.receiver.external.dto.freeParkings.FreeParkingInput;
import il.receiver.external.dto.getInfoUnicCar.GetInfoUnicInput;
import il.receiver.external.dto.v2get.FreeVehiclesV2Input;
import il.receiver.external.dto.vflat.FreeFlatInput;
import il.receiver.util.MvpTemporaryDataUtil;
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

        togoApiService.receiveFreeVehicles(MvpTemporaryDataUtil.createFreeFlatInput());
    }

    @Override
    public void receiveVehiclesV2(){

//         TODO:: create method and try to receive data by given fields in objects

//        togoApiService.receiveVehiclesV2(freeVehiclesV2Input);

    }
    @Override
    public void receiveFreeParking(){

//        togoApiService.receiveFreeParking(freeParkingInput);
    }
    @Override
    public void receiveUnicCarInfo(){


    }
    @Override
    public void getParkings(){

    }

    @Override
    public void getSingleA2A(){

    }
}
