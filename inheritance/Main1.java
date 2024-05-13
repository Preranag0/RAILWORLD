package inheritance;
import java.util.Scanner;
public class Main1 extends Employee {
    public static void main(String args[]){
        Scanner sc= new Scanner (System.in);
        Main1 main1 = new Main1();
        main1.display();

    }

    @Override

        public void display(){
            System.out.println("bye");
        }

}
