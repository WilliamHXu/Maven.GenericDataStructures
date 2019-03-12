package MapFunc;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Create a function called `map` that takes an ArrayList and a `Function<T,R>` object,
 * and returns an ArrayList with all of the elements of the first after the function is applied to them.
 */
public class MapFunc {

    public static ArrayList map(ArrayList arrayList, Function<Integer, Object> function){
        return (ArrayList) arrayList.stream().map(function).collect(Collectors.toCollection(ArrayList::new));
    }
}
