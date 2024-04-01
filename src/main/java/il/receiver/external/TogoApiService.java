package il.receiver.external;

import il.receiver.external.dto.parkings.GetParkingsResponse;
import il.receiver.external.dto.singleA2A.SearchA2ASingleInput;
import il.receiver.external.dto.carsV2.CarsV2Response;
import il.receiver.external.dto.freeParkings.FreeParkingInput;
import il.receiver.external.dto.freeParkings.FreeParkingResponse;
import il.receiver.external.dto.getInfoUnicCar.GetInfoUnicInput;
import il.receiver.external.dto.getInfoUnicCar.GetInfoUnicResponse;
import il.receiver.external.dto.v2get.FreeVehiclesV2Input;
import il.receiver.external.dto.v2get.FreeVehiclesV2Response;
import il.receiver.external.dto.vflat.FreeFlatInput;
import il.receiver.external.dto.vflat.FreeVFlatResponse;

public interface TogoApiService {
    CarsV2Response receiveCardsData(Integer projectType, String cars, Integer vType, String licencePlate);
    FreeVFlatResponse receiveFreeVehicles(FreeFlatInput freeFlatInput);
    FreeVehiclesV2Response receiveVehiclesV2(FreeVehiclesV2Input freeVehiclesV2Input);
    FreeParkingResponse receiveFreeParking(FreeParkingInput freeParkingInput);

    GetInfoUnicResponse receiveUnicCarInfo(GetInfoUnicInput getInfoUnicInput);
    GetParkingsResponse receiveUnicCarInfo(GetParkingsResponse getParkingsResponse);


    SearchA2ASingleInput getSingleA2A(SearchA2ASingleInput searchA2ASingleInput);
}
