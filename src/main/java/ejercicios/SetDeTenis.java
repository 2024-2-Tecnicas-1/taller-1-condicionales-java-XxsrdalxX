package ejercicios;

import java.util.Scanner;

public class SetDeTenis {
    public static String evaluar(int numVictoriasA, int numVictoriasB) {
        // Condiciones para resultados inválidos
        if (numVictoriasA > 7 || numVictoriasB > 7) {
            return "Inválido";
        }
        if ((numVictoriasA == 7 && numVictoriasB < 5) || (numVictoriasB == 7 && numVictoriasA < 5)) {
            return "Inválido";
        }

        // Si el set ha terminado
        if (numVictoriasA == 7 && numVictoriasB == 6) {
            return "Ganó A";
        }
        if (numVictoriasB == 7 && numVictoriasA == 6) {
            return "Ganó B";
        }
        if (numVictoriasA == 6 && numVictoriasB <= 4) {
            return "Ganó A";
        }
        if (numVictoriasB == 6 && numVictoriasA <= 4) {
            return "Ganó B";
        }
        if (numVictoriasA == 7 && numVictoriasB == 5) {
            return "Ganó A";
        }
        if (numVictoriasB == 7 && numVictoriasA == 5) {
            return "Ganó B";
        }

        // Si aún no termina
        if ((numVictoriasA < 6 && numVictoriasB < 6) || (numVictoriasA == 6 && numVictoriasB == 6)) {
            return "Aún no termina";
        }

        // Si no cumple ninguna de las condiciones anteriores, es un resultado inválido
        return "Inválido";
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        System.out.print("Los juegos ganados por A: ");
        int numVictoriasA = lector.nextInt();
        System.out.print("Los juegos ganados por B: ");
        int numVictoriasB = lector.nextInt();
        
        // Llama a la función evaluar para determinar el resultado
        String respuesta = evaluar(numVictoriasA, numVictoriasB);
        System.out.println(respuesta);
        
        lector.close(); // Cerrar el scanner
    }
}