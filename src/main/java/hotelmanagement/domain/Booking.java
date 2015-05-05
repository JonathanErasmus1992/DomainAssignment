package hotelmanagement.domain;

import org.hibernate.annotations.Entity;
import javax.persistence.Embedded;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.List;

/**
 * Created by student on 2015/05/05.
 */
@Entity
public class Booking implements Serializable
{
    @Id
    private String reference_number;
    private List<Room> rooms;
    private List<ServicesAndAddOns> services_and_addons;
    @Embedded
    private Dates dates;

    private Booking(){};

    public Booking( Builder builder )
    {
        reference_number = builder.reference_number;
        rooms = builder.rooms;
        services_and_addons = builder.services_and_addons;
        dates = builder.dates;
    }
    public String getReferenceNumber()
    {
        return reference_number;
    }
    public List<Room> getRooms()
    {
        return rooms;
    }
    public List<ServicesAndAddOns> getServicesAndAddOns()
    {
        return services_and_addons;
    }
    public Dates getDates()
    {
        return dates;
    }

    public static class Builder
    {
        private String reference_number;
        private List<Room> rooms;
        private List<ServicesAndAddOns> services_and_addons;
        private Dates dates;

        public Builder( String reference_number )
        {
            this.reference_number = reference_number;
        }
        public Builder rooms( List<Room> value )
        {
            this.rooms = value;
            return this;
        }
        public Builder services_and_addons( List<ServicesAndAddOns> value )
        {
            this.services_and_addons = value;
            return this;
        }
        public Builder dates( Dates value )
        {
            this.dates = value;
            return this;
        }
        public Builder copy( Booking value )
        {
            this.reference_number = value.getReferenceNumber();
            this.rooms = value.getRooms();
            this.services_and_addons = value.getServicesAndAddOns();
            this.dates = value.getDates();

            return this;
        }

        public Booking build()
        {
            return new Booking( this );
        }
    }
}
