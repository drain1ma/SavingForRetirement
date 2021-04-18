import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Main main = new Main();
        Scanner sc = new Scanner(System.in);

        int B = sc.nextInt();
        int Br = sc.nextInt();
        int Bs = sc.nextInt();
        int A = sc.nextInt();
        int As = sc.nextInt();

        int years = Br - B; //years that B saved for

        int bTotalSavings = years * Bs; //savings for B
        int aSavings = As;
        System.out.print(main.age(bTotalSavings, As, aSavings, A));
        sc.close();
    }

    int age(int bTotalSavings, int As, int aSavings, int A){
        if (As > bTotalSavings) return A + 1;
        else return age(bTotalSavings, As + aSavings, aSavings, A + 1);
    }
}
