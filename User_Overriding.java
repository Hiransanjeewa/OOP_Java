public class User_Overriding {

    private String name;
    private int id;

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



    public User_Overriding(String name,int id){
        set_name(name);
        set_id(id);
    }
    public User_Overriding(){
        
    }



    // Overriding method
    public String toString(){
        return "This is overriding the toString() method";  // we can return the values here
    }



    
}

// Once we run sout(User_Overriding) it prints the location of the object , by default it prints
// the location of the object 
// In same way we can overide the equals() method as well . We can use that method for different purposes. 
// Most of the time we override the methods inherited from the parent class

