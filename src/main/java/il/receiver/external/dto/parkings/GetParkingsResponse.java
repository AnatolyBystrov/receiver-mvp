package il.receiver.external.dto.parkings;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetParkingsResponse {
    private Integer id;
    private String address;
    private Double latitude;
    private Double longitude;
    private Integer fleetType;
    private String fleetTypeText;
    private Integer status;
    private Integer capacity;
    private Boolean isElectric;
    private String notes;
    private Integer modality;
}
