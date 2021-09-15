public class Pato implements Voador{
    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    private int energia;

    @Override
    public void voar() {
        setEnergia(energia - 5);
        System.out.println("Estou voando como um pato" + " Energia: " + energia);
    }
}
