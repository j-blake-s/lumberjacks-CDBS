
import java.util.HashMap;

/**
 * Handles the creation, destruction, and storing of user info.
 * @author Blake Seekings
 * @version 0.0
 */
public class UserManager {
  private User user;
  private HashMap<String, User> users = new HashMap<String,User>();
  private HashMap<String, String> passwords = new HashMap<String,String>();
  



/*
---------------------------------------------------------------------------------------------------
######################################### Object Creation #########################################
---------------------------------------------------------------------------------------------------
*/

  private static UserManager ref = null;
  public static void createManager(App app) {
    if (UserManager.ref == null) {
      UserManager.ref = new UserManager();
      app.setManager(ref);
    }
  }


  private UserManager() {
    this.init();
  }

  private void init() {
    this.user = User.createUser(this);  //Set initial user to null access (access = 0)
    //TODO - Call loadInfo using userFile name
  }


/*
---------------------------------------------------------------------------------------------------
############################################ File I/O #############################################
---------------------------------------------------------------------------------------------------
*/

  public void readInfo(String userFile) {
    //TODO - Read user info from a given file
  }

  public void writeInfo(String userFile) {
    //TODO - Write user info to a given file or make file
  }


/*
---------------------------------------------------------------------------------------------------
########################################## Login/Logout ###########################################
---------------------------------------------------------------------------------------------------
*/

  public void login(String username, String password) {
    //TODO - Verify user
    this.user = this.users.get(username);
  }

  public void logout() {
    this.user = User.createUser(this);
  }
}
