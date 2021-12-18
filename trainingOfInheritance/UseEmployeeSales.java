package trainingOfInheritance;

public class UseEmployeeSales {

    public static void main(String[] args) {
        EmployeeSales sales = new EmployeeSales(10, "常守", 200);

        sales.setAppointment("厚生省公安局");

        sales.introduce();

        sales.greeting();

        sales.report();

        sales.showVitality();
    }

}
