public class FizzBuzz_FUNCTION {
    public static void main(String[] args){

        // Add a for loop which includes the number of times to check fizz/buzz
        for (int myFizz = 1; myFizz < 100; myFizz++){

            System.out.println(myFizz);
            System.out.println(FizzBuzzEval(myFizz));
        }
    }

    public static String FizzBuzzEval(int num){
        if(num % 3 == 0 && num % 5 == 0){
            return "FIZZ-BUZZ";
        } else if(num % 3 == 0){
            return "FIZZ";
        } else if(num % 5 == 0){
            return "BUZZ";
        } else{
            return "---";
        }
    }
}

