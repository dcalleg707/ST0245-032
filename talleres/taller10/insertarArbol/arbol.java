class arbol{

nodo raiz;

public arbol(int valor){
  this.raiz = new nodo(valor);
}

public arbol(nodo raiz){
  this.raiz = raiz;
}

public nodo getRaiz(){
  return raiz;
}

public void setRaiz(){
  this.raiz = raiz;
}


}
