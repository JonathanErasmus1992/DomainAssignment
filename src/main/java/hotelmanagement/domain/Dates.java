package hotelmanagement.domain;

import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by student on 2015/05/05.
 */
@Embeddable
public class Dates implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date booking_made_date;
    private Date booking_arrival_date;
    private Date booking_departure_date;

    private Dates(){}

    public Dates( Builder builder )
    {
        id = builder.id;
        booking_made_date = builder.booking_made_date;
        booking_arrival_date = builder.booking_arrival_date;
        booking_departure_date = builder.booking_departure_date;
    }
    public Long getID()
    {
        return id;
    }
    public Date getBookingMadeDate()
    {
        return booking_made_date;
    }
    public Date getBookingArrivalDate()
    {
        return booking_arrival_date;
    }
    public Date getBookingDepartureDate()
    {
        return booking_departure_date;
    }

    public static class Builder
    {
        private Long id;
        private Date booking_made_date;
        private Date booking_arrival_date;
        private Date booking_departure_date;

        public Builder(Date booking_made_date)
        {
            this.booking_made_date = booking_made_date;
        }
        public Builder id( Long value )
        {
            this.id = value;
            return this;
        }
        public Builder booking_arrival_date( Date value )
        {
            this.booking_arrival_date = value;
            return this;
        }
        public Builder booking_departure_date( Date value )
        {
            this.booking_departure_date = value;
            return this;
        }
        public Builder copy( Dates value )
        {
            this.id = value.getID();
            this.booking_made_date = value.getBookingMadeDate();
            this.booking_arrival_date = value.getBookingArrivalDate();
            this.booking_departure_date = value.getBookingDepartureDate();

            return this;
        }

        public Dates build()
        {
            return new Dates( this );
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dates)) return false;

        Dates dates = (Dates) o;

        return !(id != null ? !id.equals(dates.id) : dates.id != null);

    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
