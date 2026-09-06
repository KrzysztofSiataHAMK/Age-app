public class App {
    public static void main(String[] args) throws Exception {
        int age = 100; 
        
        if (age > 0 && age < 18) 
        { 
            System.out.println("You are underage."); 
        if (age >= 15) 
            { 
                System.out.println("You can drive a moped."); 
            } 
        } 
        else if (age >= 65) 
        { 
            System.out.println("You are retired."); 
        } 
        else 
        { 
            System.out.println("You are an adult."); 
        }
        if (age == 18) {
            System.out.println("You can drive a car.");
        }
        if (age == 30) {
            System.out.println("Enjoy your thirties!");
        } 
        if (40 <= age && age <= 50) {
            System.out.println("Happy mid-life.");
        }
        if (age % 10 == 0) {
            System.out.println("Anniversary party!!");
        }
        if (age == 100) {
            System.out.println("Congratulations!");
        }
        if (age > 122) {
            System.out.println("You are the longest living human in history!");
        }
        if (age % 13 == 0) {
            System.out.println("Fun fact: your age is divisible by 13!");
        }
    }
}
