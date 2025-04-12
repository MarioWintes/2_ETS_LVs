package lv6_threading;

public class IsPrimeDemo{

    public static void main(String[] args) throws InterruptedException {

        long number1 = 1979990039;
        long number2 = 1989990047;
        long number3 = 1991990059;
        long number4 = 1891999939;
        long number5 = 1891999943;
        long number6 = 1991999993;

        IsPrime ip1 = new IsPrime(number1, "Number 1");
        IsPrime ip2 = new IsPrime(number2, "Number 2");
        IsPrime ip3 = new IsPrime(number3, "Number 3");
        IsPrime ip4 = new IsPrime(number4, "Number 4");
        IsPrime ip5 = new IsPrime(number5, "Number 5");
        IsPrime ip6 = new IsPrime(number6, "Number 6");

        System.out.println("Programm started");
        ip1.start();
        ip2.start();
        ip3.start();
        ip4.start();
        ip5.start();
        ip6.start();

        ip1.join();
        ip2.join();
        ip3.join();
        ip4.join();
        ip5.join();
        ip6.join();



    }
}
