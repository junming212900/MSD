import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws IOException {

        ServerSocket server = new ServerSocket(8080);

        while (true) {
            System.out.println("waiting for client to join...");
            Socket clientSocket = server.accept();
            ConnectionHandler ch = new ConnectionHandler(clientSocket);
            Thread thread = new Thread(ch);
            thread.start();
        }
    }
}