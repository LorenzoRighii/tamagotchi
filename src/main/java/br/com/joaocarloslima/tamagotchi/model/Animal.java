package br.com.joaocarloslima.tamagotchi.model;

public abstract class Animal {
    private int energia;
    private int fome;
    private int felicidade;

    public Animal(int energia, int fome, int felicidade) {
        this.energia = energia;
        this.fome = fome;
        this.felicidade = felicidade;
        normalizarAtributos();
    }

    public abstract void brincar();
    public abstract void comer();
    public abstract void dormir();
    public abstract void turno();

    public void normalizarAtributos() {
        this.energia = Math.max(0, Math.min(100, this.energia));
        this.fome = Math.max(0, Math.min(100, this.fome));
        this.felicidade = Math.max(0, Math.min(100, this.felicidade));
    }

    public int getEnergia() {
        return energia;
    }
    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getFome() {
        return fome;
    }
    public void setFome(int fome) {
        this.fome = fome;
    }

    public int getFelicidade() {
        return felicidade;
    }
    public void setFelicidade(int felicidade) {
        this.felicidade = felicidade;
    }
}