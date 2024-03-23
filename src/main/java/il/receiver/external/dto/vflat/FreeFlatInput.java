package il.receiver.external.dto.vflat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FreeFlatInput {
    //TODO:: need to fill all data to here (fields input from swagger)

    private String startDate;
    private String endDate;


    //TODO:: check all fields by counting them bro
}
