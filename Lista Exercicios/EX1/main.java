package EX1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter departament name:");
        String departamentName = sc.nextLine();
        System.out.println("Enter worker data:");
        System.out.println("Name:");
        String workerName = sc.nextLine();
        System.out.println("Level");
        String workerLavel = sc.nextLine();
        System.out.println("Base Salary");
        Double BaseSalary = sc.nextDouble();

        Worker worker = new Worker(workerName,WorkerLevel.valueOf(workerLavel),BaseSalary,new Departament(departamentName));

        System.out.println("How many contracts to this worker:");
        int numContracts = sc.nextInt();
        for(int i = 0; i<=numContracts ; i ++){
            System.out.println("Enter contract " + i + " data: ");
            System.out.println("Hours: ");
            int contractHour = sc.nextInt();
            System.out.println("Value per Hours:");
            double valuePerHour = sc.nextDouble();
            System.out.println("Date:" );
            Date contractDate = sdf.parse(sc.next());
            HourContract contract = new HourContract(contractHour,valuePerHour,contractDate);
            worker.addContract(contract);
        }

        System.out.println("Enter month and year to calculate the income: (MM/YYYY)");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0,2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Name: " + worker.getName());
        System.out.println("Departament: "+worker.getDepartament().getNameDepartament());
        System.out.println("Income for: "+monthAndYear + ":" + String.format("%.2f",worker.income(year,month)));




        sc.close();
    }
}
