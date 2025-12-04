package core.basesyntax;

public class PasswordValidator {
    private static final String message = "Wrong passwords";

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password != null && repeatPassword != null) {
            if (!password.equals(repeatPassword) || password.length() < 10) {
                throw new PasswordValidationException(message);
            }
        }
    }
}
