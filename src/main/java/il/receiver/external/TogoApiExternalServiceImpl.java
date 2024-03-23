package il.receiver.external;

import il.receiver.models.CarsV2Response;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class TogoApiExternalServiceImpl implements TogoApiService {


    @Override
    public CarsV2Response receiveCardsData(Integer projectType, String cars, Integer vType, String licencePlate) {
                return null;
    }
}
