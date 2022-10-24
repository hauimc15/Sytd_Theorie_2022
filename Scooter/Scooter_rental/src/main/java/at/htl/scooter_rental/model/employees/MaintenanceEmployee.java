package at.htl.scooter_rental.model.employees;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Setter
@Getter
public class MaintenanceEmployee extends Employees{
}
