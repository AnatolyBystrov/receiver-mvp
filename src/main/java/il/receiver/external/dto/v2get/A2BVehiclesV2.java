package il.receiver.external.dto.v2get;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class A2BVehiclesV2 {
    public List<ParkingLiteCar> cars;
    public ParkingLiteLocation location;
    public int capacity;
    public int amount;
    public int vType;
    public boolean isCombined;
}
