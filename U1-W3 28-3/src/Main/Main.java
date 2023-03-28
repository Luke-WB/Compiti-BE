package Main;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
	try {
	    DBConnection db = new DBConnection();

	    Student utente1 = new Student("Mario", "Rossi", "M", "1997/8/4", 8.5, 5, 9);
	    db.insertStudent(utente1);
	    Student utente2 = new Student("Mario", "Rossi", "M", "1997/8/4", 8.5, 5, 9);
	    db.insertStudent(utente2);
	    Student utente3 = new Student("Mario", "Rossi", "M", "1997/8/4", 8.5, 5, 9);
	    db.insertStudent(utente3);

	    Student utenteLetto = db.findUser(1);
	    System.out.println(utenteLetto);
	    db.deleteUser(utenteLetto);

	} catch (SQLException e) {
	    e.printStackTrace();
	}

    }

}
