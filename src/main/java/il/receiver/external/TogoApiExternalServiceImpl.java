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

@Slf4j
@Service
@RequiredArgsConstructor
public class TogoApiExternalServiceImpl implements TogoApiService {

    private final RestTemplate restTemplate;

    @Value("external.api.baseurl")
    private String baseURL;

    @Override
    public CarsV2Response receiveCardsData(Integer projectType, String cars, Integer vType, String licencePlate) {
                return null;
    }

    @Override
    public FreeVFlatResponse receiveFreeVehicles(FreeFlatInput freeFlatInput) {

        String currentEpUrl = "/FreeVehicles/vFlat";

        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(prepareUrl(baseURL, currentEpUrl))
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
    public FreeVehiclesV2Response receiveVehiclesV2(FreeVehiclesV2Input freeVehiclesV2Input) {
        String baseUrl = "https://autotelpublicapiprod.gototech.co/api/FreeVehicles/v2";
        //TODO:: use our method for creating url


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

    @Override
    public FreeParkingResponse receiveFreeParking(FreeParkingInput freeParkingInput) {
        String baseUrl = "https://autotelpublicapiprod.gototech.co/api/Vehicles/FreeParking";
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(baseUrl)
                .queryParam("latitude", freeParkingInput.getLatitude())
                .queryParam("longitude",freeParkingInput.getLongitude())
                .queryParam("modalityId",freeParkingInput.getModalityId())
                .queryParam("radiusInKilometer",freeParkingInput.getRadiusInKilometer())
                .queryParam("vType",freeParkingInput.getVType());
        String uriString = builder.build().encode().toUriString();
        ResponseEntity<FreeParkingResponse>responseEntity = restTemplate.getForEntity(uriString,FreeParkingResponse.class);
        return responseEntity.getBody();
    }

    @Override
    public GetInfoUnicResponse receiveUnicCarInfo(GetInfoUnicInput getInfoUnicInput) {
        String baseUrl = "https://autotelpublicapiprod.gototech.co/api/Vehicles/GetInfo";
        UriComponentsBuilder builder =UriComponentsBuilder.fromHttpUrl(baseUrl)
                .queryParam("projectType", getInfoUnicInput.getProjectType())
                .queryParam("value", getInfoUnicInput.getValue())
                .queryParam("externalLicensePlate", getInfoUnicInput.getExternalLicensePlate())
                .queryParam("vType",getInfoUnicInput.getVType());
        String uriString =builder.build().encode().toUriString();
        ResponseEntity<GetInfoUnicResponse>responseEntity =restTemplate.getForEntity(uriString,GetInfoUnicResponse.class);
        return responseEntity.getBody();

    }
    @Override
    public GetParkingsResponse receiveUnicCarInfo(GetParkingsResponse getParkingsResponse) {
            String baseUrl = "https://autotelpublicapiprod.gototech.co/api/FreeVehicles/Parkings";
            UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(baseUrl)
                    .queryParam(" id", getParkingsResponse.getId())
                    .queryParam("address",getParkingsResponse.getAddress())
                    .queryParam("latitude",getParkingsResponse.getLatitude())
                    .queryParam("longitude",getParkingsResponse.getLongitude())
                    .queryParam("fleetType",getParkingsResponse.getFleetType())
                    .queryParam("fleetTypeText",getParkingsResponse.getFleetTypeText())
                    .queryParam("status", getParkingsResponse.getStatus())
                    .queryParam("capacity", getParkingsResponse.getCapacity())
                    .queryParam("isElectric", getParkingsResponse.getIsElectric())
                    .queryParam("notes",getParkingsResponse.getNotes())
                    .queryParam("modality",getParkingsResponse.getModality());
            String uriString =builder.build().encode().toUriString();
            ResponseEntity<GetParkingsResponse>responseEntity = restTemplate.getForEntity(uriString,GetParkingsResponse.class);
            return responseEntity.getBody();
        }

        @Override
        public SearchA2ASingleInput getSingleA2A(SearchA2ASingleInput searchA2ASingleInput){
        String baseUrl = "https://autotelpublicapiprod.gototech.co/api/FreeVehicles/SearchA2ASingle";
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(baseUrl)
                .queryParam("startDate",searchA2ASingleInput.getStartDate())
                .queryParam("endDate",searchA2ASingleInput.getEndDate())
                .queryParam("vehicleId",searchA2ASingleInput.getVehicleId())
                .queryParam("categoryId",searchA2ASingleInput.getCategoryId())
                .queryParam("longitude",searchA2ASingleInput.getLongitude())
                .queryParam("latitude",searchA2ASingleInput.getLatitude())
                .queryParam("searchSource",searchA2ASingleInput.getSearchSource());
            String uriString =builder.build().encode().toUriString();
            ResponseEntity<SearchA2ASingleInput> responseEntity= restTemplate.getForEntity(uriString,SearchA2ASingleInput.class);
            return responseEntity.getBody();
        }


    private String prepareUrl(String baseURL, String currentEpUrl) {
        //TODO:: check what will work for us
        return String.format("%s %s", baseURL , currentEpUrl);
//        return  baseURL+currentEpUrl;
    }

    }
