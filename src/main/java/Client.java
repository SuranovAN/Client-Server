import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    static String host = "netology.homework";
    static int port = 23222;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try (
                Socket clientSocket = new Socket(host, port);
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {
            out.println("Some User");
            String resp = in.readLine();
            System.out.println(resp);
            System.out.println(in.readLine());
            out.println("Lesha");
            System.out.println(in.readLine());
            out.println("yes");
            System.out.println(in.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
