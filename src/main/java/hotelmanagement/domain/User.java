package hotelmanagement.domain;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by student on 2015/05/05.
 */
@Entity
public class User implements Serializable
{
    @Id
    private String username;
    private String password;

    private User(){}

    public User( Builder builder )
    {
        username = builder.username;
        password = builder.password;
    }
    public String getUsername()
    {
        return username;
    }
    public String getPassword()
    {
        return password;
    }

    public static class Builder
    {
        private String username;
        private String password;

        public Builder( String username )
        {
            this.username = username;
        }
        public Builder password( String value )
        {
            this.password = value;
            return this;
        }
        public Builder copy( User value )
        {
            this.username = value.getUsername();
            this.password = value.getPassword();

            return this;
        }

        public User build()
        {
            return new User( this );
        }
    }
}