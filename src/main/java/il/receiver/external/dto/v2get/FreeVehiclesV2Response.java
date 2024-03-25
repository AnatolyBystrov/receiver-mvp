package il.receiver.external.dto.v2get;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FreeVehiclesV2Response {
    //TODO:: sing like it's not our json bro
    private List<A2AVehiclesV2> a2A;
    private List<A2BVehiclesV2> a2B;


//    public List <ParkingLite> pLite;
//    public List <ParkingLiteCar> pLiteCar;
//    public List <ParkingLIteLocation> pLiteLoc;
}
