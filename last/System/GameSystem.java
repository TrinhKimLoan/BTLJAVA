package last.System;

import last.Game.Game;
import last.Player.Player;
import java.util.Scanner;

public class GameSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten cua ban: ");
        String name = sc.nextLine();
        
        Player player = new Player(name);
        int maxLuot = 10;
        Game game = new Game(maxLuot);

        System.out.println("Chao mung " + player.getName() + " den voi tro choi doan so!");
        System.out.println("Ban co " + maxLuot + " luot de doan so bi an.");

        game.PlayGame(player);

        System.out.println("Lich su doan cua ban: " + player.getLichSuDoan());
        System.out.println("Cam on " + player.getName() + " da tham gia tro choi!");
        
        sc.close();
    }
}
