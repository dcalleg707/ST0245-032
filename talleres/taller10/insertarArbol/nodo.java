public class nodo{
  int valor; /* dato almacenado*/
  
  nodo padre;
// hijos 
  nodo left;
  nodo right;

  public nodo(int valor){
    this.valor = valor;
  }

  public void setValor(int valor){
      this.valor = valor;
  }

  public int getValor(){
    return valor;
  }

  public nodo getPadre(){
    return padre;
  }

  public void setPadre(nodo padre){
    this.padre = padre;
  }

  public nodo getLeft(){
    return left;
  }

  public void setLeft(nodo left){
    this.left = left;
  }

  public nodo getRight(){
    return right;
  }

  public void setRight(nodo right){
    this.right = right;
  }


}
