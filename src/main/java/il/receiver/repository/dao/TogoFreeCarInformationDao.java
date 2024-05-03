package il.receiver.repository.dao;

import il.receiver.repository.dto.FleetFreeCars;

import java.util.List;
import java.util.Optional;

public interface TogoFreeCarInformationDao {
    List<FleetFreeCars> getAllFleetFreeCars();
    void insertFleetCarsInformation(FleetFreeCars fleetFreeCars);
    void saveFleetCars(FleetFreeCars fleetFreeCars);
    void saveFleetCarsList(List<FleetFreeCars> fleetFreeCars);
    Optional<FleetFreeCars> getCarById(String id);
    Optional<FleetFreeCars> getCarByLocation(Double longitude, Double latitude);

 }
