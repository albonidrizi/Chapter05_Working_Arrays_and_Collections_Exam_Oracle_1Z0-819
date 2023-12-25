import java.io.IOException;

    public class ShutdownComputer {
        public static void main(String[] args) {
            String shutdownCommand = "";
            String operatingSystem = System.getProperty("os.name").toLowerCase();

            if (operatingSystem.contains("win")) {
                shutdownCommand = "shutdown.exe -s -t 0"; // Ndal kompjuterin në Windows menjëherë
            } else if (operatingSystem.contains("nix") || operatingSystem.contains("nux") || operatingSystem.contains("mac")) {
                shutdownCommand = "shutdown -h now"; // Ndal kompjuterin në Unix/Linux/macOS
            } else {
                System.out.println("Sistemi operativ nuk është i njohur për të ndaluar automatikisht.");
                return;
            }

            try {
                Runtime.getRuntime().exec(shutdownCommand);
            } catch (IOException e) {
                System.out.println("Gabim gjatë ekzekutimit: " + e.getMessage());
            }

        }
    }

