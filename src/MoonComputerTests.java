import java.util.NoSuchElementException;
import java.util.Scanner;

class PassportFormCreator{

    public void createForms() {
        Scanner scanner = new Scanner(System.in);

        String name;

        try {
            name = scanner.nextLine();
        } catch (NoSuchElementException exception) {
            name = "";
        }


        String surname;
        try {
            surname = scanner.nextLine();
        } catch (NoSuchElementException exception) {
            surname = "";
        }

        int age;
        try {
            age = scanner.nextInt();
        } catch (NoSuchElementException exception) {
            age = -1;
        }



        System.out.println(name + " " + surname + " " + age * 10);
        System.out.println(name.toUpperCase());
        System.out.println(surname.toUpperCase());
        System.out.print(age * 10);
        scanner.close();
    }
    public static void main(String[] args) {
        PassportFormCreator P = new PassportFormCreator();
        P.createForms();
    }

}