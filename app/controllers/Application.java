package controllers;

import java.util.*;

import com.avaje.ebean.*;
import models.*;
import play.*;
import play.mvc.*;
import play.data.*;
import static play.data.Form.*;
import views.html.*;

public class Application extends Controller {

	public static Result index() {
		String title = "逆ポーランド記法電卓";
		Form<Dbase> inputForm = form(Dbase.class);
		List<Dbase> inputLists = Dbase.find.all();
		return ok(index.render(title, inputForm, inputLists));
	}

	public static Result input() {
		Form<Dbase> inputForm = form(Dbase.class).bindFromRequest();
		if (!inputForm.hasErrors()) {
			inputForm.get().save();
		}
		return redirect(routes.Application.index());        
	}
}