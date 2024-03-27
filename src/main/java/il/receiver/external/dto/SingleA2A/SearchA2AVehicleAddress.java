package il.receiver.external.dto.SingleA2A;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SearchA2AVehicleAddress {
    private Double longitude;
    private Double latitude;
    private String address;
}
