package at.htl.scooter_rental.model.customer;

import at.htl.scooter_rental.model.AEntity;
import at.htl.scooter_rental.model.scooter.Scooters;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
public class Booking extends AEntity {

    @ManyToOne
    @JoinColumn(nullable = false)
    private Customer customer;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Scooters scooters;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date startDate;

    @Column(nullable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Date endDate;

    @Column(nullable = true)
    private Double costs;

    @ManyToOne
    @JoinColumn(nullable = false)
    private PaymentType paymentType;

}

