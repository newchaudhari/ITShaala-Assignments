package __oops.functional_interaface;

import java.util.Scanner;

@FunctionalInterface
public interface Summer<S> {
    //Write a generic functional interface named Summer,
    // and use it to compute the sum of two Integers,
    // the sum of two Doubles, and the sum of two Longs.
    S sum(S n1, S n2);
}
/**/