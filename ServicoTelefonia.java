
public class ServicoTelefonia {
  
  protected String CorDoAparelho;
   protected String ModeloDoAparelho;
  
public ServicoTelefonia(){}
public ServicoTelefonia( String CorDoAparelho,String ModeloDoAparelho){
 
  this.CorDoAparelho = CorDoAparelho;
  this.ModeloDoAparelho = ModeloDoAparelho;
  }
   
    public String getCorDoAparelho() {
        return CorDoAparelho;
    }

    
    public void setCorDoAparelho(String CorDoAparelho) {
        this.CorDoAparelho = CorDoAparelho;
       
    }

  
    public String getModeloDoAparelho() {
        return ModeloDoAparelho;
        
    }

  
    public void setModeloDoAparelho(String ModeloDoAparelho) {
        this.ModeloDoAparelho = ModeloDoAparelho;
       
    }
    
 
}

