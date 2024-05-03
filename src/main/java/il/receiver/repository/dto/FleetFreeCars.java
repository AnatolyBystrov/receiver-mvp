package il.receiver.repository.dto;

import il.receiver.external.dto.vflat.A2A;
import il.receiver.external.dto.vflat.A2B;
import il.receiver.external.dto.vflat.Point;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document("freevflatresponse")
public class FleetFreeCars {
    private String id;
    private List<Point> points;
    private List<A2A> a2A;
    private List<A2B> a2B;

}
