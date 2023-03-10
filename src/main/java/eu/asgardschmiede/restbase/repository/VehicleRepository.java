package eu.asgardschmiede.restbase.repository;

import eu.asgardschmiede.restbase.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {

}
