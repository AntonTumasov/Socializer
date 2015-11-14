package controllers;

import model.jdbc_classes.JDBCUsers;
import model.User;
import play.data.*;
import play.mvc.*;
import java.util.Objects;

public class Authentication extends Controller {
    Form<User> userForm = Form.form(User.class);
    public Result auth() {
        if (userForm.hasErrors()) {
            return redirect(routes.Application.index()); // blyadsyka
        } else {
            User userClient = userForm.bindFromRequest().get();
            User userServer = JDBCUsers.findUser(userClient.login);

            if (userServer == null) {
                return redirect(routes.Application.index()); // user not found
            }

            if (Objects.equals(userClient.password, userServer.password)) {
                session().clear();
                session("username", userClient.login);

                return redirect(routes.Application.main());
            }

            return redirect(routes.Application.index()); // invalid password
        }
    }

    public Result logout() {
        if(session("username")!=null) {
            session().clear();
        }
        return redirect(routes.Application.index());
    }
}
