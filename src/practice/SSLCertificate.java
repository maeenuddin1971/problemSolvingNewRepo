package practice;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class SSLCertificate {
    public static void main(String[] args) {
        try {
            // URL to send the POST request
            URL url = new URL("https://sappoq.fgvholdings.com/RESTAdapter/FGD/PH/PRUpdate/");

            // Request body
            String requestBody = "{\"SapRefNo\":\"2300019361\",\"TransactionType\":\"RFQ\",\"TransactionId\":\"Q240000800\",\"ITEM\":[{\"PRItemPreqItem\":\"00010\",\"PRItemMaterial\":\"000000000080009052P01\",\"PRItemQuantity\":100,\"PRItemPreqPrice\":200.00,\"PRItemPriceUnit\":1,\"PRItemDesVendor\":\"0100009606\"},{\"PRItemPreqItem\":\"00020\",\"PRItemMaterial\":\"000000000080009053P01\",\"PRItemQuantity\":100,\"PRItemPreqPrice\":100000.00,\"PRItemPriceUnit\":1,\"PRItemDesVendor\":\"0100002030\"}]}";

            // Basic Authentication credentials
            String username = "FGVEPROCRFC";
            String password = "P@ssw0rd";
            String authString = username + ":" + password;
            String authEncoded = Base64.getEncoder().encodeToString(authString.getBytes(StandardCharsets.UTF_8));

            // Create the HTTP connection
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setRequestProperty("Authorization", "Basic " + authEncoded);
            conn.setDoOutput(true);

            // Send the request body
            DataOutputStream out = new DataOutputStream(conn.getOutputStream());
            out.writeBytes(requestBody);
            out.flush();
            out.close();

            // Read the response
            int responseCode = conn.getResponseCode();
            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            // Print the response
            System.out.println("Response Code: " + responseCode);
            System.out.println("Response: " + response.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
