package br.com.joaocarloslima.tamagotchi.model;

public class Dragao extends Animal {

    public Dragao() {
        super(50, 50, 50);
    }

    public Dragao(int energia, int fome, int felicidade) {
        super(energia, fome, felicidade);
    }

    @Override
    public void brincar() {
        setFelicidade(getFelicidade() + 12);
        setEnergia(getEnergia() - 15);
        setFome(getFome() + 15);
        normalizarAtributos();
    }

    @Override
    public void comer() {
        setFome(getFome() - 30);
        setEnergia(getEnergia() + 20);
        normalizarAtributos();
    }

    @Override
    public void dormir() {
        setEnergia(getEnergia() + 10);
        setFome(getFome() + 10);
        normalizarAtributos();
    }

    @Override
    public void turno() {
        setEnergia(getEnergia() - 15);
        setFome(getFome() + 10);
        setFelicidade(getFelicidade() - 7);
        normalizarAtributos();
    }
}