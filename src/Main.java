public class Main {
    public static void main(String[] args) {
        Pato pato = new Pato();
        pato.setEnergia(10);

        Aviao aviao = new Aviao();
        aviao.setHorasDeVoo(0);

        SuperHomem superHomem = new SuperHomem();
        superHomem.setExperiencia(0);

        TorreDeControle.adicionarVoador(pato);
        TorreDeControle.adicionarVoador(aviao);
        TorreDeControle.adicionarVoador(superHomem);

        TorreDeControle.voemTodos();

    }
}
