package Bai1;

public class Person {
    private String Name;
    private String DateOfBirth;
    private String Gender;
    private String Hobby;
    public Person() {

    }

    public Person(String name, String dateOfBirth, String gender, String hobby) {
        Name = name;
        DateOfBirth = dateOfBirth;
        Gender = gender;
        Hobby = hobby;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getHobby() {
        return Hobby;
    }

    public void setHobby(String hobby) {
        Hobby = hobby;
    }

}
