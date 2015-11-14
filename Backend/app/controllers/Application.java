package controllers;

import play.mvc.*;
import views.html.*;

public class Application extends Controller {

    public Result index() {
        if(session("username")!=null)
            return redirect(routes.Application.main());
        else
            return ok(index.render());
    }

    public Result register() {
        if(session("username")!=null)
            return redirect(routes.Application.main());
        else
            return ok(register.render());
    }

    @Security.Authenticated(model.Authentication.class)
    public Result main() { return ok(main.render()); }
}
