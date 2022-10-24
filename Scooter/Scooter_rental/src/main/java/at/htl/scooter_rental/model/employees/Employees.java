package at.htl.scooter_rental.model.employees;

import at.htl.scooter_rental.model.AEntity;
import at.htl.scooter_rental.model.location.Cities;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Employees extends AEntity {
    @Column(nullable = false, length = 100)
    @NotNull
    @Size(max=100)
    private String firstName;
    @Column(nullable = false, length = 100)
    @NotNull
    @Size(max=100)
    private String lastName;
    @Column(nullable = false, length = 100)
    @NotNull
    @Size(max=100)
    private String socialSecurityNumber;
    @NotNull
    @ManyToOne
    @JoinColumn(nullable = false)
    private Cities city;
    

}
