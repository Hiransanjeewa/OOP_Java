import java.util.List;

public class User {


    // process of wrapping code and data together into a single unit. 
    // encapsulation hides complex, lower-level data. It can prevent unwanted access 
    // to sensitive data and hide information through access modifiers while also reducing erroneous human changes
    // The idea behind encapsulation is to hide the implementation details of an 
    // object from the outside world while providing well-defined interfaces for
    //  interacting with that object. This way, you can control how data is manipulated 
    //  and accessed, preventing unauthorized or unintended modifications that could 
    //  lead to unexpected behavior or errors.
    
    private String name;
    private int id;

    public static int age = 21; 
    public static List<User> userList;
    // With use of static we can manage memory of a class , using static keyword we can assign
    // values that is common for every instance of the class . like a constant . 
    public static void getusers() {
        for (User each : userList) {
            System.out.println(each.get_name());
        }
    }



    void set_name(String name){
        this.name=name;
    }
    void set_id(int id){
        this.id=id;
    }

    String get_name(){
        return this.name;
    }

    int get_id(){
        return this.id;
    }

    // Method overloading --->>> Allows classes to have methods with same name but different parameters.
    // helps to write generic code based on the parent class



    public User(String name,int id){
        set_name(name);
        set_id(id);
    }
    public User(){

    }
 

}
    // Constructers
    // When creating a class there is a default contructer. 
    // But when we create a custom contructer we can assign values to a object when it's creating.
    // No return types , Should match with the class name
    // Once we create a custom contructor the default constructer will no longere exit. We need to create it again we can provide default values


    // Overriding replacing a method that already exists . 