package il.receiver.repository;

import il.receiver.repository.dto.FleetFreeCars;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TogoReceiverRepository extends MongoRepository<FleetFreeCars, String> {
}
