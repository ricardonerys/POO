import java.util.Scanner;

class Repeticoes{
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        System.out.println("Acaí & Sucos\n1-Cadastrar produto\n2-Alterar produto\n3-Localizar produto\n4-Deletar produto\n");
        
        int seletor=0;
        String produto= "";       

        do{
            System.out.println("escolha uma opcao:");
            seletor=scan.nextInt();
        
            switch(seletor){
                case 1:
                System.out.println("digite o nome do produto");
                produto = scan.nextLine();
                System.out.println("produto cadastrado:");
                System.out.println(produto);
                break;

                case 2:
                System.out.println("digite o nome do produto a ser alterado");
                break;

                case 3:
                System.out.println("digite o nome do produto a ser localizado");
                break;

                case 4:
                System.out.println("digite o nome do produto a ser deletado");
                break;

                default:
                System.out.println("opcao invaida");
            }

    }while(seletor>4 || seletor<1);
    }
}