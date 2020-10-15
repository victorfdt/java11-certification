package nl.victorfdt.generics;

public class Crate<T> {
    private T content;

    public Crate(T content){
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }
}
