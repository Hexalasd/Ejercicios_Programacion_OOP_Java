package Tablero;


public class Tablero {
    
    public int local;
    public int visitante;
    
    public Tablero(){
            this.local=0;
            this.visitante=0;
    
    }
      public Tablero(int local, int visitante){
          if(local<0){
              this.local=0;
          }else{
           this.local=local;
          }
          
          if(visitante<0){
              this.visitante=0;
          }else{
              this.visitante=visitante;
          }
            
      }

    public int getLocal() {
        return local;
    }

    public int getVisitante() {
        return visitante;
    }

    public void reiniarTablero(){
        this.local=0;
        this.visitante=0;
    }
    
    public void sumaLocal(){
        this.local++;
    }
    public void sumaVisita(){
    this.visitante++;
    }
    public void restaLocal(){
    if(local != 0){
        this.local--;
    }
    }
    public void restaVisita(){
    if(this.visitante != 0){
       this.visitante--;
    }
}
    public void reset(){
        this.local=0;
        this.visitante=0;
    }
    
    public String quienGano(){
    String resultado = null;
    if(this.local>visitante){
    resultado="Gano Local " +local+ " a "+visitante;
    }else{
    if(this.local<visitante){
    resultado="Gano Visitante " +visitante+ " a "+local;
    }else {
        resultado=("Empate " + local+ " a "+ visitante);
    }
    }
   
        return resultado ;
    }
    
    @Override
    public String toString() {
        return "Tablero{" + "local=" + local + ", visitante=" + visitante + '}';
    }

    
      
}
