package il.receiver.external.dto.singleA2A;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SearchA2AVehicleMeta {
    private String modelName;
    private Integer modelId;
    private String transmissionName;
    private Integer transmissionId;
    private String category;
    private Integer categoryId;
    private String modelImage;
    private String manufacturer;
    private String fuelType;
}
