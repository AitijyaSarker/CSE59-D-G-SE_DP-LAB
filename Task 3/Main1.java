
package SRP_Task;

public class Main {

    public static void main(String[] args) {
        
    }
}

class User {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getUsername() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}

class EmailValidator {
    public static boolean isValidEmail(String email) {
        // Simple email validation logic
        if (email != null && email.contains("@")) {
            return true;
        }
        System.out.println("Invalid email format: " + email);
        return false;
    }
}

class UserRepository {
    public void saveToDatabase(User user) {
        if (EmailValidator.isValidEmail(user.getEmail())) {
            System.out.println("Connecting to database...");
            System.out.println("Saving user " + user.getUsername() + " to the users table.");
            return;
        }
        
    }
}
