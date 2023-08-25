import java.util.ArrayList;
import java.util.List;


public class user_Lists {

    public static void main(String[] args) {
        
    User u =new Students();
    u.set_name("Hiran");

    List<User> users = new ArrayList<User>();
    // Datatypes not match because left side we using interface (general), right side is a implementation
    
    users.add(u);
        User u2 =new Teacher();
        u2.set_name("sanjeewa");
    users.add(u2);

    //System.out.println(User.age);
    // Getting static values using the class 
    

    // Static methods
    User.userList= new ArrayList<User>();
    User.userList.add(u);
    User.userList.add(u2);
    // Imaging we have a static list in the class and we add data to it , and we need to print all the data in the list
    // we can create a static method in the class to print data in the list

    // Static method
    User.getusers();

    for (var each : User.userList) {
        each.verify();
    }

    }

    
    //Polymorphism is closely related to the concepts of inheritance and 
    //abstraction. It allows you to create a hierarchy of classes with a 
    //common base class and then use objects of different subclasses 
    //interchangeably while invoking methods defined in the base class.

  

    





}
