import java.util.List;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        Test prueba = new Test();
        List<Integer> resultado = prueba.printPalindromo();
        for(Integer ID : resultado){
            System.out.println(ID);
        }
    }
}