package il.receiver.external.dto.getInfoUnicCar;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VehicleAddress {
    private Double longitude;
    private Double latitude;
    private String address;
}
