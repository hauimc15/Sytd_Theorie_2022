package at.htl.scooter_rental.domain;

import at.htl.scooter_rental.model.customer.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ICustomerRepositroy extends JpaRepository<Customer, Long> {

    //11. Finden sie alle eindeutingen Kunden, die shcon einmal einen Scooter ausgeborgt haben
    @Query("select distinct b.customer from Booking b")
    List<Customer> findAllDistictCustomersWithBookings();
}
