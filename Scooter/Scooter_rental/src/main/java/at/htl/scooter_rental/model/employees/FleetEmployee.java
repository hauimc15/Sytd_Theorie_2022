package at.htl.scooter_rental.model.employees;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
public class FleetEmployee extends Employees {
    @NotNull
    @Column(nullable = false)
    private Long maxScooter;

    @NotNull
    @Column(nullable = false)
    private Double ratePerScooter;
}
