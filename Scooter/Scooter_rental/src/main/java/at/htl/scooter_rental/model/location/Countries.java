package at.htl.scooter_rental.model.location;

import at.htl.scooter_rental.model.AEntity;
import at.htl.scooter_rental.model.AVersionEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@Entity
public class Countries extends AVersionEntity {
    @Id
    @Column(nullable = false, length = 3, unique = true)
    @NotNull
    @Size(max=3)
    private String isocode;

    @Column(nullable = false, length = 50)
    private String name;
}
