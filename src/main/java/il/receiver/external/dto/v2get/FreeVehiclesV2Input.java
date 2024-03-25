package il.receiver.external.dto.v2get;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class FreeVehiclesV2Input {
    private String startDate;
    private String endDate;
    private Integer zoom;
    private Integer vType;
    private Integer categoryId;
    private Double longitude;
    private Double latitude;
    private String requestType;
}
