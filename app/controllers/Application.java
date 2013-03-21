package controllers;

import forms.*;
import play.mvc.*;
import play.*;
import play.data.*;
import views.html.*;

public class Application extends Controller {

	public static Result index() {
		String title = "逆ポーランド記法電卓";
		String message = "ここに表示されます";
		Form<MyForm> form1 = form(MyForm.class);
		return ok(index.render(title, message, form1));
	}

	public static Result input() {
		
		String title = "逆ポーランド記法電卓";
		Form<MyForm> form1 = form(MyForm.class).bindFromRequest();
		MyForm data = form1.get();
		String message = data.input;
		return ok(index.render(title, message, form1));
	}
}