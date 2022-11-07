package at.htl.scooter_rental.domain;

import at.htl.scooter_rental.model.customer.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IBookingRepository extends JpaRepository<Booking, Long> {
    List<Booking> findBookingByCustomerIdOrderByStartDateDesc(Long customerId);


    //10.
    @Query("select b from Booking b where b.customer.id=:customerId order by b.startDate desc")
    List<Booking> findAllBookingbyCustomerIdQuery(@Param("customerId") Long customerId);
}
