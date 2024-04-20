import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {

        // Clase escaner
        Scanner scanner = new Scanner(System.in);

        // Declaraciones de Variables
        String palabraSecreta = "inteligencia";
        int intentos = 0;
        int intentosMax = 10;
        boolean palabraAcertada = false;

        //Arreglos
        char[] letrasAdvinadas = new char[palabraSecreta.length()];

        //Operaciones
        for (int i = 0; i < letrasAdvinadas.length; i++) {
            letrasAdvinadas[i] = '_';
        }

        while(!palabraAcertada && intentos < intentosMax){
            System.out.println("palabra a advinar: " + String.valueOf(letrasAdvinadas) + " (" + palabraSecreta.length() + " letras)");

            System.out.println("Introduce una letra, porfavor ");
            char letra = Character.toLowerCase(scanner.next().charAt(0));

            boolean letraCorrecta = false;

            for (int i = 0; i < palabraSecreta.length(); i++) {
                if (palabraSecreta.charAt(i) == letra) {
                    letrasAdvinadas[i] = letra;
                    letraCorrecta = true;
                }
            }
            if(!letraCorrecta){
                intentos++;
                System.out.println("letra incorrecta, te quedan " + (intentosMax - intentos) + " intentos");
            }

            if(String.valueOf(letrasAdvinadas).equals(palabraSecreta)){
                palabraAcertada =true;
                System.out.println("Felicidades, haz adivinado la palabra secreta: " + palabraSecreta);
            }
        }

        if(!palabraAcertada){
            System.out.println("Lo siento, te has quedado sin intentos");
        }

        scanner.close();
    }
}
