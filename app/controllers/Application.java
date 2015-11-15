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

    @Security.Authenticated(model.Authentication.class)
    public Result main() { return ok(main.render()); }
}
