package il.receiver.controller;

import il.receiver.controller.dto.FreeCarsResponse;
import il.receiver.service.MvpReceiverService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith({SpringExtension.class, MockitoExtension.class})
@WebMvcTest(MvpReceiverController.class)
public class MvpReceiverControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private MvpReceiverService mvpReceiverService;

    @Test
    public void testGetFreeCarsLocation() throws Exception {
        String startDate = "2024-01-01";
        String endDate = "2024-01-02";
        Double longitude = 1.0;
        Double latitude = 2.0;

        // Mocking the service response
        FreeCarsResponse mockResponse = new FreeCarsResponse();
        when(mvpReceiverService.receiveAllFreeCar(startDate, endDate, longitude, latitude)).thenReturn(mockResponse);

        // Performing the GET request
        mockMvc.perform(get("/api/get-free-cars-location")
                        .param("startDate", startDate)
                        .param("endDate", endDate)
                        .param("longitude", String.valueOf(longitude))
                        .param("latitude", String.valueOf(latitude)))
                .andExpect(status().isOk());
    }
}
