package hotelmanagement.conf;

import hotelmanagement.domain.Booking;
import hotelmanagement.domain.Dates;
import hotelmanagement.domain.Room;
import hotelmanagement.domain.ServicesAndAddOns;

import java.util.List;

/**
 * Created by student on 2015/05/05.
 */
public class BookingFactory {
    private static Booking createBooking(String ref_num,
                                         List<Room> rooms,
                                         List<ServicesAndAddOns> servicesAndAddOnslist,
                                         Dates dates)
    {
        Booking booking = new Booking
                .Builder(ref_num)
                .rooms(rooms)
                .services_and_addons(servicesAndAddOnslist)
                .dates(dates)
                .build();
        return booking;
    }
}
