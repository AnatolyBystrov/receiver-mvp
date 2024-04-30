package il.receiver.service;

import il.receiver.controller.dto.FreeCarsResponse;
import il.receiver.external.TogoApiService;
import il.receiver.external.dto.vflat.FreeFlatInput;
import il.receiver.external.dto.vflat.FreeVFlatResponse;
import il.receiver.mapper.FreeVFlatMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class ReceiverFromTogoApiServiceImplTest {

    @Mock
    private TogoApiService togoApiService;

    @Mock
    private FreeVFlatMapper freeVFlatMapper;

    @InjectMocks
    private ReceiverFromTogoApiServiceImpl receiverService;

    @Test
    public void testReceiveAllFreeCar() {
        // Input parameters
        String startDate = "2024-01-01";
        String endDate = "2024-01-02";
        Double longitude = 1.0;
        Double latitude = 2.0;

        // Mocked objects
        FreeFlatInput freeFlatInput = new FreeFlatInput();
        FreeVFlatResponse freeVFlatResponse = new FreeVFlatResponse();
        FreeCarsResponse expectedResponse = new FreeCarsResponse();

        // Mock behavior
        when(freeVFlatMapper.toFreeFlatInput(startDate, endDate, longitude, latitude)).thenReturn(freeFlatInput);
        when(togoApiService.receiveFreeVehicles(freeFlatInput)).thenReturn(freeVFlatResponse);
        when(freeVFlatMapper.toFreeCarsResponse(freeVFlatResponse)).thenReturn(expectedResponse);

        // Call the method under test
        FreeCarsResponse result = receiverService.receiveAllFreeCar(startDate, endDate, longitude, latitude);

        // Verify the interactions and result
        verify(freeVFlatMapper).toFreeFlatInput(startDate, endDate, longitude, latitude);
        verify(togoApiService).receiveFreeVehicles(freeFlatInput);
        verify(freeVFlatMapper).toFreeCarsResponse(freeVFlatResponse);
        assertSame(expectedResponse, result);
    }
}
