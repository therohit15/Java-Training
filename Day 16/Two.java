import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Two {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        try {

            Process listProfiles = Runtime.getRuntime().exec("netsh wlan show profiles");
            BufferedReader reader = new BufferedReader(new InputStreamReader(listProfiles.getInputStream()));
            String line;
            System.out.println("Saved Wi-Fi Profiles:");
            while ((line = reader.readLine()) != null) {
                if (line.trim().startsWith("All User Profile")) {
                    String profileName = line.split(":")[1].trim();
                    System.out.println("Profile: " + profileName);


                    Process showPassword = Runtime.getRuntime().exec(
                        "netsh wlan show profile name=\"" + profileName + "\" key=clear"
                    );
                    BufferedReader passReader = new BufferedReader(new InputStreamReader(showPassword.getInputStream()));
                    String passLine;
                    while ((passLine = passReader.readLine()) != null) {
                        if (passLine.trim().startsWith("Key Content")) {
                            String password = passLine.split(":")[1].trim();
                            System.out.println("Password: " + password);
                        }
                    }
                    System.out.println("-----------------------------");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}