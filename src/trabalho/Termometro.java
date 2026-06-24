package trabalho;
public class Termometro {

    private double temperatura;

    // construtor padrão (inicia em 20)
    public Termometro() {
        this.temperatura = 20.0;
    }

    // getter
    public double getTemperatura() {
        return temperatura;
    }

    // setter com encapsulamento e validação
    public void setTemperatura(double temperatura) {

        if (temperatura < -10.0 || temperatura > 50.0) {
            System.out.println("Aviso: temperatura fora do limite (-10 a 50). Valor ignorado.");
            return;
        }

        this.temperatura = temperatura;
    }
}