import java.util.Objects;
import java.util.regex.Pattern;

public class Login {
    private static final Pattern PASSWORD_HAS_UPPER = Pattern.compile("[A-Z]");
    private static final Pattern PASSWORD_HAS_DIGIT = Pattern.compile("\\d");
    private static final Pattern PASSWORD_HAS_SPECIAL = Pattern.compile("[^a-zA-Z0-9]");

