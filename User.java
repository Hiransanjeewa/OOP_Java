
public class User {


    // process of wrapping code and data together into a single unit. 
    //encapsulation hides complex, lower-level data. It can prevent unwanted access 
    //to sensitive data and hide information through access modifiers while also reducing erroneous human changes
    // The idea behind encapsulation is to hide the implementation details of an 
    // object from the outside world while providing well-defined interfaces for
    //  interacting with that object. This way, you can control how data is manipulated 
    //  and accessed, preventing unauthorized or unintended modifications that could 
    //  lead to unexpected behavior or errors.
    
    String name;
    int id;

    void set(String name){
        this.name=name;
    }
    void set(int id){
        this.id=id;
    }

    String get(){
        return this.name;
    }

    // Method overloading --->>> Allows classes to have methods with same name but different parameters.
    // helps to write generic code based on the parent class



    public User(String name,int id){
        set(name);
        set(id);
    }

}
    // Constructers
    // When creating a class there is a default contructer. 
    // But when we create a custom contructer we can assign values to a object when it's creating.
