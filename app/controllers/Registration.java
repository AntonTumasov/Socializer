package controllers;

import model.jdbc_classes.*;
import model.User;
import play.data.Form;
import play.mvc.*;
import views.html.*;

import java.sql.SQLException;

/**
 * Created by Admin on 08.11.2015.
 */
public class Registration extends Controller {
    Form<User> userForm = Form.form(User.class);

    public Result show() {
        if(session("username")!=null)
            return redirect(routes.Application.main());
        else
            return ok(register.render());
    }

    public Result registrate() {

        User user = userForm.bindFromRequest().get();

        try {
            JDBCUsers.addUser(user.login, user.password);
            return ok("You are registered");
        } catch (SQLException e) {
            int errCode = e.getErrorCode();

            switch (errCode) {
                case(SQLErrorCodes.SQL_ERROR_DUPLICATE):
                    return badRequest("265");
                default:
                    return badRequest("SQL error #" + errCode);
            }
        }
    }
}
