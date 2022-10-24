package at.htl.scooter_rental.model.customer;

import at.htl.scooter_rental.model.AEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Getter
@Setter
public class Customer extends AEntity {
    @Column(nullable = false)
    @NotNull
    private String firstName;
    @Column(nullable = false)
    @NotNull
    private String lastName;
    @Column(nullable = false)
    @NotNull
    private String identificationnumber;
    @Column(nullable = false)
    @NotNull
    private String bankaccountnumber;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    @NotNull
    private Date birthdate;
    @Column(nullable = false)
    @NotNull
    private String password;
}
