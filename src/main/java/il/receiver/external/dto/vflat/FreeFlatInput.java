package il.receiver.external.dto.vflat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FreeFlatInput {
    private String startDate;
    private String endDate;
    private Integer zoom;
    private Integer vType;
    private Integer categoryId;
    private Double longitude;
    private Double latitude;
    private Integer requestType;
    private Boolean isALLRegion;
    private Double nElatitude;
    private Double nElongitude;
    private Double sWlatitude;
    private Double sWlongitude;
    
}
