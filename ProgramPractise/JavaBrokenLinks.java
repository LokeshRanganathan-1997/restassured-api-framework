package ProgramPractise;
import java.net.HttpURLConnection;
import java.net.URL;

public class JavaBrokenLinks {
    public static void main(String[] args) {
        String[] urls = {
            "https://www.google.com",         // valid
            "https://www.invalidsite123.com", // broken
            "https://example.com",            // valid
            "https://httpstat.us/404"         // broken
        };

        for (String link : urls) {
            try {
                URL url = new URL(link);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("GET");
                conn.connect();

                int responseCode = conn.getResponseCode();
                if (responseCode >= 400) {
                    System.out.println("❌ Broken: " + link + " → " + responseCode);
                } else {
                    System.out.println("✅ Working: " + link + " → " + responseCode);
                }
            } catch (Exception e) {
                System.out.println("❌ Broken: " + link + " → Exception: " + e.getMessage());
            }
        }
    }
}
