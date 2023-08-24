import java.util.ArrayList;
import java.util.List;


public class user_Lists {

    public static void main(String[] args) {
        
    User u =new User();
    u.set_name("Hiran");

    List<User> users = new ArrayList<User>();
    // Datatypes not match because left side we using interface (general), right side is a implementation
    
    users.add(u);
    users.add(new User("Sanjeewa",2));

    }



}
