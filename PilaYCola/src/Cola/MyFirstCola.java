package Cola;

public class MyFirstCola<T> {

	private MyFirstCola<T> cola;
	private T cabeza;

	public MyFirstCola() {
		this(null);
	}

	public MyFirstCola(T cabeza) {
		this.cola = null;
		this.cabeza = cabeza;
	}

	public void push(T t) {
		cola = new MyFirstCola<T>(t);
	}

	public T pop() {
		T resultado = null;
		if (cola != null) {
			resultado = cabeza;
			cabeza = cola.cabeza;
			cola = cola.cola;
		}
		return resultado;
	}

}
