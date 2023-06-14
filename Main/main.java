import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos funcionarios serão cadastrados?");
        int N = sc.nextInt();
        
        List<Employee> list = new ArrayList<>();

        for(int i = 0;i<N;i++){
            sc.nextLine();
            System.out.println("Nome");
            String name = sc.nextLine();
            System.out.println("Salario:");
            Double salary = sc.nextDouble();
            System.out.println("Id:");
            int id = sc.nextInt();
                while(idExistente(list, id)){
                    System.out.println("ID já existente");
                   id = sc.nextInt();
                }
                list.add(new Employee(id, name, salary));
            }
            
           
           System.out.println("Qual ID do funcionario que você deseja aumentar o salario :");
            int salarioID = sc.nextInt();
            Employee idSalario = list.stream().filter(x->x.getID()==salarioID).findFirst().orElse(null);

            if(idSalario == null){
                System.out.println("ID inexistente!");
            }else {
                System.out.println("Digite a porcentagem de aumento:");
                Double percentage = sc.nextDouble();
                idSalario.salarioAumento(percentage);
            }
            
            System.out.println();
            System.out.println("Lista de Funcionarios");

            for (Employee lista: list){
                System.out.println(lista);
            }
            sc.close();

        }
         
        

    

    public static boolean idExistente(List<Employee> list,int id){

        Employee funcc = list.stream().filter(x->x.getID()==id).findFirst().orElse(null);
        return funcc != null;
    }
    
        }
    
