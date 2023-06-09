package Main;

public class Student {
    private long id;
    private String name;
    private String lastname;
    private String gender;
    private String birthdate;
    private double avg;
    private int min_vote;
    private int max_vote;

    public Student(String name, String lastname, String gender, String birthdate, Double avg, Integer min_vote,
	    Integer max_vote) {
	super();
	this.name = name;
	this.lastname = lastname;
	this.gender = gender;
	this.birthdate = birthdate;
	this.avg = avg;
	this.min_vote = min_vote;
	this.max_vote = max_vote;
    }

    public Student(Long id, String name, String lastname, String gender, String birthdate, Double avg, Integer min_vote,
	    Integer max_vote) {
	super();
	this.id = id;
	this.name = name;
	this.lastname = lastname;
	this.gender = gender;
	this.birthdate = birthdate;
	this.avg = avg;
	this.min_vote = min_vote;
	this.max_vote = max_vote;
    }

    public long getId() {
	return id;
    }

    public void setId(long id) {
	this.id = id;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getLastname() {
	return lastname;
    }

    public void setLastname(String lastname) {
	this.lastname = lastname;
    }

    public String getGender() {
	return gender;
    }

    public void setGender(String gender) {
	this.gender = gender;
    }

    public String getBirthdate() {
	return birthdate;
    }

    public void setBirthdate(String birthdate) {
	this.birthdate = birthdate;
    }

    public double getAvg() {
	return avg;
    }

    public void setAvg(double avg) {
	this.avg = avg;
    }

    public int getMin_vote() {
	return min_vote;
    }

    public void setMin_vote(int min_vote) {
	this.min_vote = min_vote;
    }

    public int getMax_vote() {
	return max_vote;
    }

    public void setMax_vote(int max_vote) {
	this.max_vote = max_vote;
    }

    @Override
    public String toString() {
	return "Student [id=" + id + ", name=" + name + ", lastname=" + lastname + ", gender=" + gender + ", birthdate="
		+ birthdate + ", avg=" + avg + ", min_vote=" + min_vote + ", max_vote=" + max_vote + "]";
    }

}
