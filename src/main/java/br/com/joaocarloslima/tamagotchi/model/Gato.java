package br.com.joaocarloslima.tamagotchi.model;

public class Gato extends Animal {

    public Gato() {
        super(50, 50, 50);
    }

    public Gato(int energia, int fome, int felicidade) {
        super(energia, fome, felicidade);
    }

    @Override
    public void brincar() {
        setFelicidade(getFelicidade() + 10);
        setEnergia(getEnergia() - 5);
        setFome(getFome() + 5);
        normalizarAtributos();
    }

    @Override
    public void comer() {
        setFome(getFome() - 15);
        setEnergia(getEnergia() + 10);
        normalizarAtributos();
    }

    @Override
    public void dormir() {
        setEnergia(getEnergia() + 20);
        setFome(getFome() + 5);
        normalizarAtributos();
    }

    @Override
    public void turno() {
        setEnergia(getEnergia() - 5);
        setFome(getFome() + 5);
        setFelicidade(getFelicidade() - 3);
        normalizarAtributos();
    }
}
