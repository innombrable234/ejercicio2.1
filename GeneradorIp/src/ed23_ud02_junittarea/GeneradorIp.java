package ed23_ud02_junittarea;

import java.util.Random;

public class GeneradorIp {
    private Random random;

    public GeneradorIp() {
        this.random = new Random();
    }

    public int generarNumero(int min, int max) {
        return random.nextInt(max - min + 1) + min;
    }

    public String generarIp() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            sb.append(generarNumero(0, 255));
            if (i < 3) {
                sb.append(".");
            }
        }
        return sb.toString();
    }
}
