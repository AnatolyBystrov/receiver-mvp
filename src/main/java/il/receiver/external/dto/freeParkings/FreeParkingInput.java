package il.receiver.external.dto.freeParkings;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FreeParkingInput {
    private Double latitude;
    private Number longitude;
    private Integer ModalityId;
    private Double radiusInKilometer;
    private Integer vType;
}
