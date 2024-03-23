package il.receiver.external;

import il.receiver.external.dto.carsV2.CarsV2Response;
import il.receiver.external.dto.vflat.FreeFlatInput;
import il.receiver.external.dto.vflat.FreeFlatResponse;

public interface TogoApiService {
    CarsV2Response receiveCardsData(Integer projectType, String cars, Integer vType, String licencePlate);
    FreeFlatResponse receiveFreeVehicles(FreeFlatInput freeFlatInput);


}
