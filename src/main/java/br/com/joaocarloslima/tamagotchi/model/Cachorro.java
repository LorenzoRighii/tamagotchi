package br.com.joaocarloslima.tamagotchi.model;

public class Cachorro extends Animal {

    public Cachorro() {
        super(50, 50, 50);
    }

    public Cachorro(int energia, int fome, int felicidade) {
        super(energia, fome, felicidade);
    }

    @Override
    public void brincar() {
        setFelicidade(getFelicidade() + 15);
        setEnergia(getEnergia() - 10);
        setFome(getFome() + 10);
        normalizarAtributos();
    }

    @Override
    public void comer() {
        setFome(getFome() - 20);
        setEnergia(getEnergia() + 15);
        normalizarAtributos();
    }

    @Override
    public void dormir() {
        setEnergia(getEnergia() + 15);
        setFome(getFome() + 10);
        normalizarAtributos();
    }

    @Override
    public void turno() {
        setEnergia(getEnergia() - 10);
        setFome(getFome() + 10);
        setFelicidade(getFelicidade() - 5);
        normalizarAtributos();
    }
}