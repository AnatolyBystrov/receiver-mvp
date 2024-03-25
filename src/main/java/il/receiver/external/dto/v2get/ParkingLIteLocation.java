package il.receiver.external.dto.v2get;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ParkingLIteLocation {
    private Number longitude;
    private Number latitude;
    private String address;
}
