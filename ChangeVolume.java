import java.io.IOException;

public class ChangeVolume {

    static final String NIRCMD = "C:\\Users\\Lukas Wulff\\Desktop\\NIRCMD\\nircmd.exe";

    public static void main(String[] args) throws IOException {
        // Setzt die Systemlautstärke auf 100%
        Runtime.getRuntime().exec(NIRCMD + " setsysvolume 65535");
    }

}
