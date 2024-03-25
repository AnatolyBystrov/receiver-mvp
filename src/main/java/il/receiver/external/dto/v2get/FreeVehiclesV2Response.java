package il.receiver.external.dto.v2get;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FreeVehiclesV2Response {
    public List <ParkingLite> pLite;
    public List <ParkingLiteCar> pLiteCar;
    public List <ParkingLIteLocation> pLiteLoc;
}
