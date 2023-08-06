import java.util.*;
public class FirstTask{

    static int userScore = 0;
    static int noOfAttempts = 0; 

    public static void attempt(int userGuess, int randomNumber, int limitedAttempts){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        if(userGuess == randomNumber){
            System.out.println("Congratulations, you have guessed the correct number!!");
            userScore++;
            noOfAttempts++;
            System.out.println();

            System.out.println("Your total score is: "+userScore);
            System.out.println("Your total attempts till now: "+ noOfAttempts);
            System.out.println();

            char playAgain;
            System.out.println("Do you want to play again if yes type 'y' else type 'n'");
            playAgain = sc.next().charAt(0);

            if(playAgain == 'y'){
                limitedAttempts = 5;

                randomNumber = rand.nextInt(10);

                System.out.println("Please Guess the number : ");
                userGuess = sc.nextInt();

                attempt(userGuess, randomNumber, limitedAttempts);
            } else {
                return;
            }
        } else{
            while(userGuess != randomNumber && limitedAttempts != 0){
                 System.out.println("You have guessed the wrong number, Please guess once more: ");
                 userGuess = sc.nextInt();
                 if(userGuess == randomNumber) {
                     System.out.println("Congratulations, you have guessed the correct number!!");
                     userScore++;

                     noOfAttempts++;

                    System.out.println();

                    System.out.println("Your total score is: "+userScore);
                     System.out.println("Your total attempts till now: "+ noOfAttempts);
                     System.out.println();

                    char playAgain;
                    System.out.println("Do you want to play again if yes type 'y' else type 'n'");
                    playAgain = sc.next().charAt(0);

                    if(playAgain == 'y'){
                        limitedAttempts = 5;

                        randomNumber = rand.nextInt(10);

                        System.out.println("Please Guess the number : ");
                        userGuess = sc.nextInt();
                    } else{
                        break;
                    }
                 } else{
                    limitedAttempts--;
                 }
                 if(limitedAttempts == 0){
                    System.out.println("Sorry, You have lost your all attemps!!");
                    noOfAttempts++;

                    System.out.println();
                    System.out.println("Your total score is: "+userScore);

                     System.out.println("Your total attempts till now: "+ noOfAttempts);

                    System.out.println();

                    char playAgain;
                    System.out.println("Do you want to play again if yes type 'y' else type 'n'");
                    playAgain = sc.next().charAt(0);

                    if(playAgain == 'y'){
                        limitedAttempts = 5;
                        randomNumber = rand.nextInt(10);

                        System.out.println("Please Guess the number : ");
                        userGuess = sc.nextInt();
                    } else{
                        break;
                    }
                 }
             }
        }
    }

     public static void main(String []args){
         Scanner sc = new Scanner(System.in);
         Random rand = new Random();
         
         int randomNumber = rand.nextInt(10);
         int limitedAttempts = 5;
         System.out.println("Please Guess the number : ");
         int userGuess = sc.nextInt();


         attempt(userGuess, randomNumber, limitedAttempts);


     }
}