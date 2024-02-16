import java.util.Scanner;
public class UserAuth {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please input your User Name:");
        String userName = userInput.nextLine();

        if(userNameAuth(userName)){
            System.out.println("Hello " + userName + " Pease enter your password:");
            String userPass = userInput.nextLine();
            if(userPassAuth(userPass)){
                System.out.println("Password ACCEPTED: Logging ON.");
            }
            else{
                System.out.println("Incorrect Password");
            }
        }
        else{
            System.out.println("NO user found.");
        }

        userInput.close();
    }

    public static Boolean userNameAuth(String uName){
        if(uName.equals("Kev45")){
            return true;
        }
        else{
            return false;
        }
    }

    public static Boolean userPassAuth(String uPass){
        if(uPass.equals("password")){
            return true;
        }
        else{
            return false;
        }
    }
}
