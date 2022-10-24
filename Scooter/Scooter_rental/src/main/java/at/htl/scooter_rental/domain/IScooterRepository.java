package at.htl.scooter_rental.domain;

import at.htl.scooter_rental.model.scooter.Manufactures;
import at.htl.scooter_rental.model.scooter.Scooters;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IScooterRepository extends JpaRepository<Scooters, String> {
    List<Scooters> findScootersBySerialNumber(String serialNumber);
    List<Scooters> findScootersByModels_Modelid_Manufactures(Manufactures manufactures);
    List<Scooters> findScootersByModels_Modelid_Manufactures_Name(String manufacturesName);
}
