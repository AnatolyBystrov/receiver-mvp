package il.receiver.repository.dao;

import il.receiver.repository.TogoReceiverRepository;
import il.receiver.repository.dto.FleetFreeCars;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;


@Slf4j
@Component
@RequiredArgsConstructor
public class TogoFreeCarInformationDaoImpl implements TogoFreeCarInformationDao {
    private final TogoReceiverRepository togoReceiverRepository;

    @Override
    public List<FleetFreeCars> getAllFleetFreeCars() {
        togoReceiverRepository.deleteAll();
        return togoReceiverRepository.findAll();
    }

    @Override
    public void insertFleetCarsInformation(FleetFreeCars fleetFreeCars) {
        log.info("Starting inserting data to collection with id: {} ", fleetFreeCars.getId());
        togoReceiverRepository.insert(fleetFreeCars);
    }

    @Override
    public void saveFleetCars(FleetFreeCars fleetFreeCars) {

        //TODO:: implementation
    }

    @Override
    public void saveFleetCarsList(List<FleetFreeCars> fleetFreeCars) {
        //TODO:: implementation
    }

    @Override
    public Optional<FleetFreeCars> getCarById(String id) {
        //TODO:: checking
        return togoReceiverRepository.findById(id);
    }

    @Override
    public Optional<FleetFreeCars> getCarByLocation(Double longitude, Double latitude) {
        //TODO:: implementation
        return null;
    }
}
