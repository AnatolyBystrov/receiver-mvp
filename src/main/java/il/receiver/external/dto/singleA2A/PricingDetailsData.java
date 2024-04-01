package il.receiver.external.dto.singleA2A;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class PricingDetailsData {
    private List <RatesDataA2A>A2ARates;
    private List <RatesDataA2B>A2BData;
}
