import java.util.Scanner;

public class teste {
    public  static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Entre com a quantidade de vendas de 2013 :");
        int vendas2013=input.nextInt() ;
        System.out.println("Entre com a quantidade de vendas de 2014 :");
        int vendas2014=input.nextInt();

if (vendas2014<vendas2013){
    System.out.println("Maior venda em 2013");
}else {
    System.out.println("Maior venda 2014");
}



    }
}
