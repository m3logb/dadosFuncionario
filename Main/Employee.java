public class Employee {
    private int ID;
    private String name;
    private Double salario;
    public Employee(){
        
    }
    public Employee(int iD, String name, Double salario) {
        ID = iD;
        this.name = name;
        this.salario = salario;
    }

    public void salarioAumento(Double percentage){
        this.salario += (percentage / 100) * this.salario;
    }

    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    
}
