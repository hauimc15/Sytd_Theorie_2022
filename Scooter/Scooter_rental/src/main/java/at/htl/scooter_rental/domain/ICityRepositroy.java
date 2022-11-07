package at.htl.scooter_rental.domain;

import at.htl.scooter_rental.model.location.Cities;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ICityRepositroy extends JpaRepository<Cities,Long> {

    //12. FInden Sie den Umsatz in einer bestimmten Stadt
    @Query("select sum(b.costs) from Booking b where b.scooters.city = :cities")
    Float findTotalEarningsByCity(@Param("cities")Cities cities);

}
