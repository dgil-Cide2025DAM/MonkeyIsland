package com.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Declaramos las variables necesarias
        int insultosPiratas = 0;
        int respuestasInsultos = 0;
        int rondasJuego = 0;
        int puntosJugador = 0;
        int vidasJugador = 3;

        // 'n' para salir del juego | MUY IMPORTANTE
        char salirJuego = 'n';

        // Creamos el objeto Scanner para leer la entrada del usuario por la terminal
        Scanner sc = new Scanner(System.in);
        
        // Creamos el objeto Random para generar numeros aleatorios
        Random aleatorio = new Random();


        // Mostramos un mensaje de bienvenida al usuario
        System.out.println("Bienvenido al juego de insultos piratas!\n\n El juego consiste en que cada jugador debe elegir una opcion entre 3, solo una correcta. \n\n Si aciertas, ganas un punto, si fallas te quita una vida. Tienes 3 vidas. \n El juego termina cuando un jugador pierde todas sus vidas o se acaban las rondas. Para salir del juego, pulsa la letra 'n'. \n\n\n Buena suerte!");

        // Pedimos al usuario que introduzca el numero de rondas que quiere jugar
        System.out.println("Introduce el numero de rondas que quieres jugar: ");

        // Leemos el numero de rondas introducido por el usuario
        rondasJuego = sc.nextInt();
        System.out.println("El numero de rondas es: " + rondasJuego);


        // Mientras el jugador tenga vidas, el juego funcionara. 
        while ( vidasJugador > 0 || vidasJugador <= 3)

            // Bucle principal (rondas + insultos) del juego
            // ESTE ES EL JUEGO (ABAJO) Y SU BUCLE
            for (int i = 0; i < rondasJuego; i++) {
                // Mostramos el numero de rondas actual que lleva el Jugador
                System.out.println("El numero de rondas que llevas es: " + rondasJuego);

                // Imprimir un mensaje diciendo que el juego comenzara en breves instantes. 

            } 

        }
}