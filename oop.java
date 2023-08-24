

public class oop {
    public static void main(String[] args) {
     //   System.out.println("Hello");
        User u  = new User();
        
        u.set_name("Hiran");


        // contructor calling
        User u2  = new User("Hiran",2);

        User_Overriding user_Overriding = new User_Overriding();
        System.out.println(user_Overriding);



}
}
