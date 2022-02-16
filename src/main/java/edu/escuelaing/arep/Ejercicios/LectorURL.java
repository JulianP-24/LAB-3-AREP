package edu.escuelaing.arep.Ejercicios;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.util.Scanner;

public class LectorURL {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Por favor ingresa la url:");
        String datosIngresados = scan.nextLine();

        try {
            URL pagina = new URL("https://www." + datosIngresados);
            BufferedReader reader = new BufferedReader(new InputStreamReader(pagina.openStream()));
            String in = null;
            FileOutputStream paginaHTML = new FileOutputStream("respuesta.html");
            while ((in = reader.readLine()) != null){
                paginaHTML.write((in.getBytes()));
            }
            paginaHTML.flush();
            paginaHTML.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
