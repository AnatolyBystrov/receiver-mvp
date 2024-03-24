package il.receiver.external.dto.vflat;
import il.receiver.external.dto.carsV2.RatesData;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ParkingLiteLocation {
    private Number longitude;
    private Number latitude;
    private String address;
    private Integer capacity;
    private Integer amount;
    private Integer Vtype;
    private Boolean isCombined;

}
