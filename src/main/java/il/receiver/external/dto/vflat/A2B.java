package il.receiver.external.dto.vflat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class A2B{
    public Integer id;
    public Integer vType;
    public String vTypeGroup;
    public Integer longitude;
    public Integer latitude;
    public Integer modalityTypeId;
    public String fuelLevel;
    public Boolean hasHelmet;
    public String licencePlate;
    public String f;
    public Boolean p;
    public Integer pid;
}