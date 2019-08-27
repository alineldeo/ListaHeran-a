
public class TelefoneFixo extends ServicoTelefonia{
    private int numeroDoTelefone;
  private boolean ComprimentoDoCabo;
  private boolean PossuiCabo;
  private boolean PodeFixarNaParede;

    public TelefoneFixo (){}
    
    public TelefoneFixo (int numeroDoTelefone, boolean ComprimentoDoCabo, 
            boolean PossuiCabo, boolean PodeFixarNaParede){
    this.ComprimentoDoCabo = ComprimentoDoCabo;
    this.PodeFixarNaParede = PodeFixarNaParede;
    this.PossuiCabo = PossuiCabo;
    this.numeroDoTelefone = numeroDoTelefone;
    }
  
  



    @Override
    public void setModeloDoAparelho(String ModeloDoAparelho) {
        super.setModeloDoAparelho(ModeloDoAparelho);
         System.out.println ("Fixo");
    }
    
    @Override
    public void setCorDoAparelho(String CorDoAparelho) {
        super.setCorDoAparelho(CorDoAparelho); 
        System.out.println ("Preto");
        
    }
    
    public int getNumeroDoTelefone() {
        return numeroDoTelefone;
    }

    public void setNumeroDoTelefone(int numeroDoTelefone) {
        this.numeroDoTelefone = numeroDoTelefone;
    }

   
    public boolean getComprimentoDoCabo() {
        return ComprimentoDoCabo;
    }

    public void setComprimentoDoCabo(boolean ComprimentoDoCabo) {
        this.ComprimentoDoCabo = ComprimentoDoCabo;
        
               
    }

    public boolean getPossuiCabo() {
        return PossuiCabo;
    }

   
    public void setPossuiCabo(boolean PossuiCabo) {
        this.PossuiCabo = PossuiCabo;
        if (PossuiCabo == true) {System.out.println ( "Qual o Comprimento dele?");
        }else 
            System.out.println ("Este telefone é sem fio!");
        
                
    }

    
    public boolean getPodeFixarNaParede() {
        return PodeFixarNaParede;
        
    }

    public void setPodeFixarNaParede(boolean PodeFixarNaParede) {
        this.PodeFixarNaParede = PodeFixarNaParede;
        if (PodeFixarNaParede == true){System.out.println ("Este telefone possui fixador");
        }else if (PodeFixarNaParede == false) {
            System.out.println ("Este telefone não possui fixador!");
        }
    }
}

   
  