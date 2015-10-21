package controllers;

import enums.CharacterType;
import models.Character;
import models.BaseEntity;
import models.Monster;
import play.*;
import play.libs.Json;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("Your new application is ready."));
    }

    public static Result test() {
        Monster monster = new Monster("elpy" + System.currentTimeMillis(), CharacterType.NEUTRAL);
        monster.save();
        return ok(Json.toJson(Monster.find.all()));
    }
}
