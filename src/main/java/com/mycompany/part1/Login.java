import java.util.Objects;
import java.util.regex.Pattern;

public class Login {
    private static final Pattern PASSWORD_HAS_UPPER = Pattern.compile("[A-Z]");
    private static final Pattern PASSWORD_HAS_DIGIT = Pattern.compile("\\d");
    private static final Pattern PASSWORD_HAS_SPECIAL = Pattern.compile("[^a-zA-Z0-9]");
    
      // International format: +<countryCode><number>, where the number is <= 10 digits.
    // Reference: QuickBlox beginner chat app architecture, used in assignment brief.
    // https://quickblox.com/blog/beginner-guide-to-chat-app-architecture/
    private static final Pattern INTERNATIONAL_CELL_PATTERN = Pattern.compile("^\\+\\d{1,3}\\d{1,10}$");

private final String firstName;
private final String lastName;

 private String registeredUsername;
    private String registeredPassword;
    private String registeredCell;

 public Login(String firstName, String lastName) {
        this.firstName = Objects.requireNonNull(firstName, "firstName");
        this.lastName = Objects.requireNonNull(lastName, "lastName");
    }
 
 public void setRegistrationDetails(String username, String password, String cellPhoneNumber) {
        this.registeredUsername = username;
        this.registeredPassword = password;
        this.registeredCell = cellPhoneNumber;
    }
 public boolean checkUserName() {
        if (registeredUsername == null) return false;
        return registeredUsername.contains("_") && registeredUsername.length() <= 5;
    }
 
    public boolean checkPasswordComplexity() {
        if (registeredPassword == null) return false;
        if (registeredPassword.length() < 8) return false;
        if (!PASSWORD_HAS_UPPER.matcher(registeredPassword).find()) return false;
        if (!PASSWORD_HAS_DIGIT.matcher(registeredPassword).find()) return false;
        return PASSWORD_HAS_SPECIAL.matcher(registeredPassword).find();
    }
      public boolean checkCellPhoneNumber() {
        if (registeredCell == null) return false;
        return INTERNATIONAL_CELL_PATTERN.matcher(registeredCell).matches();
    }
       public String registerUser() {
        boolean usernameOk = checkUserName();
        boolean passwordOk = checkPasswordComplexity();

        if (!usernameOk) {
            return "Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length.";
        }

        if (!passwordOk) {
            return "Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.";
        }

        return "The two above conditions have been met and the user has been registered successfully.";
    }
        public boolean loginUser(String username, String password) {
        return Objects.equals(registeredUsername, username) && Objects.equals(registeredPassword, password);
    }
        
    public boolean loginUser(String username, String password) {
        return Objects.equals(registeredUsername, username) && Objects.equals(registeredPassword, password);
    }
    
    public String returnLoginStatus(boolean loginSuccessful) {
        if (loginSuccessful) {
            return "Welcome " + firstName + ", " + lastName + " it is great to see you again.";
        }
        return "Username or password incorrect, please try again.";
    }
    
    public String returnUsernameCaptureMessage() {
        return checkUserName()
                ? "Username successfully captured."
                : "Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length.";
    }

    
    

    
        



 

 



    



