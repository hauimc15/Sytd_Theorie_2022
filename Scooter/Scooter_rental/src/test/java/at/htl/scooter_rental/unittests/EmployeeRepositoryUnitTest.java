package at.htl.scooter_rental.unittests;

import at.htl.scooter_rental.domain.IEmployeeRepository;
import at.htl.scooter_rental.model.employees.Employees;
import at.htl.scooter_rental.model.scooter.Scooters;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@ActiveProfiles("test")
class EmployeeRepositoryUnitTest {
    @Autowired
    private IEmployeeRepository employeeRepository;

    @Test
    void findEmployeebyId(){
        Employees employees = employeeRepository.getReferenceById(1L);
        Assertions.assertEquals("Test",employees.getFirstName());

    }
}