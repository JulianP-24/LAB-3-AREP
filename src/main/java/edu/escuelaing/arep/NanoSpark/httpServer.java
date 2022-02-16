package edu.escuelaing.arep.NanoSpark;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class httpServer {
    public void start() throws IOException {
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(35000);
        } catch (IOException e) {
            System.err.println("Could not listen on port: 35000.");
            System.exit(1);
        }
        while (true) {
            Socket clientSocket = null;
            try {
                clientSocket = serverSocket.accept();
            } catch (IOException e) {
                System.err.println("Accept failed.");
                System.exit(1);
            }
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            String inputLine;
            String route = "";

            while ((inputLine = in.readLine()) != null) {
                System.out.println("Received: " + inputLine);if (inputLine.contains("GET")) {
                    route = inputLine.split(" ")[1];
                }
                if (!in.ready()) {
                    break;
                }
            }
            route = route.substring(1);
        }
    }
}
