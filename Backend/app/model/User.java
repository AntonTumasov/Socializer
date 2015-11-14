package model;

import play.data.validation.Constraints.*;

/**
 * Created by Admin on 14.11.2015.
 */
public class User {
    public String login;
    public String password;

    public String validate() {
        if(login == null || password == null)
        {
            return "Invalid login or password";
        }
        return null;
    }
}
