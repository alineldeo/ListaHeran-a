import java.util.Scanner;
public class Comunicação {
    public static void main (String []args){
        Scanner input = new Scanner (System.in);
   ServicoTelefonia s = new ServicoTelefonia();
   TelefoneFixo t = new TelefoneFixo();
   Celulares c = new Celulares();
   System.out.println("Este apararelho é : " );
t.setModeloDoAparelho("Fixo");
   System.out.println("Este telefone fixo possui cabo?");
   input.nextLine();
  t.setPossuiCabo(true);
    input.nextLine();
    System.out.println("Ele pode Fixar na parede?");
       input.nextLine();
   t.setPodeFixarNaParede(true);
   System.out.println("Qual o número deste telefone?");
    input.nextLine();
    t.getNumeroDoTelefone();
   System.out.println("Este telefone é de cor: ");
  t.setCorDoAparelho("Preto");
  
   System.out.println("Este apararelho é : " );
c.setModeloDoAparelho("Celular");
   System.out.println("Este celular possui Rádio?");
   input.nextLine();
  c.setRadio(true);
    System.out.println("Este aparelho possui reprodutor musical?");
       input.nextLine();
    c.setReprodutorDeMusica(true);
   System.out.println("Qual o número deste celular?");
    input.nextLine();
    c.getNumCelular();
   System.out.println("Este aparelho é de cor: ");
c.setCorDoAparelho("Cinza Grafite");
  
   }
}
