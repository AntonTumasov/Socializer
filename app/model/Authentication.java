package model;

import controllers.routes;
import play.mvc.*;
import play.mvc.Http.*;

public class Authentication extends Security.Authenticator{
    @Override
    public String getUsername(Context ctx) {
        return ctx.session().get("username");
    }

    @Override
    public Result onUnauthorized(Context ctx) {
        return redirect(routes.Application.index());
    }
}