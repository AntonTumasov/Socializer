package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import play.mvc.*;
import play.mvc.Result;

import play.libs.ws.*;
import play.libs.F.Promise;

public class VK extends Controller {
    public Promise<Result> showWall(String id) {
        Promise<Result> finalPromise = model.VK.getUserInfo(id).map(res -> {
            return ok(views.html.test.render(res.get("fullname")));
        });

        return finalPromise;
    }
}