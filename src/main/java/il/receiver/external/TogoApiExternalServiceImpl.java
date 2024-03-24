package il.receiver.external;

import il.receiver.external.dto.RestResponse;
import il.receiver.external.dto.carsV2.CarsV2Response;
import il.receiver.external.dto.v2get.FreeFlatResponse;
import il.receiver.external.dto.vflat.FreeFlatInput;
import il.receiver.external.dto.vflat.FreeVFlatResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriBuilder;
import org.springframework.web.util.UriBuilderFactory;
import org.springframework.web.util.UriComponentsBuilder;

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
    public FreeVFlatResponse receiveFreeVehicles(FreeFlatInput freeFlatInput) {

        String baseUrl = "https://autotelpublicapiprod.gototech.co/api/FreeVehicles/vFlat";

        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(baseUrl)
                .queryParam("Zoom", freeFlatInput.getZoom())
            //TODO:: try to use from place that you will invoke our service
                .queryParam("requestType", 0)
                .queryParam("isAllRegion", true);

        String uriString = builder.build().encode().toUriString();

        ResponseEntity<FreeVFlatResponse> responseEntity = restTemplate.getForEntity(uriString, FreeVFlatResponse.class );
        return responseEntity.getBody();


    }
}
