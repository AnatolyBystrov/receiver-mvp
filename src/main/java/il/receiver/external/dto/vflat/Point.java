package il.receiver.external.dto.vflat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Point{
    public Integer longitude;
    public Integer latitude;
    public Integer count;
    public String icon;
}