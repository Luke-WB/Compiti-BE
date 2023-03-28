package Main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {

    private String url = "jdbc:postgresql://localhost:5432/";
    private String dbName = "Compito 28-3";
    private String username = "postgres";
    private String password = "root";
    Statement st;

    public DBConnection() throws SQLException {
	Connection conn = DriverManager.getConnection(url + dbName, username, password);
	st = conn.createStatement();
	createTable();
    }

    public void createTable() throws SQLException {
	String sql = "CREATE TABLE IF NOT EXISTS school_students(" + "id SERIAL PRIMARY KEY," + "name VARCHAR NOT NULL,"
		+ "lastname VARCHAR NOT NULL," + "gender VARCHAR NOT NULL," + "birthdate VARCHAR NOT NULL,"
		+ "avg DECIMAL NOT NULL," + "min_vote INT NOT NULL," + "max_vote INT NOT NULL)";
	this.st.executeUpdate(sql);
    }

    public void insertStudent(Student s) throws SQLException {
	String sql = "INSERT INTO school_students (name, lastname, gender, birthdate, avg, min_vote, max_vote)"
		+ "VALUES ('" + s.getName() + "', '" + s.getLastname() + "', '" + s.getGender() + "', '"
		+ s.getBirthdate() + "', '" + s.getAvg() + "', '" + s.getMin_vote() + "', '" + s.getMax_vote() + "')";
	this.st.executeUpdate(sql);
	System.out.println("utente creato");
    }

    public Student findUser(Integer id) throws SQLException {
	Student utente = null;
	String sql = "SELECT * FROM school_students Where id = " + id;
	ResultSet rs = this.st.executeQuery(sql);
	if (rs.next()) {
	    long id_student = rs.getLong("id");
	    String name = rs.getString("name");
	    String lastname = rs.getString("lastname");
	    String gender = rs.getString("gender");
	    String birthdate = rs.getString("birthdate");
	    double avg = rs.getDouble("avg");
	    int min_vote = rs.getInt("min_vote");
	    int max_vote = rs.getInt("max_vote");
	    utente = new Student(id_student, name, lastname, gender, birthdate, avg, min_vote, max_vote);
	}
	return utente;
    }

    public void deleteUser(Student s) throws SQLException {
	String sql = "DELETE FROM school_students WHERE id = " + s.getId();
	this.st.executeUpdate(sql);
	System.out.println("Utente eliminato!!!");
    }

}
