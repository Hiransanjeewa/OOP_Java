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

// Once we run sout(User_Overriding) it prints the location of the object , by default it prints
// the location of the object 



    
}
