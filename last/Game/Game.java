package last.Game;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Game {
    public static void PlayGame() {
        Scanner sth = new Scanner(System.in);
        int soBiAn = (int)(Math.random() * 100) + 1;
        int maxLuot = 10;
        int luot, soDoan = 0;

        for (luot = 0; luot < maxLuot; luot++) {
            System.out.println("Lan doan " + (luot + 1) + ", hay nhap so ma ban doan:");
            while (true) {
                try {
                    soDoan = sth.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Vui long nhap mot so nguyen.");
                    sth.next();
                }
            }

            if (soBiAn == soDoan) {
                System.out.println("Congratulations! Ban doan dung roi!!!");
                break;
            } else if (soBiAn > soDoan && luot != maxLuot - 1) {
                System.out.println("Ban doan thap hon so bi an roi.");
            } else if (soBiAn < soDoan && luot != maxLuot - 1) {
                System.out.println("Ban doan cao hon so bi an roi.");
            }
        }

        if (luot == maxLuot) {
            System.out.println("Ban da het " + maxLuot + " luot doan.");
            System.out.println("So bi an la: " + soBiAn);
        }
        sth.close();
    }
}

