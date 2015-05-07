package hotelmanagement.domain;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by student on 2015/05/05.
 */
@Entity
public class Employee implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long employee_ID;
    private String ID_number;
    private String employee_firstnames;
    private String employee_lastname;
    @Embedded
    private EmployeeDemographics employee_demographics;
    @Embedded
    private EmployeeAddress employee_address;
    @Embedded
    private EmployeeContact employee_contact;
    @Embedded
    private Job job;
    @Embedded
    private Manager manager;
    private Date hire_date;

    private Employee(){}

    public Employee( Builder builder )
    {
        employee_ID = builder.employee_ID;
        ID_number = builder.ID_number;
        employee_firstnames = builder.employee_firstnames;
        employee_lastname = builder.employee_lastname;
        employee_address = builder.employee_address;
        employee_contact = builder.employee_contact;
        job = builder.job;
        manager = builder.manager;
        hire_date = builder.hire_date;
    }

    public Long getEmployeeID()
    {
        return employee_ID;
    }
    public String getIDNumber()
    {
        return ID_number;
    }
    public String getFirstnames()
    {
        return employee_firstnames;
    }
    public String getLastname()
    {
        return employee_lastname;
    }
    public EmployeeDemographics getEmployeeDemographics()
    {
        return employee_demographics;
    }
    public EmployeeAddress getEmployeeAddress()
    {
        return employee_address;
    }
    public EmployeeContact getEmployeeContact()
    {
        return employee_contact;
    }
    public Job getJob()
    {
        return job;
    }
    public Manager getManager()
    {
        return manager;
    }
    public Date getHireDate()
    {
        return hire_date;
    }
    public static class Builder
    {
        private Long employee_ID;
        private String ID_number;
        private String employee_firstnames;
        private String employee_lastname;
        private EmployeeDemographics employee_demographics;
        private EmployeeAddress employee_address;
        private EmployeeContact employee_contact;
        private Job job;
        private Manager manager;
        private Date hire_date;

        public Builder( String ID_number )
        {
            this.ID_number = ID_number;
        }
        public Builder employee_ID( Long value )
        {
            this.employee_ID = value;
            return this;
        }
        public Builder employee_firstnames( String value )
        {
            this.employee_firstnames = value;
            return this;
        }
        public Builder employee_lastname( String value )
        {
            this.employee_lastname = value;
            return this;
        }
        public Builder employee_demographics( EmployeeDemographics value )
        {
            this.employee_demographics = value;
            return this;
        }
        public Builder employee_address( EmployeeAddress value )
        {
            this.employee_address = value;
            return this;
        }
        public Builder employee_contact( EmployeeContact value )
        {
            this.employee_contact = value;
            return this;
        }
        public Builder job( Job value )
        {
            this.job = value;
            return this;
        }
        public Builder manager( Manager value )
        {
            this.manager = value;
            return this;
        }
        public Builder hire_date( Date value )
        {
            this.hire_date = value;
            return this;
        }
        public Builder copy( Employee value )
        {
            this.ID_number = value.getIDNumber();
            this.employee_ID = value.getEmployeeID();
            this.employee_firstnames = value.getFirstnames();
            this.employee_lastname = value.getLastname();
            this.hire_date = value.getHireDate();
            this.employee_demographics = value.getEmployeeDemographics();
            this.employee_address = value.getEmployeeAddress();
            this.employee_contact = value.getEmployeeContact();
            this.job = value.getJob();
            this.manager = value.getManager();
            this.hire_date = value.getHireDate();

            return this;
        }

        public Employee build()
        {
            return new Employee( this );
        }
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;

        Employee employee = (Employee) o;

        return !(employee_ID != null ? !employee_ID.equals(employee.employee_ID) : employee.employee_ID != null);
    }
    @Override
    public int hashCode()
    {
        return employee_ID != null ? employee_ID.hashCode() : 0;
    }
}