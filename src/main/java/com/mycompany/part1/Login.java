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
 



    



