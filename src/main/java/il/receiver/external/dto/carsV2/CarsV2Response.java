package il.receiver.external.dto.carsV2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CarsV2Response {

    private Integer id;
    private Integer gotoType;
    private String licencePlate;
    private String nickName;
    private VehicleAddress location;
    private VehicleMeta meta;
    private Double odometer;
    private Double fuelPercentange;
    private Integer fuelType;
    private Integer vType;
    private String vTypeGroup;
    private Integer modalityTypeId;
    private boolean isVehicleAvalible;
    private boolean isLicenseFit;
    private boolean isRegistrationFit;
    private String customerDCDesription;
    private boolean hasHelmet;
    private boolean needHelmet;
    private PricingData pricing;
    private PricingDetailsData pricingDetails;

}
