package design.patterns.p18.interpreter.p03;

import java.util.List;

public interface Filter<T> {

	List<T> filter(String str);

}
