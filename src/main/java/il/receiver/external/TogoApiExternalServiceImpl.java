package il.receiver.external;

import il.receiver.external.dto.parkings.GetParkingsResponse;
import il.receiver.external.dto.singleA2A.SearchA2ASingleInput;
import il.receiver.external.dto.carsV2.CarsV2Response;
import il.receiver.external.dto.freeParkings.FreeParkingInput;
import il.receiver.external.dto.freeParkings.FreeParkingResponse;
import il.receiver.external.dto.getInfoUnicCar.GetInfoUnicInput;
import il.receiver.external.dto.getInfoUnicCar.GetInfoUnicResponse;
import il.receiver.external.dto.v2get.FreeVehiclesV2Input;
import il.receiver.external.dto.v2get.FreeVehiclesV2Response;
import il.receiver.external.dto.vflat.FreeFlatInput;
import il.receiver.external.dto.vflat.FreeVFlatResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class TogoApiExternalServiceImpl implements TogoApiService {

    private final RestTemplate restTemplate;

    @Value("${external.api.baseurl}")
    private String baseURL;

    @Override
    public FreeVFlatResponse receiveFreeVehicles(FreeFlatInput freeFlatInput) {

        String currentEpUrl = "/FreeVehicles/vFlat";

        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(prepareUrl(baseURL, currentEpUrl))
                .queryParamIfPresent("zoom", Optional.ofNullable(freeFlatInput.getZoom()))
                .queryParamIfPresent("requestType", Optional.ofNullable(freeFlatInput.getRequestType()))
                .queryParamIfPresent("isALLRegion", Optional.ofNullable(freeFlatInput.getIsALLRegion()))
                .queryParamIfPresent("longitude", Optional.ofNullable(freeFlatInput.getLongitude()))
                .queryParamIfPresent("latitude", Optional.ofNullable(freeFlatInput.getLatitude()))
                .queryParamIfPresent("startDate", Optional.ofNullable(freeFlatInput.getStartDate()))
                .queryParamIfPresent("endDate", Optional.ofNullable(freeFlatInput.getEndDate()));


        String uriString = builder.build().encode().toUriString();

        ResponseEntity<FreeVFlatResponse> responseEntity = restTemplate.getForEntity(uriString, FreeVFlatResponse.class);
        return responseEntity.getBody();


    }


    private String prepareUrl(String baseURL, String currentEpUrl) {
        return String.format("%s%s", baseURL, currentEpUrl);
    }

}
