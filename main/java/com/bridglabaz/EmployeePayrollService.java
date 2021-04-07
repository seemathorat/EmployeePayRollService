package com.bridglabaz;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService{

    public void writeEmployeePayRollData(IoService fileIo) {
    }

    public void printData(IoService fileIo) {
    }

    public enum IoService {CONSOLE_IO,FILE_IO,DB_IO,REST_IO}
    private List<EmployeePayRollData> employeePayrollList;

    public EmployeePayrollService(){}
    public EmployeePayrollService(List<EmployeePayRollData>
                                          employeePayrollList) {
    }


    public static  void main(String[]args)
    {
        ArrayList<EmployeePayRollData> employeePayrollList=new ArrayList<>();
        EmployeePayrollService employeePayrollService=new EmployeePayrollService(employeePayrollList);
        Scanner ConsoleInputReader=new Scanner(System.in);
        employeePayrollService.readEmployeePayrollData(ConsoleInputReader);
        employeePayrollService.writeEmployeePayrollData();
    }
    private void readEmployeePayrollData(Scanner consoleInputReader){
        System.out.println("Enter Employee Id:");
        int id =consoleInputReader.nextInt();
        System.out.println("Enter Employee name:");
        String name=consoleInputReader.next();
        System.out.println("Enter Employee Salary:");
        int salary =consoleInputReader.nextInt();
        employeePayrollList.add(new EmployeePayRollData(id,name,salary));
    }
    private  void writeEmployeePayrollData()
    {
        System.out.println("\n writing employee payroll roaster to console\n" + employeePayrollList);


    }

}
