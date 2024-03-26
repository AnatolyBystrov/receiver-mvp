package il.receiver.external.dto.getInfoUnicCar;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VehicleMeta {
    private String modelName;
    private Integer modelId;
    private String category;
    private Integer categoryId;
    private String modelImage;
    private String manufacturer;

}
