package models;

import javax.persistence.*;
import play.db.ebean.*;

@Entity
public class Dbase extends Model {

	@Id
	public Long id;

	public String input;

	public static Finder<Long, Dbase> find = new Finder<Long, Dbase>(Long.class, Dbase.class);

}