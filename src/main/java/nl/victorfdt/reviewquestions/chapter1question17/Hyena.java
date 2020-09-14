package nl.victorfdt.reviewquestions.chapter1question17;

import java.util.function.Predicate;

import nl.victorfdt.utils.Exercise;

/*
 * Options ot fill the blank
 * A. var -> p.age <= 10
 * B. shenzi -> age==1
 * C. p -> true
 * D. age==1
 * E. shenzi -> age==2
 * F. h -> h.age < 5
 * G.None of the above, as the code does not compile.
 * */
public class Hyena implements Exercise {
    private int age = 1;

    public void execute() {
        var p = new Hyena();
        double height = 10;
        int age = 1;
        //Fill the blank: testLaugh(p, ___________________);
        testLaugh(p, var -> p.age == 1);
        age = 2;
    }

    void testLaugh(Hyena panda, Predicate<Hyena> joke) {
        var r = joke.test(panda) ? "hahaha" : "silence";
        System.out.print(r);
    }
}

