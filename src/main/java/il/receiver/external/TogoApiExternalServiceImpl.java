package il.receiver.external;

import il.receiver.external.dto.carsV2.CarsV2Response;
import il.receiver.external.dto.vflat.FreeFlatInput;
import il.receiver.external.dto.vflat.FreeFlatResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriBuilder;

import java.net.URI;

@Slf4j
@Service
@RequiredArgsConstructor
public class TogoApiExternalServiceImpl implements TogoApiService {

    private final RestTemplate restTemplate;

    @Override
    public CarsV2Response receiveCardsData(Integer projectType, String cars, Integer vType, String licencePlate) {
                return null;
    }

    @Override
    public FreeFlatResponse receiveFreeVehicles(FreeFlatInput freeFlatInput) {

        URI apiUrl = URI.create("https://autotelpublicapiprod.gototech.co/api/FreeVehicles/vFlat?Zoom=16&requestType=0&isAllRegion=true");
        Object object = restTemplate.getForObject(apiUrl, Object.class);

        return null;
    }
}
