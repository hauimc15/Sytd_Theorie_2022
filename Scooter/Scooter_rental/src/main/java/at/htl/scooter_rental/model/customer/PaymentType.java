package at.htl.scooter_rental.model.customer;

import at.htl.scooter_rental.model.AEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Entity
public class PaymentType extends AEntity {
    @NotNull
    @Column(nullable = false)
    private String type;
}
