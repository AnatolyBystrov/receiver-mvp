package il.receiver.external.dto.getInfoUnicCar;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetInfoUnicInput {

    private Integer projectType;
    private String value;
    private String externalLicensePlate;
    private Integer vType;
}
