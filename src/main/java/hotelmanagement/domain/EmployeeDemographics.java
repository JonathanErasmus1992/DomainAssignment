package hotelmanagement.domain;

import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by student on 2015/05/05.
 */
@Embeddable
public class EmployeeDemographics implements Serializable
{
    private String gender;
    private String race;
    private String home_language;

    public EmployeeDemographics( Builder builder )
    {
        gender = builder.gender;
        race = builder.race;
        home_language = builder.home_language;
    }

    public String getGender()
    {
        return gender;
    }
    public String getRace()
    {
        return race;
    }
    public String getHomeLanguage()
    {
        return home_language;
    }

    public static class Builder
    {
        private String gender;
        private String race;
        private String home_language;

        public Builder( String race )
        {
            this.race = race;
        }
        public Builder gender( String value )
        {
            this.gender = value;
            return this;
        }
        public Builder home_language( String value )
        {
            this.home_language = value;
            return this;
        }
        public Builder copy( EmployeeDemographics value )
        {
            this.race = value.getRace();
            this.gender = value.getGender();
            this.home_language = value.getHomeLanguage();
            return this;
        }

        public EmployeeDemographics build()
        {
            return new EmployeeDemographics( this );
        }
    }
}