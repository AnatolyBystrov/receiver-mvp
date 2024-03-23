package il.receiver.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PricingData {

    private Double minimumPricePercentage;
    private String minimumPrice;
    private String minimumPriceDescription;
    private String ratePrice;
    private String ratePriceDescription;
    private String pricingReference;

}
