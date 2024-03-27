package il.receiver.external.dto.SingleA2A;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

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
