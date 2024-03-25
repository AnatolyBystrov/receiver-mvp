package il.receiver.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import il.receiver.external.dto.v2get.*;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class MvpTemporaryDataUtil {


        public static void main(String[] args) throws JsonProcessingException {
            FreeVehiclesV2Response freeVehiclesV2Response = new FreeVehiclesV2Response();

            freeVehiclesV2Response.setA2A(createListA2a());
            freeVehiclesV2Response.setA2B(createListA2b());



            //TODO:: read and practice with our lovely ObjectMapper. Prepare for tomorrow also sample of using this in some different way
            String value = new ObjectMapper().writeValueAsString(freeVehiclesV2Response);

            System.out.println(value);

        }

    private static List<A2BVehiclesV2> createListA2b() {

            //TODO:: this you need also realize
            return List.of(
                    createA2BVehiclesV2()
            );

        }

    private static A2BVehiclesV2 createA2BVehiclesV2() {
        int CAPA =1233331;


        //TODO:: I need you to create all methods and try to keep clear code bro, maybe change or remove the tings that you don't use.
        A2BVehiclesV2 a2BVehiclesV2 = new A2BVehiclesV2();

        a2BVehiclesV2.setCapacity(CAPA);
        return a2BVehiclesV2;
    }

    private static List<A2AVehiclesV2> createListA2a() {
        return List.of(
                //TODO:: create this method for all another thing that I'll soon generate
               createA2AVehiclesV2(),
               createA2AVehiclesV2(),
               createA2AVehiclesV2()
        );
    }

    private static A2AVehiclesV2 createA2AVehiclesV2() {
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

















