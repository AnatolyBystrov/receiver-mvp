package il.receiver.controller.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cars {

    public Integer id;
    public Double longitude;
    public Double latitude;

    public Cars(Integer id) {
        this.id = id;
    }
}
