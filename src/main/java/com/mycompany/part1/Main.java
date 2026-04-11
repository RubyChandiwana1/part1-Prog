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

     