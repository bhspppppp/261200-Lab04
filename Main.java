public class Main {
    public static void main(String[] args) {
        HealthRecord student1 = new HealthRecord(120);
        HealthRecord student2 = new HealthRecord(55);
        HealthRecord student3 = new HealthRecord(280);

        System.out.println(student1.getDetails());
        System.out.println(student2.getDetails());
        System.out.println(student3.getDetails());

        System.out.println(HealthRecord.getClassDetails());
    }
}
