package il.receiver.mapper;

import il.receiver.controller.dto.Cars;
import il.receiver.controller.dto.FreeCarsResponse;
import il.receiver.external.dto.vflat.*;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class FreeVFlatMapper {
    public FreeFlatInput toFreeFlatInput(String startDate, String endDate, Double longitude, Double latitude) {

        FreeFlatInput freeFlatInput = new FreeFlatInput();

        freeFlatInput.setStartDate(startDate);
        freeFlatInput.setEndDate(endDate);
        freeFlatInput.setLongitude(longitude);
        freeFlatInput.setLatitude(latitude);
        //TODO:: This method can receive more parameter for updating request to free car EP (also recommended add MapStruct)

        return freeFlatInput;
    }

    public FreeFlatInput toAllFlatInput(Integer zoom, Integer requestType, Boolean isALLRegion) {

        FreeFlatInput freeFlatInput = new FreeFlatInput();

        freeFlatInput.setZoom(zoom);
        freeFlatInput.setRequestType(requestType);
        freeFlatInput.setIsALLRegion(isALLRegion);
        //TODO:: This method can receive more parameter for updating request to free car EP (also recommended add MapStruct)

        return freeFlatInput;
    }
    public FreeCarsResponse toFreeCarsResponse(FreeVFlatResponse freeVFlatResponse) {
        //TODO:: This is interesting part. Business logic. For returning data we need to understand values of fields in List's (points a2A a2B)
        FreeCarsResponse freeCarsResponse = new FreeCarsResponse();

        //TODO:: here main part to understand what things would we send to client and how to proceed it to easy client parsing
        List<Point> points = freeVFlatResponse.getPoints();
        List<A2A> a2A = freeVFlatResponse.getA2A();
        List<A2B> a2B = freeVFlatResponse.getA2B();

        List<Car> responseCar = a2A.stream()
                .filter(a2A1 -> a2A1.isCombined)
                .flatMap(a2A1 -> a2A1.getCars().stream())
            .collect(Collectors.toList());

        List<Cars> cars = toCarsFromResponseCars(responseCar);
        freeCarsResponse.setCards(cars);

        return freeCarsResponse;
    }

    private List<Cars> toCarsFromResponseCars(List<Car> responseCars) {
        return responseCars.stream()
                .map(car -> new Cars(car.getId()))
                .collect(Collectors.toList());
    }

}
