package il.receiver.external.dto.vflat;

import il.receiver.external.dto.carsV2.RatesData;
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
