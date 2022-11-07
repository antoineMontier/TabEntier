public class TabEntier{

  private int taille;
  private int[] elements;

  public TabEntier(int n){
    elements = new int[n];
    taille = n;
  }

  public int getTaille(){
    return taille;
  }

  public int getElement(int i){
    return elements[i];
  }

  public void setElement(int i, int n){
    elements[i] = n;
  }

  public TabEntier fusion(TabEntier t){
    TabEntier res = new TabEntier(t.getTaille() + taille);
    for(int i = 0 ; i < taille ; i++){
      res.setElement(i, elements[i]);
    }
    for(int i = taille ; i < taille + t.getTaille() ; i++){
      res.setElement(i, elements[i]);
    }
    return res;
  }

  public String toString(){
    String r = "[";
    for(int i = 0 ; i < taille-1 ; i++){
      res += elements[i] + ", ";
    }
    res += elements[taille-1] + "]";
  }
}
