package il.receiver.external.dto.singleA2A;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PricingData {
    private Double minimumPricePercentage;
    private String minimumPrice;
    private String minimumPriceDescription;
    private String ratePrice;
    private String ratePriceDescription;
    private String pricingReference;
}
