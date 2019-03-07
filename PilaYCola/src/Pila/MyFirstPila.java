package Pila;

public class MyFirstPila<T> {

	private T cabeza;
	private MyFirstPila<T> cola;

	public MyFirstPila() {
		this(null);
	}

	public MyFirstPila(T cabeza) {
		this.cola = null;
		this.cabeza = cabeza;
	}

	public void push(T t) {
		cola = new MyFirstPila<T>(cabeza);
		cabeza = t;
	}

	public T pop() {
		T resultado = null;
		if (cabeza != null) {
			resultado = cabeza;
			cabeza = cola.cabeza;
			cola = cola.cola;
		}
		return resultado;
	}

}
