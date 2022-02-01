
package ejercicio8;


public class Cadena {
   public String frase;
   public int longitud;
    
   public Cadena(String frase, int longitud) {
     this.frase = frase;
     this.longitud = longitud;
   }
   public Cadena(){
       
   }

    public String getFrase() {
        return frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    // length controlo el tamaño de la palabra y charAt devuelve la posicion recorrida.
  public void mostrarVocales(){
      int cont=0;
     for(int i=0;i<frase.length();i++) {
 if ((frase.charAt(i)=='a') || (frase.charAt(i)=='e') || (frase.charAt(i)=='i') || (frase.charAt(i)=='o') || (frase.charAt(i)=='u')){ 
    cont++;
  }
         System.out.printf("la frase contiene %d mas %d \n ", frase, cont);
        
} 
  } 
  //recorrer las cadenas de atras para adelante .
  public void invertirFrase(){
    String frase_invertida= "";
for (int i=this.frase.length()-1;i>=0;i--)  {
     frase_invertida = frase_invertida + frase.charAt(i);
    System.out.printf("la frase invertida es: %d \n ", frase_invertida);
}
  }
  //indexOf busca la 1° vez q" aparece el caracter y el se suma al contador si aparece.
  public void  vecesRepetido(){
    int pos, cont = 0;
    pos = this.frase.indexOf(frase);
    while (pos != -1) {
        cont++;
    }
    
  }
  public void compararLongitud(){
   if(this.getLongitud()== frase.length()) {
       System.out.printf(" La longitud de la frase %s y la frase %s son: \n ", this.getFrase(), frase);
       
   }  else if (this.getLongitud()> frase.length()){
       System.out.printf("La longitud de la frase %s es mayor que %s \n",this.getFrase(), frase);
         
   }else if (this.getLongitud()< frase.length()){
       System.out.printf("La frase %s es que %s  \n",this.frase);
   }
  }
  public void unirFrases(){
     this.frase = this.frase.concat(frase);
      System.out.printf("La frase resulto %s: \n",this.frase);
  }
  public void reemplazar(String letra){
     
      this.frase=frase.replace('a',letra.charAt(0));
      System.out.printf("La frase es %s: ",frase);
              
  }
  public boolean contiene(String letra){
     return this.getFrase().contains(letra);
  }
}
