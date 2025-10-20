package com.example;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Declaramos las variables necesarias
        int rondasJuego = 0;
        int puntuacion = 0;
        int vidasJugador = 3;
        String[] insultosPiratas = {"¿Has dejado ya de usar pañales?",
            "¿Conoces alguna isla desierta donde esconderte?", "Eres tan inutil, grumete!", "¿Por qué no te subes a un barril y te lanzas al mar?",
            "¿Acaso crees que puedes con un verdadero pirata?", "¿Te gustaría ser mi aprendiz de pirata?", "¿Por qué no te vas a buscar un tesoro en vez de molestarme?", "¿Acaso piensas que eres más listo que yo?",
            "¿Por qué no te largas de mi barco, inútil?"
        };

        String[] respuestasInsultos = {"¿Por qué? ¿Acaso querías pedir uno prestado?", "No, pero seguro que tú conoces alguna.",
            "Espero que ya hayas aprendido a tocarte la nariz.", "Buena idea, así me libraría de ti.",
            "Claro que no, pero al menos lo intento.", "No gracias, ya tengo suficiente con un aprendiz inútil como tú.", "Porque no eres más que un lastre para mi tripulación.",
            "No, pero tú pareces creerlo.", "Porque eres un estorbo en mi barco."
        };
        String[] respuestasInsultosIncorrectas = {"¿Por qué? ¿Acaso querías pedir uno prestado?", "No, pero seguro que tú conoces alguna.",
            "Espero que ya hayas aprendido a tocarte la nariz.", "Buena idea, así me libraría de ti.",
            "Claro que no, pero al menos lo intento.", "No gracias, ya tengo suficiente con un aprendiz inútil como tú.", "Porque no eres más que un lastre para mi tripulación.",
            "No, pero tú pareces creerlo.", "Porque eres un estorbo en mi barco."
        };

        boolean es

        // 'n' para salir del juego | MUY IMPORTANTE
        char salirJuego = 'n';

        // Creamos el objeto Scanner para leer la entrada del usuario por la terminal
        Scanner sc = new Scanner(System.in);

        // Creamos el objeto Random para generar numeros aleatorios
        Random random = new Random();

        // Contador de Insultos y Respuestas, para eliminar las que ya se han usado
        int insultosRestantes = insultosPiratas.length; // .length da el tamaño o el numero de elementos en un array, no de un ArrayList.
        int respuestasIncorrectas = respuestasInsultosIncorrectas.length;

        // Mostramos un mensaje de bienvenida al usuario
        System.out.println("Bienvenido al juego de insultos piratas!\n\n El juego consiste en que cada jugador debe elegir una opcion entre 3, solo una correcta. \n\n Si aciertas, ganas un punto, si fallas te quita una vida. Tienes 3 vidas. \n El juego termina cuando un jugador pierde todas sus vidas o se acaban las rondas. Para salir del juego, pulsa la letra 'n'. \n\n\n Buena suerte!");

        // Pedimos al usuario que introduzca el numero de rondas que quiere jugar
        System.out.println("Introduce el numero de rondas que quieres jugar: ");

        // Leemos el numero de rondas introducido por el usuario
        rondasJuego = sc.nextInt();
        System.out.println("El numero de rondas es: " + rondasJuego);

        while (rondasJuego > 0) {
            // Mientras el jugador tenga vidas, el juego funcionara. 
            // Bucle principal (rondas + insultos) del juego
            
            while (vidasJugador > 0) {
                // Cada ronda es un insulto nuevo
                // por lo que las respuestas del usuario son 3, y son respuestas a los insultos
                int insultos = random.nextInt(insultosRestantes); // Indice de Insultos, selecciona un insulto para mostrarlo luego, y que se elimine del array para que no vuelva a aparecer.
                System.out.println("El pirata te dice: " + insultosPiratas[insultos]); // te printea el insulto del pirata
                int respuestas = random.nextInt(respuestasIncorrectas); // ocurre igual que el indices de insultos
                
                String ultimoInsulto = insultosPiratas[insultosRestantes - 1]; // restamos el insulto mostrado
                insultosPiratas[insultos] = ultimoInsulto;
                insultosRestantes--; // Decrementamos el contador de insultos restantes
                Array.equals()
                System.out.println("a.) " + respuestasInsultos + "b.) " + respuestasInsultosIncorrectas[respuestas] + "c.) " + respuestasInsultosIncorrectas[respuestas]);
                char respuestaUsuario = sc.next().charAt(0); // leemos el primer caracter, ubicado en el index 0 (charAt(0))

                // Comprobamos si la respuesta del usuario es correcta
                if (true) {
                    respuestaCorrecta = true;
                    System.out.println("Has acertado!");
                    ++puntuacion;
                } else {
                    respuestaCorrecta = false;
                    System.out.println("Has fallado!\n Has perdido una vida.");
                    --vidasJugador;
                    System.out.println("Te quedan estas vidas: " + vidasJugador);
                    System.out.println("Tienes esta " + puntuacion);

                }
            }
        }
    }
