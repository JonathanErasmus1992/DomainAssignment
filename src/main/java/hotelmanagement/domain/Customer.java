package hotelmanagement.domain;


import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by student on 2015/05/05.
 */
@Entity
public class Customer implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long customer_ID;
    private String ID_number;
    private String customer_firstnames;
    private String customer_lastname;
    @Embedded
    private CustomerAddress customer_address;
    @Embedded
    private CustomerContact customer_contact;

    private Customer(){}

    public Customer( Builder builder )
    {
        customer_ID = builder.customer_ID;
        ID_number = builder.ID_number;
        customer_firstnames = builder.customer_firstnames;
        customer_lastname = builder.customer_lastname;
        customer_address = builder.customer_address;
        customer_contact = builder.customer_contact;
    }

    public Long getCustomerID()
    {
        return customer_ID;
    }
    public String getIDNumber()
    {
        return ID_number;
    }
    public String getFirstnames()
    {
        return customer_firstnames;
    }
    public String getLastname()
    {
        return customer_lastname;
    }
    public CustomerAddress getCustomerAddress()
    {
        return customer_address;
    }
    public CustomerContact getCustomerContact()
    {
        return customer_contact;
    }

    public static class Builder
    {
        private Long customer_ID;
        private String ID_number;
        private String customer_firstnames;
        private String customer_lastname;
        private CustomerAddress customer_address;
        private CustomerContact customer_contact;

        public Builder( String ID_number )
        {
            this.ID_number = ID_number;
        }
        public Builder customer_ID( Long value )
        {
            this.customer_ID = value;
            return this;
        }
        public Builder customer_firstnames( String value )
        {
            this.customer_firstnames = value;
            return this;
        }
        public Builder customer_lastname( String value )
        {
            this.customer_lastname = value;
            return this;
        }
        public Builder customer_address( CustomerAddress value )
        {
            this.customer_address = value;
            return this;
        }
        public Builder customer_contact( CustomerContact value )
        {
            this.customer_contact = value;
            return this;
        }
        public Builder copy( Customer value )
        {
            this.ID_number = value.getIDNumber();
            this.customer_ID = value.getCustomerID();
            this.customer_firstnames = value.getFirstnames();
            this.customer_lastname = value.getLastname();
            this.customer_address = value.getCustomerAddress();
            this.customer_contact = value.getCustomerContact();

            return this;
        }

        public Customer build()
        {
            return new Customer( this );
        }
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;

        Customer customer = (Customer) o;

        return !(customer_ID != null ? !customer_ID.equals(customer.customer_ID) : customer.customer_ID != null);
    }
    @Override
    public int hashCode()
    {
        return customer_ID != null ? customer_ID.hashCode() : 0;
    }
}
