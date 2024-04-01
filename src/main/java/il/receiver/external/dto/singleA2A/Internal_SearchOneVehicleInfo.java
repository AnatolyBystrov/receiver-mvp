package il.receiver.external.dto.singleA2A;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Internal_SearchOneVehicleInfo {
    private String id;
    private String originalStart;
    private String originalEnd;
    private List<SearchA2AVehicleResponse> vehicleResponse;
}
