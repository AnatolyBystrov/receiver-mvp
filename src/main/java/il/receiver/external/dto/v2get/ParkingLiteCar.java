package il.receiver.external.dto.v2get;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ParkingLiteCar {
    private Integer id;
    private Integer category;
    private String address;
    private Integer isFlexible;
    private String start;
    private String end;
    private Integer vType;
    private Integer modalityTypeId;
    private String fuelLevel;
    private String link;
}
