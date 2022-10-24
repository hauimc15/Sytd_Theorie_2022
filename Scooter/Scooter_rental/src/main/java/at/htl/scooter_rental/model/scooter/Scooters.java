package at.htl.scooter_rental.model.scooter;

import at.htl.scooter_rental.model.AVersionEntity;
import at.htl.scooter_rental.model.location.Cities;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Getter
@Setter
@Entity
public class Scooters extends AVersionEntity {
    @Column(nullable = false, unique = true, length = 50)
    @Id
    @NotNull
    @Size(max=50)
    private String serialNumber;

    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    @NotNull
    private Date purchasedate;

    @Temporal(TemporalType.DATE)
    @Column()
    private Date scrappingDate;



    @ManyToOne
    @JoinColumns({
            @JoinColumn(nullable = false),
            @JoinColumn(nullable = false)
    })
    private Models models;

    @Column(nullable = false)
    @NotNull
    @Min(0)
    @Max(100)
    private Long batteryLevel;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Cities city;
}
