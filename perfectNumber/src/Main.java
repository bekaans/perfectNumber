import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int total=0;

        System.out.println("Enter The Number Here :"); int number = inp.nextInt();

        for (int i =1 ; i<number ; i++)

        {
            if (number%i==0)
            {
                total+=i;
            }
        }

        if(total==number)
        {
            System.out.println("Mükemmel Sayıdır");
        }

        else
        {
            System.out.println("Mükemmel Sayı Değildir");
        }
    }
}