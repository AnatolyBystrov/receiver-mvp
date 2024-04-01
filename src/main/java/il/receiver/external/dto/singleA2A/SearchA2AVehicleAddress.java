package il.receiver.external.dto.singleA2A;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SearchA2AVehicleAddress {
    private Double longitude;
    private Double latitude;
    private String address;
}
