package app;
import java.util.Scanner;
import entities.dados;
import java.util.ArrayList;
import java.util.Locale;
import java.util.List;
public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        List<dados> list = new ArrayList<>();
    
        while (true) {
            System.out.printf("[1] for create account%n[2] for access your account%n[3] for exit%nEnter : ");
            int num = sc.nextInt();
            
            switch (num) {
                
                case 1:
                    System.out.print("Enter account number: ");
                    int conta = sc.nextInt();
                    System.out.print("Enter account holder: ");
                    sc.nextLine();
                    String name = sc.nextLine();
                    System.out.print("Is there initial deposit? (y/n)");
                    char dec = sc.next().charAt(0);
                    
                    dados cadasto;
                    
                    if (dec == 'y'){
                        System.out.print("Enter initial deposit value: ");
                        double dep = sc.nextDouble();
                        dados cadastro = new dados(name, conta, dep);
                        list.add(cadastro);
                    }
            
                    else{
                        dados cadastro = new dados(name, conta);
                        list.add(cadastro);
                    }
                    
                    break;
                
                case 2:
                    System.out.printf("Enter the number account ");
                    conta = sc.nextInt();
                    System.out.printf("[1] Deposit%n[2]withdraw%n[3]check balance%n");
                    num = sc.nextInt();


            
                
                default:
                    break;
            }   
           
    }
          
    }

}