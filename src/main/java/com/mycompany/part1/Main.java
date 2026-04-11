import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
   System.out.print("Enter first name: ");
        String firstName = sc.nextLine();
        
System.out.print("Enter last name: ");
        String lastName = sc.nextLine();
        
        Login login = new Login(firstName, lastName);

System.out.print("Create username: ");
        String username = sc.nextLine();
        
System.out.print("Create password: ");
        String password = sc.nextLine();

 System.out.print("Enter cell phone number (international format, e.g. +27838968976): ");
        String cell = sc.nextLine();

        login.setRegistrationDetails(username, password, cell);

 System.out.println(login.returnUsernameCaptureMessage());
        System.out.println(login.returnPasswordCaptureMessage());
        System.out.println(login.returnCellPhoneCaptureMessage());
        System.out.println(login.registerUser());