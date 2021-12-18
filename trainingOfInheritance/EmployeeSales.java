package trainingOfInheritance;

public class EmployeeSales extends EmployeeBase {

    private String appointment;

    public EmployeeSales() {
    }

    public EmployeeSales(int employeeId, String employeeName, int vaitality) {
        super.setEmployeeId(employeeId);
        super.setEmployeeName(employeeName);
        super.setDivisionName("営業部");
        super.setVitality(vaitality);
        this.appointment = "未定";
    }

    public void report() {
        super.setVitality(super.getVitality() - 10);
        System.out.println("今日は10件アポを取りました");
    }

    public String getAppointment() {
        return appointment;
    }

    public void setAppointment(String appointment) {
        this.appointment = appointment;
    }

}
