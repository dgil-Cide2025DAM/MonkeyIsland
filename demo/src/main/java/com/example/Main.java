package com.example;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Declaramos las variables necesarias
        int rondasJuego = 0;
        int puntuacion = 0; // puntuacion = vidas
        
        String[] insultosPiratas = { "¿Has dejado ya de usar pañales?",
                "¿Conoces alguna isla desierta donde esconderte?", "Eres tan inutil, grumete!",
                "¿Por qué no te subes a un barril y te lanzas al mar?",
                "¿Acaso crees que puedes con un verdadero pirata?", "¿Te gustaría ser mi aprendiz de pirata?",
                "¿Por qué no te vas a buscar un tesoro en vez de molestarme?",
                "¿Acaso piensas que eres más listo que yo?",
                "¿Por qué no te largas de mi barco, inútil?"
        };

        String[] respuestasInsultos = { "¿Por qué? ¿Acaso querías pedir uno prestado?",
                "No, pero seguro que tú conoces alguna.",
                "Espero que ya hayas aprendido a tocarte la nariz.", "Buena idea, así me libraría de ti.",
                "Claro que no, pero al menos lo intento.",
                "No gracias, ya tengo suficiente con un aprendiz inútil como tú.",
                "Porque no eres más que un lastre para mi tripulación.",
                "No, pero tú pareces creerlo.", "Porque eres un estorbo en mi barco."
        };
        String[] respuestasInsultosIncorrectas = { "No, pero seguro que tú conoces alguna.",
                "Espero que ya hayas aprendido a tocarte la nariz.", "Buena idea, así me libraría de ti.",
                "Claro que no, pero al menos lo intento.",
                "No gracias, ya tengo suficiente con un aprendiz inútil como tú.",
                "Porque no eres más que un lastre para mi tripulación.",
                "No, pero tú pareces creerlo.", "Porque eres un estorbo en mi barco.",
                "¿Por qué? ¿Acaso querías pedir uno prestado?"
        };
        // respuestasInsultos y respuestasPiratas tienen el mismo indice correcto. Los insultosPiratas son random cada ronda,
        // Y el orden de las respuestas (1 correcta y 2 incorrectas) es tambien random.
        Random random = new Random(); // Para saber cual insulto tocará
        Scanner sc = new Scanner(System.in);

        System.out.println("----------------------- ╬ MONKEY ISLAND ╬ --------------------");
        System.out.println();
        System.out.println();
        System.out.println(" Ø ¡Bienvenido Aventurero! Ø\n\n  ¤ El juego consiste en sobrevivir a los insultos de los piratas. \n Responde correctamente para ganar puntos y avanzar de ronda. \n Pero cuidado, si fallas perderás vidas. ¤ \n\n ▓ ¡Buena suerte! ▓ ");
        System.out.println(" ® ¿Cuantas rondas quieres jugar? ® ");

        
        rondasJuego = sc.nextInt(); // Numero de rondas que quiere jugar el usuario

        int i = 0; // indicePiratas Array

        
        while (puntuacion > -1) {
            rondasJuego++;
            System.out.println(" ® Has avanzado a la ronda ®" + rondasJuego + "\n\n  ¤ Puntuación: ¤ " + puntuacion);

            // Preguntas (insultosPiratas)
            
        }


    }
}
