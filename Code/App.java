package Code;
/**
 * Allows users to interact with the criminal database software.
 * @author Blake Seekings
 * @version 0.0
 */
public class App {
  private UserManager userMan;
  
/*-------------------------------------------------------------------------------------------------
######################################### Object Creation #########################################
--------------------------------------------------------------------------------------------------*/

  public App() {
    UserManager.createManager(this);
  }

/*-------------------------------------------------------------------------------------------------
#################################### Managing User Interaction ####################################
---------------------------------------------------------------------------------------------------*/

  public void setManager(UserManager manager) {
    this.userMan = manager;
  }

  public void login(String username, String password) {
    if (username == null || password == null)
      return;
    this.userMan.login(username,password);
  }

  public void logout() {
    this.userMan.logout();
  }

}
