package il.receiver.util;

import il.receiver.external.dto.v2get.A2AVehiclesV2;
import il.receiver.external.dto.v2get.A2BVehiclesV2;
import il.receiver.external.dto.v2get.ParkingLiteCar;
import il.receiver.external.dto.vflat.FreeFlatInput;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

import static il.receiver.util.MvpTemporaryDataConstants.*;

@Slf4j
public class MvpTemporaryDataUtil {

    public static List<A2BVehiclesV2> createListA2b() {

        return List.of(
                createA2BVehiclesV2(),
                createA2BVehiclesV2WithParameters(1, 3, 2, true)
        );

    }
    public static A2BVehiclesV2 createA2BVehiclesV2WithParameters(Integer capacity, Integer amount, Integer vType, Boolean isCombined) {
        A2BVehiclesV2 a2BVehiclesV2 = new A2BVehiclesV2();

        a2BVehiclesV2.setCars(createParkingLiteCarList());
        a2BVehiclesV2.setCapacity(capacity);
        a2BVehiclesV2.setAmount(amount);
        a2BVehiclesV2.setVType(vType);
        a2BVehiclesV2.setIsCombined(isCombined);


        return a2BVehiclesV2;
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

        return parkingLiteCar;
    }

    public static List<A2AVehiclesV2> createListA2a() {
        return List.of(createA2AVehiclesV2(), createA2AVehiclesV2(), createA2AVehiclesV2());
    }

    public static A2AVehiclesV2 createA2AVehiclesV2() {
        A2AVehiclesV2 a2AVehiclesV2 = new A2AVehiclesV2();
        a2AVehiclesV2.setCombined(true);

        return a2AVehiclesV2;
    }


}

















