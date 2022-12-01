public class Badge {
    private static int totalNumberOfEmployees;
    private String badgeIdCode;
    public Employee employee;

    private static void keepTrackOfEmployeesNumber(){
        ++totalNumberOfEmployees ;
    }
    private String generateBadgeIdCode(){
        return "123" + this.employee.name + this.employee.surname + "321";
    }
    public void showBadgeDetails(){
        System.out.println("Employees tracked : " + totalNumberOfEmployees);
        System.out.println(this.employee.getEmployeeDetails());
        System.out.println("Badge number is : " + this.badgeIdCode);
    }
    public  Badge(Employee employeeThatNeedsBadge){
    keepTrackOfEmployeesNumber();
    this.employee = employeeThatNeedsBadge;
    badgeIdCode = this.generateBadgeIdCode();
    }
}
