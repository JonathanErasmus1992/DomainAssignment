package hotelmanagement.domain;

import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by student on 2015/05/05.
 */
@Embeddable
public class Manager implements Serializable
{
    private String manager_id;
    private String manager_title;
    private String employee_id;

    public Manager( Builder builder )
    {
        manager_id = builder.manager_id;
        manager_title = builder.manager_title;
        employee_id = builder.employee_id;
    }

    public String getManagerID()
    {
        return manager_id;
    }
    public String getManagerTitle()
    {
        return manager_title;
    }
    public String getEmployeeID()
    {
        return employee_id;
    }

    public static class Builder
    {
        private String manager_id;
        private String manager_title;
        private String employee_id;

        public Builder( String manager_id )
        {
            this.manager_id = manager_id;
        }
        public Builder manager_title( String value )
        {
            this.manager_title = value;
            return this;
        }
        public Builder employee_id( String value )
        {
            this.employee_id = value;
            return this;
        }
        public Builder copy( Manager value )
        {
            this.manager_id = value.getManagerID();
            this.manager_title = value.getManagerTitle();
            this.employee_id = value.getEmployeeID();

            return this;
        }

        public Manager build()
        {
            return new Manager( this );
        }
    }
}