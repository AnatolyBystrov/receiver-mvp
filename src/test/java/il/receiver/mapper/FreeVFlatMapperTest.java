package il.receiver.mapper;

import il.receiver.controller.dto.FreeCarsResponse;
import il.receiver.external.dto.vflat.A2A;
import il.receiver.external.dto.vflat.A2B;
import il.receiver.external.dto.vflat.FreeVFlatResponse;
import il.receiver.external.dto.vflat.Point;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class FreeVFlatMapperTest {

    @Mock
    private FreeVFlatResponse freeVFlatResponse;

    @InjectMocks
    private FreeVFlatMapper freeVFlatMapper;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testToFreeCarsResponse() {
        List<Point> points = Arrays.asList(new Point());
        List<A2A> a2A = Arrays.asList(new A2A());
        List<A2B> a2B = Arrays.asList(new A2B());

        when(freeVFlatResponse.getPoints()).thenReturn(points);
        when(freeVFlatResponse.getA2A()).thenReturn(a2A);
        when(freeVFlatResponse.getA2B()).thenReturn(a2B);

        FreeCarsResponse result = freeVFlatMapper.toFreeCarsResponse(freeVFlatResponse);

        assertEquals(0, result.getCards().size());
    }

}
