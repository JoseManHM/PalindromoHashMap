import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
/*
EJERCICIO JAVA
hacer una lista usando Map y HashMap donde asocies un ID a cada palabra:
Palabras: reconocer, falso, hola, oso, arenera
Filtrar la lista y solo imprimir los ID de las palabras que son palindromos.
*/
    public List<Integer> printPalindromo(){
        List<Integer> response = new ArrayList<>();
        Map<Integer, String> mapa = new HashMap<>();
        mapa.put(1, "reconocer");
        mapa.put(2, "falso");
        mapa.put(3, "hola");
        mapa.put(4, "oso");
        mapa.put(5, "arenera");
        for(Map.Entry<Integer, String> entry : mapa.entrySet()){
            if(esPalindromo(entry.getValue())){
                response.add(entry.getKey());
            }
        }
        return response;
    }

    public Boolean esPalindromo(String palabra){
        StringBuilder cadenaReves = new StringBuilder();
        char caracter;
        for(int i = palabra.length() - 1; i >= 0; i--){
            caracter = palabra.charAt(i);
            cadenaReves.append(caracter);
        }
        return palabra.contentEquals(cadenaReves);
    }
}
