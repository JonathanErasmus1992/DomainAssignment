package hotelmanagement.conf.factory;

import hotelmanagement.domain.User;

/**
 * Created by student on 2015/05/05.
 */
public class UserFactory
{
    public static User createUser( String username,
                                   String pass )
    {
        User user = new User
                .Builder( username )
                .password( pass )
                .build();

        return user;
    }

}
