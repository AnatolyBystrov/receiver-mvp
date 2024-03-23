package il.receiver.external;

import il.receiver.models.CarsV2Response;

public interface TogoApiService {
    CarsV2Response receiveCardsData(Integer projectType, String cars, Integer vType, String licencePlate);
}
