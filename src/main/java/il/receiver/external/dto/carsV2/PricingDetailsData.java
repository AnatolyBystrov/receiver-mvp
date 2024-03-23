package il.receiver.external.dto.carsV2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PricingDetailsData {
    private List<RatesData> a2ARates;
    private List<RatesData> a2BRates;
}
