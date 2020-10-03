import java.util.Scanner;

public class PersonClass {
    String firstName;
    String lastName;
    int age;
    String gender;


    public PersonClass(String iFirst, String iLast, int iAge, String iGender) {
        firstName = iFirst;
        lastName = iLast;
        age = iAge;
        gender = iGender;
    }

    public String details() {

        return (firstName + " " + lastName + "," + age + "," + gender);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String string = sc.nextLine();
        String l = sc.nextLine();
        int a = Integer.parseInt(sc.nextLine());
        String g = sc.nextLine();
        PersonClass person = new PersonClass(string, l, a, g);
        System.out.println(person.details());
    }
}
