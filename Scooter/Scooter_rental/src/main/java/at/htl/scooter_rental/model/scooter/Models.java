package at.htl.scooter_rental.model.scooter;

import at.htl.scooter_rental.model.AVersionEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
@Getter
@Setter
public class Models extends AVersionEntity {
    @EmbeddedId
    private Modelid modelid;

    @Column(nullable = false)
    private Long serviceInterval;
}
