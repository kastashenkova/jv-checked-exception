package core.basesyntax;

public class UserService {
    private static final String message = "Your passwords are incorrect. Try again.";
    private final PasswordValidator validator = new PasswordValidator();

    public void registerUser(User user) {
        try {
            validator.validate(user.getPassword(), user.getRepeatPassword());
            saveUser(user);
        } catch (PasswordValidationException e) {
            try {
                throw new PasswordValidationException(message);
            } catch (PasswordValidationException ex) {
                throw new RuntimeException(ex);
            }
        }
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
