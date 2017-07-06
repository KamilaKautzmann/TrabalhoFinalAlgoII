
public class TestaListaEncadeada {

    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();
        lista.append("2");
        lista.append("3");
        lista.append("4");
        lista.append("5");
        lista.append("6");
        lista.addFirst("1");
        imprime(lista);
        No iter = lista.getFirst();
        for (int i = 0; i < 3; i++)
            iter = iter.next();
        iter.insertBefore(new No("Antes do 4"));
        iter.insertAfter(new No("Depois do 4"));
        imprime(lista);
        System.out.println("Lista ao contrario:");
        iter = lista.getLast();
        while (iter != null) {
            System.out.println(iter.getData());
            iter = iter.previous();
        }       
    }
	
	private static void imprime(ListaEncadeada lista) {
        No iter = lista.getFirst();
        while (iter != null) {
            System.out.println(iter.getData());
            iter = iter.next();
        }
        System.out.println("---------");
    }
	
	
}
