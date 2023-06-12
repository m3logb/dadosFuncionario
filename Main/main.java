import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos funcionarios serão cadastrados?");
        int N = sc.nextInt();
        Employee funcionario = new Employee();
        List<Employee> list = new ArrayList<>();

        for(int i = 0;i<N;i++){
            sc.nextLine();
            System.out.println("Nome");
            String name = sc.nextLine();
            System.out.println("Id:");
            int Id = sc.nextInt();
            System.out.println("Salario:");
            Double Salary = sc.nextDouble();
            Employee funcionarios = new Employee(Id, name, Salary);
            list.add(i, funcionarios);
           
        }
        for(int i = 0;i<N;i++){
            System.out.println(list);
        }

        sc.close();

    }
}