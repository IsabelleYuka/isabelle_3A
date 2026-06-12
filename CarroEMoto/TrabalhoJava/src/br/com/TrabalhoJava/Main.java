package br.com.TrabalhoJava;

public class Main {

    public static void main(String[] args) {

        Carro carro = new Carro();
        Moto moto = new Moto();

        carro.aumentarVelocidade();
        moto.aumentarVelocidade();

        System.out.println("Velocidade do carro: " + carro.velocidade);
        System.out.println("Velocidade da moto: " + moto.velocidade);

    }
}