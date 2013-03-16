package controllers;

import play.*;
import play.mvc.*;
import models.*;
import views.html.*;
import play.data.*;

public class Application extends Controller {

	static Form<Calc> calcForm = form(Calc.class);
	
	public static Result index() {
		return ok(
				views.html.index.render(calcForm)
		);
	}

	public static Result input() {
		return TODO;
	}

	public static Result keisan() {
		return TODO;
	}

	public static Result output() {
		return TODO;
	}

}