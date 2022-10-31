package capitolo_11.esempi.paragrafo_11_1;
public class ContenitoreGenerics<T> {
    private T object;

    public void setObject(T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }
}