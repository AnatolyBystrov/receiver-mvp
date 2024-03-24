package il.receiver.external.dto.v2get;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FreeVehiclesModality {
    private List <Cars> a2A;
    private List <ParkingLiteCar> a2ACars;
    private List <ParkingLiteLocation> a2BCars;

}
