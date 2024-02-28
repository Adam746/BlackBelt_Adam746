// Access Modifier
// 'class' keyword
// class name
public class dog {
     // Declare data memebers
     String name;
     int age;
     int numLegs;
     String breed;
     double run_speed;

     // Constructors set up class when created (this 'function' gets called on creation of an instance of 'dog' class)
    public dog(String name_, int age_, int numLegs_, String breed_){
        this.name = name_;
        this.age = age_;
        this.breed = breed_;

        if(numLegs_ > 4){
            numLegs_ = 4;
        }
        this.numLegs = numLegs_;
    }

    // Getters and Setters
    public String getName(){ return name; }
    public void setName(String new_name){ this.name = new_name; }
    public int getAge(){ return age; }
    public void setAge(int new_age){ this.age = (new_age > 0) ? new_age : 1;}

    // Custom methods
    public String dog_report()
    {
        String[] report_text = new String[2];
        report_text[0] = getName();
        report_text[1] = String.valueOf(getAge());
        return "The dog's name is " + report_text[0] + " They are " + report_text[1] + " years old.";
    }

     // Main function for testing
     public static void main(String[] args)
     {
         // Create an class-object (instance) of the dog class
         dog my_pup = new dog("Barney", 13, 4, "Shi Tzu");
 
         System.out.println(my_pup.dog_report());
     }


}


