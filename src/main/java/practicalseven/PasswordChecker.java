package practicalseven;

public class PasswordChecker {

  /**
   * The password to be checked for the PasswordChecker class.
   **/
  private String password;

  /**
   * The desired length of the password to be checked.
   **/
  private static int PASSWORD_MINIMUM_LENGTH = 10;

  /**
   * The constructor for the PasswordChecker.
   **/
  public PasswordChecker(String startingPassword) {
    password = startingPassword;
  }

  public boolean isValidPassword() {
    boolean isValidLength = false;
    boolean isValidCapitalized = false;
    boolean isValidLowerCase = false;
    boolean isValidNumber = false;
    int passwordIndex = 0;
    return true;
  }

}
