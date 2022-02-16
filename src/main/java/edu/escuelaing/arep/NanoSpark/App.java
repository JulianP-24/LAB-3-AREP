package edu.escuelaing.arep.NanoSpark;

import com.sun.net.httpserver.HttpServer;

import java.io.IOException;

public class App {
    public static void main (String[] args) throws IOException {
        httpServer servidor = new httpServer();
        servidor.start();
    }
}
