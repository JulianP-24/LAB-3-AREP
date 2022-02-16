package edu.escuelaing.arep.Ejercicios;

import java.net.MalformedURLException;
import java.net.URL;

public class AppURL {
    public static void main(String[] args) {
        try {
            URL facebookURL = new URL("http://www.facebook.com");
            System.out.println("Protocol: " + facebookURL.getProtocol()+"\n");
            System.out.println("Authority: " + facebookURL.getAuthority()+"\n");
            System.out.println("Host: " + facebookURL.getHost()+"\n");
            System.out.println("Port: " + facebookURL.getPort()+"\n");
            System.out.println("Path: " + facebookURL.getPath()+"\n");
            System.out.println("Query: " + facebookURL.getQuery()+"\n");
            System.out.println("File: " + facebookURL.getFile()+"\n");
            System.out.println("Ref: " + facebookURL.getRef()+"\n");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}