package il.receiver.external.dto.carsV2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VehicleAddress {
    private Double longitude;
    private Double latitude;
    private String address;

}
