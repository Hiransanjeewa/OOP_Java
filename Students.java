public class Students extends User{

    // To inherit parameters and methods from the parent class ,
    // Focus on code reuse and establish relationships between classes. 
   

        private boolean verified= false;

        void set_verified(boolean verified){
            
        }

        boolean get_verified(){
            return verified;
        }

        // we are using implements for interface classes same as extends 
        // but more rely on the behaviors.
        // We can override and overload methods that in the parent class
        // from the child class. 
    
    
}
