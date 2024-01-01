
public class Main {
    public static void main(String[] args) {

        HealthStation hospital = new HealthStation();

        Person ethan = new Person("Ethan", 1, 110, 7);
        Person peter = new Person("Peter", 33, 176, 85);

        String resultEthan = String.format("%s weight: %d kilos", ethan.getName(), hospital.weigh(ethan));
        String resultPeter = String.format("%s weight: %d kilos", peter.getName(), hospital.weigh(peter));

        System.out.println(resultEthan);
        System.out.println(resultPeter);

        hospital.feed(ethan);
        hospital.feed(ethan);
        hospital.feed(ethan);

        resultEthan = String.format("%s weight: %d kilos", ethan.getName(), hospital.weigh(ethan));
        resultPeter = String.format("%s weight: %d kilos", peter.getName(), hospital.weigh(peter));

        System.out.println("");
        System.out.println(resultEthan);
        System.out.println(resultPeter);
    }
}
