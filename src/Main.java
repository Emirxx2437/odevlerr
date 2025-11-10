import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] sayilar = new int[50];
        Random x = new Random();

        for (int i = 0; i < sayilar.length; i++) {
            sayilar[i] = x.nextInt(100);
        }

        for (int i = 0; i < sayilar.length - 1; i++) {
            for (int k = i + 1; k < sayilar.length; k++) {
                if (sayilar[i] < sayilar[k]) {
                    int temp = sayilar[i];
                    sayilar[i] = sayilar[k];
                    sayilar[k] = temp;
                }
            }
        }
        for (int i = 0; i < sayilar.length; i++) {
            System.out.print(sayilar[i] + ",");
        }
    }
}
