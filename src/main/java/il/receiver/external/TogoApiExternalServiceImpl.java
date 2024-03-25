package il.receiver.external;

import il.receiver.external.dto.carsV2.CarsV2Response;
import il.receiver.external.dto.v2get.FreeVehiclesV2Input;
import il.receiver.external.dto.v2get.FreeVehiclesV2Response;
import il.receiver.external.dto.vflat.FreeFlatInput;
import il.receiver.external.dto.vflat.FreeVFlatResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

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
                //TODO:: try to use from place that you will invoke our service
                .queryParam("Zoom", freeFlatInput.getZoom())
                .queryParam("requestType", freeFlatInput.getRequestType())
                .queryParam("longitude",freeFlatInput.getLongitude())
                .queryParam("latitude",freeFlatInput.getLatitude())
                .queryParam("startDate",freeFlatInput.getStartDate())
                .queryParam("endDate",freeFlatInput.getEndDate())
                .queryParam("isAllRegion", freeFlatInput.getIsALLRegion());

        String uriString = builder.build().encode().toUriString();

        ResponseEntity<FreeVFlatResponse> responseEntity = restTemplate.getForEntity(uriString, FreeVFlatResponse.class );
        return responseEntity.getBody();


    }
    @Override
    public FreeVehiclesV2Response receiveVehicles(FreeVehiclesV2Input freeVehiclesV2Input) {
        String baseUrl = "https://autotelpublicapiprod.gototech.co/api/FreeVehicles/v2";
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(baseUrl)
                .queryParam("startDate", freeVehiclesV2Input.getStartDate())
                .queryParam("endDate",freeVehiclesV2Input.getEndDate())
                .queryParam("zoom",freeVehiclesV2Input.getZoom())
                .queryParam("name",freeVehiclesV2Input.getVType())
                .queryParam("vType",freeVehiclesV2Input.getVType())
                .queryParam("categoryId",freeVehiclesV2Input.getCategoryId())
                .queryParam("longitude",freeVehiclesV2Input.getLongitude())
                .queryParam("latitude",freeVehiclesV2Input.getLatitude())
                .queryParam("requestType",freeVehiclesV2Input.getRequestType());

        String uriString = builder.build().encode().toUriString();
        ResponseEntity<FreeVehiclesV2Response> responseEntity = restTemplate.getForEntity(uriString, FreeVehiclesV2Response.class);
        return responseEntity.getBody();
    }
}
