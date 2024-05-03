package il.receiver.controller.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cars {

    private Integer id;
    private Double longitude;
    private Double latitude;

    public Cars(Integer id) {
        this.id = id;
    }
}
