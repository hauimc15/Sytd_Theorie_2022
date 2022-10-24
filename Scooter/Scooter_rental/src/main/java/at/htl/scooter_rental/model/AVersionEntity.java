package at.htl.scooter_rental.model;

import lombok.Getter;

import javax.persistence.MappedSuperclass;
import javax.persistence.Version;
import java.io.Serializable;

@Getter
@MappedSuperclass
public class AVersionEntity implements Serializable {
    @Version
    private  Long version;
}
