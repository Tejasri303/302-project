package WisdomBites.model;

public class User
{
    // Establish the attributes of the User class
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String passWord;

    // Create a Constructor for the User class
    // Inputs:
    //      firstName: String,
    //      lastName: String,
    //      email: String,
    //      passWord: String
    public User(String firstName, String lastName, String email, String passWord) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.passWord = passWord;
    }

    // get and set methods for each attribute for the User class
    public int getId() {return id;}

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {return firstName;}
    public void setFirstName(String firstName) {this.firstName = firstName;}

    public String getLastName() {return lastName;}
    public void setLastName(String lastName) {this.lastName = lastName;}

    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}

    public String getPassWord() {return passWord;}
    public void setPassWord(String passWord) {this.passWord = passWord; }


}