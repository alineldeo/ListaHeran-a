
public class Celulares extends ServicoTelefonia {
    
    private int numCelular;
    
    private boolean ReprodutorDeMusica; 
    private boolean Radio;
    private boolean TouchScreean;

  public Celulares (){}
  public Celulares (int numCelular, boolean ReprodutorDeMusica, 
          boolean Radio, boolean TouchScreean){
        
    this.numCelular = numCelular; 
   
     this.ReprodutorDeMusica = ReprodutorDeMusica; 
    this.Radio = Radio;
     this.TouchScreean = TouchScreean;
  }


    @Override
    public void setCorDoAparelho(String CorDoAparelho) {
        super.setCorDoAparelho(CorDoAparelho); 
        System.out.println ("Cinza Grafite");
    }
  
    @Override
    public void setModeloDoAparelho(String ModeloDoAparelho) {
        super.setModeloDoAparelho(ModeloDoAparelho);
        System.out.println ("Celular");
    }
  
    public int getNumCelular() {
        return numCelular;
    }

    
    public void setNumCelular(int numCelular) {
        this.numCelular = numCelular;
    }

    
   
    public boolean getReprodutorDeMusica() {
        return ReprodutorDeMusica;
    }

   
    public void setReprodutorDeMusica(boolean ReprodutorDeMusica) {
        this.ReprodutorDeMusica = ReprodutorDeMusica;
        if (ReprodutorDeMusica == true) {System.out.println("Este celular possui Reprodutor De Música");
        }else if (ReprodutorDeMusica == false){
            System.out.println("Este celular não possui Reprodutor de Muscia");
        }
    }

   
    public boolean getRadio() {
        return Radio;
    }


    public void setRadio(boolean Radio) {
        this.Radio = Radio;
        if (Radio == true) {System.out.println ("Este celular possui Radio");
        }else if (Radio == false) {
                System.out.println("Este celular não posssui Radio");
    }
    }

  
    public boolean getTouchScreean() {
        return TouchScreean;
    }

    
    public void setTouchScreean(boolean TouchScreean) {
        this.TouchScreean = TouchScreean;
        if (TouchScreean == false) {System.out.println ("Celular sem TouchScreean!");
        }else if (TouchScreean == true) {
            System.out.println ("Celular com TouchScreean");
        }
    }
}
    
    