package entities;

public class dados {
    
    private String name;
    private int conta;   
    private double dep;   
   
    public dados(String name, int conta) {
        this.name = name;
        this.conta = conta;
        dep = 0;
    }       
    public dados(String name, int conta,  double dep) {
        this.name = name;
        this.conta = conta;
        
        this.dep = dep;
    }
   
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getConta() {
        return conta;
    }
    public void setConta(int conta) {
        this.conta = conta;
    }   
    public double getDep() {
        return dep;
    }
    public void setDep(double dep) {
        this.dep = dep;
    }

    
}
