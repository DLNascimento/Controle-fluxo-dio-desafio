import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        int parametroUm = terminal.nextInt();
        int parametroDois = terminal.nextInt();


        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            throw new RuntimeException(e);
        }


    }

    public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O primeiro parâmetro é maior que o segundo parâmetro");
        }

        int contador = parametroDois - parametroUm;
        for (int x = 0; x < contador; x++) {
            System.out.println(x + 1);
        }
    }

}
