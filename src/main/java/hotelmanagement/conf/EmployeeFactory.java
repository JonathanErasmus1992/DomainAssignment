package hotelmanagement.conf;

import hotelmanagement.domain.*;

import java.util.Date;

/**
 * Created by student on 2015/05/05.
 */
public class EmployeeFactory {
    public static Employee createEmployee( String ID,
                                           String firstnames,
                                           String lastname,
                                           EmployeeDemographics emp_demo,
                                           EmployeeAddress emp_address,
                                           EmployeeContact emp_contact,
                                           Job job,
                                           Manager manager,
                                           Date hire_date)
    {
        Employee employee = new Employee
                .Builder(ID)
                .employee_firstnames(firstnames)
                .employee_lastname(lastname)
                .employee_demographics(emp_demo)
                .employee_address(emp_address)
                .employee_contact(emp_contact)
                .hire_date(hire_date)
                .build();
        return employee;
    }
}
