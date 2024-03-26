package il.receiver.external.dto.getInfoUnicCar;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VehicleBilling {
    private String dayPrice;
    private String hourPrice;
    private String tripPrice;
    private String minutePrice;
    private Double perKm;
    private Double upTo50km;
    private Double from50Km;
    private Double minimumPriceBilling;
    private Double unlockPrice;
}
