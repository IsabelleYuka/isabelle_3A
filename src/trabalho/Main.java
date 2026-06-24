package trabalho;
public class Main {

    public static void main(String[] args) {

        Termometro t = new Termometro();

        // valor inicial
        System.out.println("Temperatura inicial: " + t.getTemperatura());

        // valor válido
        t.setTemperatura(25.0);
        System.out.println("Temperatura atual: " + t.getTemperatura());

        // valor inválido (vai ser ignorado)
        t.setTemperatura(100.0);
        System.out.println("Depois de tentativa inválida: " + t.getTemperatura());

        // outro valor válido
        t.setTemperatura(-5.0);
        System.out.println("Final: " + t.getTemperatura());
    }
}