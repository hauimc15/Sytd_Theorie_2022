package at.htl.scooter_rental.model.scooter;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Embeddable
@Getter
@Setter
public class Modelid implements Serializable {

    private static final long serialVersionUID = 4407108850553552716L;
    @ManyToOne
    @JoinColumn(nullable = false)
    @NotNull
    private Manufactures manufactures;

    @Column(nullable = false, length = 100)
    @NotNull
    @Size(max=100)
    private String modelLabel;

}
