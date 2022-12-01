public class Tester {
    public static void main(String[] args) {
        Employee employee = new Employee("Mario",
                "Rossi","Via Roma 12");
        Employee employee1 = new Employee("Luca",
                "Verdi","Via Torino 27");

        Badge badge = new Badge(employee);
        Badge badge1 = new Badge(employee1);

        badge.showBadgeDetails();
        badge1.showBadgeDetails();
    }
}
