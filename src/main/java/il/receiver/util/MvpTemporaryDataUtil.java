package il.receiver.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import il.receiver.external.dto.v2get.*;
import il.receiver.external.dto.vflat.FreeFlatInput;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

import static il.receiver.util.MvpTemporaryDataConstants.*;

@Slf4j
public class MvpTemporaryDataUtil {


    public static void main(String[] args) throws JsonProcessingException {


        String value = new ObjectMapper().writeValueAsString(createA2BVehiclesV2());

        System.out.println(value);

    }

    public static List<A2BVehiclesV2> createListA2b() {

        //TODO:: this you need also realize
        return List.of(createA2BVehiclesV2());

    }

    public static A2BVehiclesV2 createA2BVehiclesV2() {
        A2BVehiclesV2 a2BVehiclesV2 = new A2BVehiclesV2();

        a2BVehiclesV2.setCars(createParkingLiteCarList());
        a2BVehiclesV2.setCapacity(CAPACITY);
        a2BVehiclesV2.setAmount(AMOUNT);
        a2BVehiclesV2.setVType(VTYPE);
        a2BVehiclesV2.setIsCombined(IS_COMBINED);


        return a2BVehiclesV2;
    }
    public static FreeFlatInput createFreeFlatInput() {
        FreeFlatInput freeFlatInput = new FreeFlatInput();
//TODO:: REALIZATION
//        freeFlatInput.setStartDate();
//        freeFlatInput.setEndDate();
//        freeFlatInput.setZoom();
//        freeFlatInput.setVType();
//        freeFlatInput.setCategoryId();
//        freeFlatInput.setLongitude();
//        freeFlatInput.setLatitude();
//        freeFlatInput.setRequestType();
//        freeFlatInput.setIsALLRegion();
//        freeFlatInput.setNElatitude();
//        freeFlatInput.setNElongitude();
//        freeFlatInput.setSWlatitude();
//        freeFlatInput.setSWlongitude();
        return freeFlatInput;
    }

    public static List<ParkingLiteCar> createParkingLiteCarList() {
        return List.of(
                createParkingLiteCar(),
                createParkingLiteCar()
        );
    }

    public static ParkingLiteCar createParkingLiteCar() {
        ParkingLiteCar parkingLiteCar = new ParkingLiteCar();

        parkingLiteCar.setId(ID);
        parkingLiteCar.setCategory(CATEGORY);
//        parkingLiteCar.setAddress(ADDRESS);
//        parkingLiteCar.setIsFlexible(IS_FLEXIBLE);
//        parkingLiteCar.setStart(START);
//        parkingLiteCar.setEnd(END);
//        parkingLiteCar.setVType(VTYPE);
//        parkingLiteCar.setModalityTypeId(MODALITY_TYPE_ID);
//        parkingLiteCar.setFuelLevel(FUELLEVEL);
//        parkingLiteCar.setLink(LINK);

        return parkingLiteCar;
    }

    public static List<A2AVehiclesV2> createListA2a() {
        return List.of(createA2AVehiclesV2(), createA2AVehiclesV2(), createA2AVehiclesV2());
    }

    public static A2AVehiclesV2 createA2AVehiclesV2() {
        A2AVehiclesV2 a2AVehiclesV2 = new A2AVehiclesV2();

        //TODO:: field and implement by this sample all nedded for us entities. This exersice will help also with junit test
//        a2AVehiclesV2.setCars(createCards());
//        a2AVehiclesV2.setLocation(createLocation());
//        a2AVehiclesV2.setCapacity(CAPACITY);
//        a2AVehiclesV2.setAmount(AMOUNT);
//        a2AVehiclesV2.setVType(VTYPE);
        a2AVehiclesV2.setCombined(true);

        return a2AVehiclesV2;
    }


}

















