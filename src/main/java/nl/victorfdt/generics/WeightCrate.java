package nl.victorfdt.generics;

public class WeightCrate<E, N> implements Shippable<E>{
    private E element;
    private N weight;

    public N getWeight() {
        return weight;
    }

    public void setWeight(N weight) {
        this.weight = weight;
    }

    public E getElement() {
        return element;
    }

    public void setElement(E element) {
        this.element = element;
    }
}
