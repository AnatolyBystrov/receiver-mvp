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
    private Integer zoom;
    private Integer vType;
    private Integer categoryId;
    private Number longitude;
    private Number latitude;
    private Integer requestType;
    private boolean isALLRegion;
    private Number nElatitude;
    private Number nElongitude;
    private Number sWlatitude;
    private Number sWlongitude;
    
    //TODO:: check all fields by counting them bro
}
