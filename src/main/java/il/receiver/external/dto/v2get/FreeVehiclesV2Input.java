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

    //TODO:: -> Here my student CategoryID. Proud you Anatoly, that shit will not receible : CategoryID. But probably will not work  Need to check
    private Integer categoryId;
    private Double longitude;
    private Double latitude;
    private String requestType;
}
