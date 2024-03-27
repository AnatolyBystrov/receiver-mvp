package il.receiver.service;

import il.receiver.external.TogoApiService;
import il.receiver.external.dto.Parkings.GetParkingsResponse;
import il.receiver.external.dto.SingleA2A.SearchA2ASingleInput;
import il.receiver.external.dto.carsV2.CarsV2Response;
import il.receiver.external.dto.freeParkings.FreeParkingInput;
import il.receiver.external.dto.getInfoUnicCar.GetInfoUnicInput;
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

        togoApiService.receiveFreeVehicles(freeFlatInput);
    }

    @Override
    public void receiveVehiclesV2(){
        FreeVehiclesV2Input freeVehiclesV2Input = new FreeVehiclesV2Input();
        freeVehiclesV2Input.setStartDate(null);
        freeVehiclesV2Input.setEndDate(null);
        freeVehiclesV2Input.setZoom(32);
        freeVehiclesV2Input.setVType(32);
        freeVehiclesV2Input.setCategoryId(32);
        freeVehiclesV2Input.setLatitude(null);
        freeVehiclesV2Input.setLongitude(null);
        freeVehiclesV2Input.setRequestType(null);

        togoApiService.receiveVehiclesV2(freeVehiclesV2Input);

    }
    @Override
    public void receiveFreeParking(){
        FreeParkingInput freeParkingInput = new FreeParkingInput();
        freeParkingInput.setLatitude(null);
        freeParkingInput.setLongitude(null);
        freeParkingInput.setModalityId(32);
        freeParkingInput.setRadiusInKilometer(null);
        freeParkingInput.setVType(null);

        togoApiService.receiveFreeParking(freeParkingInput);
    }
    @Override
    public void receiveUnicCarInfo(){
        GetInfoUnicInput getInfoUnicInput = new GetInfoUnicInput();
        getInfoUnicInput.setProjectType(32);
        getInfoUnicInput.setValue(null);
        getInfoUnicInput.setExternalLicensePlate(null);
        getInfoUnicInput.setVType(32);

        togoApiService.receiveUnicCarInfo(getInfoUnicInput);

    }
    @Override
    public void getParkings(){
        GetParkingsResponse getParkings = new GetParkingsResponse();
        getParkings.setId(32);
        getParkings.setAddress(null);
        getParkings.setLatitude(null);
        getParkings.setLongitude(null);
        getParkings.setFleetType(32);
        getParkings.setFleetTypeText(null);
        getParkings.setStatus(32);
        getParkings.setCapacity(32);
        getParkings.setIsElectric(null);
        getParkings.setNotes(null);
        getParkings.setModality(32);
    }

    @Override
    public void getSingleA2A(){
        SearchA2ASingleInput searchA2ASingleInput = new SearchA2ASingleInput();
        searchA2ASingleInput.getStartDate();
        searchA2ASingleInput.getEndDate();
        searchA2ASingleInput.getVehicleId();
        searchA2ASingleInput.getCategoryId();
        searchA2ASingleInput.getLongitude();
        searchA2ASingleInput.getLatitude();
        searchA2ASingleInput.getSearchSource();
    }
}
