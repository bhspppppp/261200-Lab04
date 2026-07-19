public class Lab04 {
    public static void main(String[] args) {
        HealthRecord h1 = new HealthRecord(170);
        HealthRecord h2 = new HealthRecord(160);
        HealthRecord h3 = new HealthRecord(180);
        HealthRecord h4 = new HealthRecord(300);

        System.out.println(h1.getDetails());
        System.out.println(h2.getDetails());
        System.out.println(h3.getDetails());
        System.out.println(h4.getDetails());

        System.out.println();
        System.out.println(HealthRecord.getClassDetails());
    }
}
