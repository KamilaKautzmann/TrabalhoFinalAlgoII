
public class ListaEncadeada {

	private No primeiro;
	private No ultimo;
	private int qtdNo;

	public ListaEncadeada() { // toda vez que iniciar a lista o primeiro e o
								// ultimo sera nulo e a lista começara em 0
		this.primeiro = null;
		this.ultimo = null;
		this.qtdNo = 0;
	}


	public void setPrimeiro(No primeiro) {
		this.primeiro = primeiro;
	}

	public void setUltimo(No ultimo) {
		this.ultimo = ultimo;
	}

	public int getQtdNo() {
		return qtdNo;
	}

	public void setQtdNo(int qtdNo) {
		this.qtdNo = qtdNo;
	}

	/* verifica se o primeiro item é vazio */
	public boolean eVazio() {
		return (this.primeiro == null);
	}

	/* Insere o objeto no fim da lista. */
	public void append(Object o) {
		No novoNo = new No(o);
		if (this.eVazio()) {// se a lista for vazio 
			this.primeiro = novoNo; //o unico item recebe novo
			primeiro.setProx(novoNo); // o proximo tbm sera o novo
			primeiro.setAnterior(novoNo); // o anterior tbm sera o novo
			this.ultimo = primeiro; //ultimo recebe primeiro 
			
		} else {
			this.ultimo.setProx(novoNo);// o proximo item do ultimo vai receber o novo
			novoNo.setAnterior(ultimo); // o novo anterior vai receber o ultimo 
			novoNo.setProx(null); // e o proximo vai fica em banco
			this.ultimo = novoNo;// o ultimo vai receber o novo
			
		}
		//this.qtdNo++;

	}

	/* Insere o objeto no inicio da lista. */
	public void addFirst(Object o) {
		No novoNo = new No(o);
		if (this.eVazio()) { // se a lista for vazio o unico item recebe novo
			this.primeiro = novoNo;
			primeiro.setProx(primeiro);
			primeiro.setAnterior(null);
			this.ultimo = primeiro; 
		}else{
			this.primeiro.setAnterior(novoNo);
			novoNo.setProx(primeiro);
			novoNo.setAnterior(null);
			this.primeiro = novoNo; 
		}
		//this.qtdNo++;

	}

	/* Remove o objeto da lista. */ /*professor declarou como void mas foi mudado pra boolean para validar caso ao exista dados no no
	/*public boolean remove(Object o) {
		No atual = this.primeiro; // o atual ta recebendo o primeiro item da lista
		No anterior = null;
		
		if(this.eVazio()){ // se o dado tiver vazio n tem o que deletar
			return false;
		}else {
			while(atual != null){
			anterior = atual; // o anterior vai rebeve o atual ou seja ao prmeiro item da lista
			atual = atual.next(); // atual vai receber o proximo do primeiro item 	
			}
		if(atual == this.primeiro){ // se o atual for o primeiro e igual ao ultimo  
			if(this.getFirst() == this.ultimo){ 
				this.ultimo = null; //faz o unico ficar null 
			}
			this.primeiro = this.primeiro.next(); // o primeiro vai receber o primeiro que vai ser o proximo
		}else{
			if(atual == this.ultimo){ 
				this.ultimo = anterior;
			}
			anterior.setProx(atual.next());
			}
		}
		this.qtdNo--;
		return true;
	}*/

	/* Recupera o primeiro No da lista. */
	public No getFirst(){
		return primeiro; 
	}

	/* Recupera o ultimo No da lista. */
	public No getLast(){
		return ultimo;
	}

	/* Testa se o objeto existe na lista. */
	public Object hasObject(Object o){
		if(primeiro != null);	
		return o;
	}
}
	