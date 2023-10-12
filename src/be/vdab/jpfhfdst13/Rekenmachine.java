package be.vdab.jpfhfdst13;

public interface Rekenmachine {

    default void toonSomEvenNummers(int... nummers) {
        int som = 0;
        for (var nummer : nummers){
            if (nummer % 2 == 0){
                som += nummer;
            }
        }
        toonSom(som);
    }

    default void toonSomOnevenNummers(int... nummers) {
        int som = 0;
        for (var nummer : nummers) {
            if (nummer % 2 != 0) {
                som += nummer;
            }
        }
        toonSom(som);
    }


    private void toonSom(int som) {
        System.out.println("De som= " + som);
    }
}
