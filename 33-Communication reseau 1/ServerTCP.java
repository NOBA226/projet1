import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTCP
{
    public static void main(String args[]) throws IOException
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
        catch(Exception e)
        {
        System.err.println("[ERREUR]"+ e);
        }
    }
}