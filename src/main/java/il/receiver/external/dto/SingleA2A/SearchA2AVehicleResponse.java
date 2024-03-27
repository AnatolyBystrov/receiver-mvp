package il.receiver.external.dto.SingleA2A;
import il.receiver.external.dto.carsV2.PricingDetailsData;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SearchA2AVehicleResponse {
    private String id;
    private List<SearchA2AVehicleAddress>location;
    private List<SearchA2AVehicleMeta>meta;
    private String nickname;
    private Double licencePlate;
    private Integer fuelPercentage;
    private Integer remainingKm;
    private Double distance;
    private Integer homeParkingId;
    private List<PricingData>pricing;
    private List <PricingDetailsData>pricingDetails;
    private Boolean isFlexible;
    private String start;
    private String end;
    private Boolean isStartFlexible;
    private Boolean isEndFlexible;


}
