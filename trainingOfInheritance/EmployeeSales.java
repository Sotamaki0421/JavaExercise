package trainingOfInheritance;

public class EmployeeSales extends EmployeeBase {

    private String appointment;

    public EmployeeSales() {
    }

    public EmployeeSales(int employeeId, String employeeName, int vitality) {
        super(employeeId, employeeName, "営業部", vitality);
        this.appointment = "未定";
    }

    public void report() {
        super.setVitality(super.getVitality() - 10);
        System.out.println("今日は10件アポを取りました");
    }

    @Override
    public void introduce() {
        super.setVitality(super.getVitality() - 10);
        System.out.println("私の名前は"+ super.getEmployeeName() +"です。");
        System.out.println("私の所属部署は"+ super.getDivisionName() +"です。");
        System.out.println("今日のアポイント先は"+ appointment +"です。");
    }

    @Override
    public void greeting() {
        super.setVitality(super.getVitality() - 10);
        System.out.println(super.getDivisionName() + "の皆さん" + "おはようございます");
    }

    public String getAppointment() {
        return appointment;
    }

    public void setAppointment(String appointment) {
        this.appointment = appointment;
    }

}
