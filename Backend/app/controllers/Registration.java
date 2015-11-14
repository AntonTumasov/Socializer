package controllers;

import model.jdbc_classes.*;
import model.User;
import play.data.Form;
import play.mvc.*;

import java.sql.SQLException;

/**
 * Created by Admin on 08.11.2015.
 */
public class Registration extends Controller {
    Form<User> userForm = Form.form(User.class);

    public Result join() {
        if(session("username")!=null) {
            return badRequest("ti je na sait zashel? zashel. tak a nahuya ti togda eshe kakie-to zaprosy delaesh, mudak?");
        }

        User user = userForm.bindFromRequest().get();

        try {
            JDBCUsers.addUser(user.login, user.password);
            return ok("You are registered");
        } catch (SQLException e) {
            int errCode = e.getErrorCode();

            switch (errCode) {
                case(SQLErrorCodes.SQL_ERROR_DUPLICATE):
                    return badRequest("265: ti hui blya, framework ebaniy");
                default:
                    return badRequest("SQL error #" + errCode);
            }
        }
    }
}
