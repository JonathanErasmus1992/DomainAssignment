package hotelmanagement.domain;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by student on 2015/05/05.
 */
@Entity
public class ServicesAndAddOns implements Serializable
{
    @Id
    private int serv_extras_id;
    private String extra_name;
    private double price_added;

    private ServicesAndAddOns(){}

    public ServicesAndAddOns( Builder builder )
    {
        serv_extras_id = builder.serv_extras_id;
        extra_name = builder.extra_name;
        price_added = builder.price_added;
    }
    public int getID()
    {
        return serv_extras_id;
    }
    public String getExtraName()
    {
        return extra_name;
    }
    public double getPriceAdded()
    {
        return price_added;
    }

    public static class Builder
    {
        private int serv_extras_id;
        private String extra_name;
        private double price_added;

        public Builder( int serv_extras_id )
        {
            this.serv_extras_id = serv_extras_id;
        }
        public Builder extra_name( String value )
        {
            this.extra_name = value;
            return this;
        }
        public Builder price_added( double value )
        {
            this.price_added = value;
            return this;
        }
        public Builder copy( ServicesAndAddOns value )
        {
            this.serv_extras_id = value.getID();
            this.extra_name = value.getExtraName();
            this.price_added = value.getPriceAdded();

            return this;
        }

        public ServicesAndAddOns build()
        {
            return new ServicesAndAddOns( this );
        }
    }
}