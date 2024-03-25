package il.receiver.external.dto.v2get;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class A2AVehiclesV2 {
    public List<ParkingLiteCar> cars;
    public ParkingLiteLocation location;
    public int capacity;
    public int amount;
    public int vType;
    public boolean isCombined;
}
