
/**
 * Holds all the information for a user.
 * @author Blake Seekings
 * @version 0.0
 */
public class User {
  private int accessLevel = 0;


/*-------------------------------------------------------------------------------------------------
######################################### Object Creation #########################################
-------------------------------------------------------------------------------------------------*/

  public static User createUser(UserManager manager) {
    return new User();
  }

  private User(){}

/*-------------------------------------------------------------------------------------------------
######################################## Getters & Setters ########################################
--------------------------------------------------------------------------------------------------*/

  public int getAccessLevel() {
    return this.accessLevel;
  }
  
  public void setAccessLevel(int accessLevel) {
    this.accessLevel = accessLevel;
  }
}
