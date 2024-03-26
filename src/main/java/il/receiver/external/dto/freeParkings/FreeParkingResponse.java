package il.receiver.external.dto.freeParkings;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FreeParkingResponse {
    private Integer id;
    private String fullAddress;
    private String city;
    private String number;
    private String country;
    private Double latitude;
    private Double longitude;
    private Integer availableCapacity;
    private Double distance;
    private Integer modalityTypeId;
    private Integer assetTypeId;
}
