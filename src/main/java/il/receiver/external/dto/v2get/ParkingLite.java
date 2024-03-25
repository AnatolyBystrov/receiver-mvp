package il.receiver.external.dto.v2get;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ParkingLite {
    private Double cars;
    private Integer capacity;
    private Integer amount;
    private Integer vType;
    private Boolean isCombined;
}
