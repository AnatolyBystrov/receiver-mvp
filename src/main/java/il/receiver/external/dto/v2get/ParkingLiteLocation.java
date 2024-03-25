package il.receiver.external.dto.v2get;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ParkingLiteLocation {

    private Integer longitude;
    private Integer latitude;
    private String address;

    //TODO:: delete In java we don't use the NUMBER type
    //  Leave here for your future deleting
    //    private Number longitude;
}
