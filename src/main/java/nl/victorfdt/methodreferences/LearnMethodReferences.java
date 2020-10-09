package nl.victorfdt.methodreferences;

import nl.victorfdt.annotations.Manager;
import nl.victorfdt.utils.Exercise;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LearnMethodReferences implements Exercise {
    public void execute() {
        /*  There are four types of Reference Methods */

        // STATIC METHODs
        // My functional interface receives a parameter, but I don't need to specify it because Java can assume that.
        LogElement log = System.out::println;
        log.log("Hello");

        var list1 = new ArrayList<Integer>(List.of(1, 5, 77, 3, 5, 2));
        Consumer<List<Integer>> consumer = Collections::sort;
        consumer.accept(list1);
        log.log(list1);

        // CALLING AN INSTANCE IN A PARTICULAR OBJECT
        var random = new Random();
        Supplier<Integer> methodRefSupplier = random::nextInt;
        Supplier<Integer> lambdaSupplier = () -> random.nextInt();

        var text = "Victor";
        Predicate<String> methodRefPredicate = text::startsWith;
        Predicate<String> lambdaPredicate = s -> text.startsWith(s);

        log.log(methodRefPredicate.test("V"));
        log.log(lambdaPredicate.test("V"));

        // CALLING INSTANCE METHOD ON A PARAMETER
        Predicate<String> methodRedEmpty = String::isEmpty;
        Predicate<String> lambdaEmpty = e -> e.isEmpty();

        Function<String, String> function = String::toString;
        Function<Integer, String> function2 = e -> e.toString();

        // CALLING CONSTRUCTORS
        Supplier<Manager> methodRedSupplierLong = Manager::new;
    }
}
