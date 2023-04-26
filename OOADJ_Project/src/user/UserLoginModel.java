package user;

public class UserLoginModel {

    private String username;
    private String password;

    public UserLoginModel() {
        this.username = "";
        this.password = "";
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean validateUsername(String username) {
        // TODO: Implement this method.
        return true;
    }

    public boolean validatePassword(String password) {
        // TODO: Implement this method.
        return true;
    }

    public boolean login(String username, String password) {
        // TODO: Implement this method.
        return true;
    }

}