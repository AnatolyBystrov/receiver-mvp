package il.receiver.external.dto.singleA2A;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SearchA2ASingleInput {
    private String startDate;
    private String endDate;
    private Integer vehicleId;
    private Integer categoryId;
    private Double longitude;
    private Double latitude;
    private Integer searchSource;
}
