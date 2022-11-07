package at.htl.scooter_rental.domain;

import at.htl.scooter_rental.model.location.Countries;
import at.htl.scooter_rental.model.scooter.Manufactures;
import at.htl.scooter_rental.model.scooter.Scooters;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IScooterRepository extends JpaRepository<Scooters, String> {
    List<Scooters> findScootersBySerialNumber(String serialNumber);
    List<Scooters> findScootersByModels_Modelid_Manufactures(Manufactures manufactures);
    //7. Finden Sie alle Scooter eines bestimmten Herstellers
    List<Scooters> findScootersByModels_Modelid_Manufactures_Name(String manufacturesName);

    //15. Finden Sie alle Scooter eines bestimmten Landes. Die Abfrage sollte Pageweise abfragt - werden können
    @Query("select s from Scooters s where s.city.country.isocode =:countrieso order by s.serialNumber")
    Page<Scooters> getScooterByCountryOOrderBySerialNumber(@Param("countrieso") String countrieso, Pageable pageable);
}
