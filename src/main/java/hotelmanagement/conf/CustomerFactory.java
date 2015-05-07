package hotelmanagement.conf;

import hotelmanagement.domain.Customer;
import hotelmanagement.domain.CustomerAddress;
import hotelmanagement.domain.CustomerContact;

/**
 * Created by student on 2015/05/05.
 */
public class CustomerFactory
{

    public static Customer createCustomer( String ID,
                                           String firstnames,
                                           String lastname,
                                           CustomerAddress cust_address,
                                           CustomerContact cust_contact )
    {
        Customer customer = new Customer
                .Builder(ID)
                .customer_firstnames( firstnames )
                .customer_lastname( lastname )
                .customer_address( cust_address )
                .customer_contact( cust_contact )
                .build();

        return customer;
    }
}
