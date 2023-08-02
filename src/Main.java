public class Main {
    public static void main(String[] args) {

        Transport transport = new Transport(" Mers","white",120000);
        System.out.println(transport);
        Car car =new Car("Niva","black",2400000);
        System.out.println(car);
        Buss buss = new Buss("Jiguli","blue",90000);
        System.out.println(buss);
        transport.method();
        transport.met();
        car.method();
        car.met();
        buss.method();
        buss.met();
    }
}