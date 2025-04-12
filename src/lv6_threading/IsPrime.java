package lv6_threading;

public class IsPrime extends Thread{ // extend geht nur wenn wir keine Vererbungshierarchie haben
    // sonst implements runnable -> und Threadobjekt in der Demo anwendung erstellen

    private boolean isPrime;
    private long number;
    private String identifier;

    public IsPrime(long number, String identifier) {
        this.number = number;
        this.identifier = identifier;
    }

    private void primeValidation(long number, String identifier){

        for (long l = 2; l < number / 2; l++) {
            if (number % l == 0){
                System.out.println(identifier + ": Keine Primzahl");
                return;
            }
        }
        System.out.println(identifier + ": Primzahl");
    }

    @Override
    public void run() {
        primeValidation(this.number, this.identifier);
    }
}
