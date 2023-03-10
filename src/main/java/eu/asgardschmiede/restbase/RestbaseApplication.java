package eu.asgardschmiede.restbase;

import eu.asgardschmiede.restbase.model.Brand;
import eu.asgardschmiede.restbase.model.Status;
import eu.asgardschmiede.restbase.model.Vehicle;
import eu.asgardschmiede.restbase.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class RestbaseApplication implements CommandLineRunner {

    @Autowired
    VehicleRepository vehicleRepository;

    public static void main(String[] args) {
        SpringApplication.run(RestbaseApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        List<Vehicle> vehicles = new ArrayList<>();
        Vehicle.VehicleBuilder builder = Vehicle.builder();
        builder.brand(Brand.MERCEDES).type("S220").status(Status.ACTIVE);

        Vehicle v = new Vehicle();
        v.setBrand(Brand.MERCEDES);
        v.setType("C180");
        v.setRegistration("TR:AB123");
        v.setStatus(Status.ACTIVE);

        vehicles.add(v);
        vehicles.add(builder.registration("TR:ZZ123").build());
        vehicles.add(builder.registration("TR:FF127").build());
        vehicles.add(builder.registration("TR:GR223").build());
        vehicleRepository.saveAll(vehicles);
    }
}
