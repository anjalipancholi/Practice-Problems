public class Person {

  private String firstName;

  private String lastName;

  private int age;

  private String gender;
  private String fullName;

  public static void main(String[] args) {
    Person person = new Person();
    System.out.println(person.getFullName() + "," + person.getAge() + "," + person.getGender());
  }

  String getFirstName() {
    return this.firstName;
  }

  void setFirstName(String fname) {
    this.firstName = fname;
  }

  String getLastName() {
    return this.lastName;
  }

  void setLastName(String lname) {
    this.lastName = lname;
  }

  int getAge() {
    return this.age;
  }

  void setAge(int nage) {
    if ((nage < 0)) {
      throw new IllegalArgumentException();
    }
    this.age = nage;
  }

  String getGender() {
    return this.gender;
  }

  void setGender(String gender) {
    if (gender.matches("Male|Female|Other")) {
      this.gender = gender;
    } else {
      throw new IllegalArgumentException();
    }
  }

  String getFullName() {
    return this.fullName;
  }

}


