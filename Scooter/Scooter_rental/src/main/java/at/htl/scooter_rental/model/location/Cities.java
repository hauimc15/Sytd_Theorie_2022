package at.htl.scooter_rental.model.location;

import at.htl.scooter_rental.model.AEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@Entity
public class Cities extends AEntity {
    @NotNull
    @Size(max = 100)
    @Column(nullable = false,length = 100)
    private String name;

    @Column(nullable = false)
    @NotNull
    @Min(2)
    private Long inhabitants;

    @ManyToOne
    @JoinColumn(nullable = false)
    @NotNull
    private Countries country;
}
