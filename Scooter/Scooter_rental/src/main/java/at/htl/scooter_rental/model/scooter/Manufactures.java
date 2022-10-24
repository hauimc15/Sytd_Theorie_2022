package at.htl.scooter_rental.model.scooter;

import at.htl.scooter_rental.model.AEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@Entity
public class Manufactures extends AEntity {

    @Column(nullable = false, length = 100)
    @NotNull
    @Size(max=100)
    private String name;
}
