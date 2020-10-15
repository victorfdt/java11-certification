package nl.victorfdt.generics;

import nl.victorfdt.utils.Exercise;

public class LearnGenerics implements Exercise {

    @Override
    public void execute() {
        // Create a class that receives one generic type
        Crate<String> crate = new Crate<>("box");
        log(crate.getContent());

        // Create a class that receives two generic types
        WeightCrate<Elephant, Integer> weightCrate = new WeightCrate<>();
        weightCrate.getElement();
    }
}
