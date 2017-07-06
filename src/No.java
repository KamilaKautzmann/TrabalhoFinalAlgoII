
public class No {

	private Object dado;
	private No prox;
	private No anterior;

	/* Cria um novo no. */
	public No(Object o) {
		this.dado = o;
		this.prox = null;
		this.anterior = null;

	}

	public Object getDado() {
		return dado;
	}

	public void setDado(Object dado) {
		this.dado = dado;
	}

	public void setProx(No prox) {
		this.prox = prox;
	}

	public void setAnterior(No anterior) {
		this.anterior = anterior;
	}

	/* Testa se existe um No apos esse no. */
	public boolean hasNext() {
		if (this.prox != null) {
			return true;
		} else {
			return false;
		}
	}

	/* Testa se existe um No antes desse no. */
	public boolean hasPrevious() {
		if (this.anterior != null) {
			return true;
		} else {
			return false;
		}
	}

	/* Retorna o próximo No. */
	public No next() {
		return prox;
	}

	/* Retorna o No anterior. */
	public No previous() {
		return anterior;
	}

	/* Insere um No após esse no. */
	public void insertAfter(No novo) {
		this.prox.setAnterior(novo);//o proximo vai ser o anterior que vai receber o novo
		novo.setProx(prox); // o proximo vai receber o proximo
		novo.setAnterior(this); // o anterior vai recebe o anterior
		this.setProx(novo);		// o proximo vai ser o novo
	}

	/* Insere um No antes desse no. */
	public void insertBefore(No novo) {
		this.previous().setProx(novo); // O proximo vai recebe o novo
		novo.setAnterior(this.previous()); // o anterior vai receber o anterior
		novo.setProx(this); // o ´proximo vai recebe o proximo
		this.setAnterior(novo); // o anterior vai receber o novo
	}

	/* Remove o no */
	/*public void remove() {
	}*/

	/* Recupera o dado armazenado. */
	public Object getData() {
		return dado;
	}
	
	
}
