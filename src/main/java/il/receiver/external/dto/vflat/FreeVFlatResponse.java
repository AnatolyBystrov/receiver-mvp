package il.receiver.external.dto.vflat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FreeVFlatResponse {
    public List<Point> points;
    public List<A2A> a2A;
    public List<A2B> a2B;
}