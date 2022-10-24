package at.htl.scooter_rental.unittests;

import at.htl.scooter_rental.domain.IManufacturesRepository;
import at.htl.scooter_rental.domain.IScooterRepository;
import at.htl.scooter_rental.model.scooter.Manufactures;
import at.htl.scooter_rental.model.scooter.Scooters;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.List;
@SpringBootTest
@ActiveProfiles("test")
class ScooterRepositoryUnitTest {

    @Autowired
    private IManufacturesRepository manufacturesRepository;
    @Autowired
    private IScooterRepository iscooterRepository;
    @Test
    void findScootersBySerialNumber() {
        List<Scooters> scootersList=iscooterRepository.findScootersBySerialNumber("SEI123GHJ59");
        Assertions.assertEquals(1,scootersList.size());
    }

    @Test
    void findScootersByModel_Modelid_Manufactures_Name() {
        List<Scooters> scootersList=iscooterRepository.findScootersByModels_Modelid_Manufactures_Name("BMW");
        Assertions.assertEquals(2,scootersList.size());
    }
    @Test
    void findAllScooters(){
        List<Scooters> scootersList = iscooterRepository.findAll();
        Assertions.assertEquals(5,scootersList.size());

    }
    @Test
    void findScootersByModels_Modelid_Manufactures(){
        Manufactures manufactures = manufacturesRepository.getReferenceById(1L);
        List<Scooters> scootersList = iscooterRepository.findScootersByModels_Modelid_Manufactures(manufactures);
        Assertions.assertEquals(2,scootersList.size());

    }
}