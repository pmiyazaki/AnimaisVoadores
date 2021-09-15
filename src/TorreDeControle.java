public class TorreDeControle {
    static Voador[] voadores = new Voador[10];

    public static void adicionarVoador(Voador umVoador){
        for( int i = 0; i < voadores.length; i++) {
            if(voadores[i] == null){
                voadores[i] = umVoador;
                break;
            }
        }
    }

    public static void voemTodos(){
        for(int i = 0; i < voadores.length; i++) {
            if (voadores[i] == null) {
                break;
            } else {
                voadores[i].voar();
            }
        }
    }
}
