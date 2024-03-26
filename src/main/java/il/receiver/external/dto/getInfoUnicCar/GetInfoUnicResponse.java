package il.receiver.external.dto.getInfoUnicCar;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetInfoUnicResponse {
    private Integer id;
    private Integer licensePlate;
    private String nickName;
    private List<VehicleAddress> address;
    private List<VehicleMeta> meta;
    private Double odometer;
    private Double fuelPercentage;
    private Integer vType;
    private String vTypeGroup;
    private Integer modalityTypeId;
    private Boolean isVehicleAvailable;
    private Boolean isLicenseFit;
    private Boolean isRegistrationFit;
    private String customerDCDescription;
    private Boolean hasHelmet;
    private Boolean needHelmet;
    private List <VehicleBilling>billing;
}
