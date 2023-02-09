import java.util.Scanner;

public class Day3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        if (size < 0) {
            System.out.println("invalid input");
            return;
        }
        int cricketers[] = new int[size];
        for (int i = 0; i < size; i++) {
            cricketers[i] = sc.nextInt();
            if (cricketers[i] < 0) {
                System.out.println("invalid input");
                return;
            }
        }
        int requireScore = sc.nextInt();
        if(requireScore<0)
        {
            System.out.println("Invalid score");
            return;
        }

        for (int i = 0; i < size; i = i + 2) {
            if (cricketers[i + 1] > requireScore)
                System.out.println(cricketers[i]);
        }
    }
}
