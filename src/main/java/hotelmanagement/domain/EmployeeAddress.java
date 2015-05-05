package hotelmanagement.domain;

import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by student on 2015/05/05.
 */
@Embeddable
public class EmployeeAddress implements Serializable
{
    private String physical_address;
    private String postal_address;
    private String postal_code;

    public EmployeeAddress( Builder builder )
    {
        physical_address = builder.physical_address;
        postal_address = builder.postal_address;
        postal_code = builder.postal_address;
    }

    public String getPhysicalAddress()
    {
        return physical_address;
    }
    public String getPostalAddress()
    {
        return postal_address;
    }
    public String getPostalCode()
    {
        return postal_code;
    }

    public static class Builder
    {
        private String physical_address;
        private String postal_address;
        private String postal_code;

        public Builder( String physical_address )
        {
            this.physical_address = physical_address;
        }
        public Builder postal_address( String value )
        {
            this.postal_address = value;
            return this;
        }
        public Builder postal_code( String value )
        {
            this.postal_code = value;
            return this;
        }
        public Builder copy( EmployeeAddress value )
        {
            this.physical_address = value.getPhysicalAddress();
            this.postal_address = value.getPostalAddress();
            this.postal_code = value.getPostalCode();

            return this;
        }

        public EmployeeAddress build()
        {
            return new EmployeeAddress( this );
        }
    }
}