package at.htl.scooter_rental.model.employees;

import at.htl.scooter_rental.model.AEntity;
import at.htl.scooter_rental.model.scooter.Scooters;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Getter
@Setter
public class Maintenance extends AEntity {
    @ManyToOne
    @JoinColumn(nullable = false)
    private ServiceTypes serviceTypes;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Scooters scooter;

    @ManyToOne
    @JoinColumn(nullable = false)
    private MaintenanceEmployee maintenanceEmployee;
}