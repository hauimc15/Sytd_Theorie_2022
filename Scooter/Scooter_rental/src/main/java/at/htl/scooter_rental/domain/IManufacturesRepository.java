package at.htl.scooter_rental.domain;

import at.htl.scooter_rental.model.employees.Employees;
import at.htl.scooter_rental.model.scooter.Manufactures;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IManufacturesRepository extends JpaRepository<Manufactures, Long> {

}
