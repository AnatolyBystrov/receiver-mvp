package il.receiver.external;

import il.receiver.external.dto.carsV2.CarsV2Response;
import il.receiver.external.dto.vflat.FreeFlatInput;
import il.receiver.external.dto.v2get.FreeFlatResponse;
import il.receiver.external.dto.vflat.FreeVFlatResponse;

public interface TogoApiService {
    CarsV2Response receiveCardsData(Integer projectType, String cars, Integer vType, String licencePlate);
    FreeVFlatResponse receiveFreeVehicles(FreeFlatInput freeFlatInput);


}
