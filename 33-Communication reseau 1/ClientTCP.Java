import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.IOException;
import java.io.PrintWriter;
import java.net.serverSocket;
import java.net.Socket;


public class main
{
    public static void main(String args[])
    
    {
        try
        {
            ServerSocket serverSocket = new ServerSocket(8585);
            System.out.println("Serveur en attrente ...");
            
            ServerSocket serverSocket = serverSocket.accept();
            System.out.println("Connexion etablie avec le serveur");
        
            BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter writer = new PrintWriter(clientSocket.getInputStream(),true);

            System.out.println(reader.readLine())
            writer.println("Message bien reçu !");

            clientSocket.close();
            serverSocket.close();
        }
    }
}