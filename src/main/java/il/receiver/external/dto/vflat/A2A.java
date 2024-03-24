package il.receiver.external.dto.vflat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class A2A{
    public List<Car> cars;
    public int longitude;
    public int latitude;
    public int capacity;
    public int amount;
    public int vType;
    public boolean isCombined;
}