package last.Player;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private List<Integer> lichSuDoan;
    private int soLuotDoan;

    public Player(String name) {
        this.name = name;
        this.lichSuDoan = new ArrayList<>();
        this.soLuotDoan = 0;
    }

    public String getName() {
        return name;
    }

    public void addSoLuotDoan(int soLuot) {
        lichSuDoan.add(soLuot);
        soLuotDoan++;
    }

    public List<Integer> getLichSuDoan() {
        return lichSuDoan;
    }

    public int getSoLuotDoan() {
        return soLuotDoan;
    }
}