package at.htl.scooter_rental.unittests;

import at.htl.scooter_rental.domain.IBookingRepository;
import at.htl.scooter_rental.model.customer.Booking;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@ActiveProfiles("Test")
class IBookingRepositoryTest {

    @Autowired
    private IBookingRepository bookingRepository;


    @Test
    void findBookingsByCostumer_IdOrderbyStartTimeDesc(){
        List<Booking> bookingList = bookingRepository.findBookingByCustomerIdOrderByStartDateDesc(87l);
        Assertions.assertEquals(3, bookingList.size());
    }

}