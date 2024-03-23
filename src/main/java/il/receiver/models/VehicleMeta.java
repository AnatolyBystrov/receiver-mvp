package il.receiver.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VehicleMeta {

    private String modelName;
    private Integer modelID;
    private String category;
    private Integer categoryID;
    private String modelImage;
    private String manufacturer;



}
