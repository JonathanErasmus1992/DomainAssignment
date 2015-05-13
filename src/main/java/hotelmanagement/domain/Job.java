package hotelmanagement.domain;

import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by student on 2015/05/05.
 */
@Embeddable
public class Job implements Serializable
{
    private String job_code;
    private String job_type;
    private String job_title;
    private String job_description;
    private double basic_salary;

    public Job( Builder builder )
    {
        job_code = builder.job_code;
        job_type = builder.job_type;
        job_title = builder.job_title;
        job_description = builder.job_description;
        basic_salary = builder.basic_salary;
    }
    public String getJobCode()
    {
        return job_code;
    }
    public String getJobType()
    {
        return job_type;
    }
    public String getJobTitle()
    {
        return job_title;
    }
    public String getJobDescription()
    {
        return job_description;
    }
    public double getBasicSalary()
    {
        return basic_salary;
    }

    public static class Builder
    {
        private String job_code;
        private String job_type;
        private String job_title;
        private String job_description;
        private double basic_salary;

        public Builder(String job_code)
        {
            this.job_code = job_code;
        }

        public Builder job_type(String value)
        {
            this.job_type = value;
            return this;
        }

        public Builder job_title(String value)
        {
            this.job_title = value;
            return this;
        }

        public Builder job_description(String value)
        {
            this.job_description = value;
            return this;
        }

        public Builder basic_salary(double value)
        {
            this.basic_salary = value;
            return this;
        }

        public Builder copy(Job value)
        {
            this.job_code = value.getJobCode();
            this.job_type = value.getJobType();
            this.job_title = value.getJobTitle();
            this.job_description = value.getJobDescription();
            this.basic_salary = value.getBasicSalary();

            return this;
        }

        public Job build()
        {
            return new Job(this);
        }
    }
}