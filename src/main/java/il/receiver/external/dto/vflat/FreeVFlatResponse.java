package il.receiver.external.dto.vflat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class
FreeVFlatResponse {
    private List<Point> points;
    private List<A2A> a2A;
    private List<A2B> a2B;
}