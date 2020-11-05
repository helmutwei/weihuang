package com.exxcellent.strategy;

import java.util.Collection;


/*
    inferface for setting a strategy/operation for manipulating a collection of Strings;
    This interface contains four methods, but for the programming challenge only the method
    inspect(Collection<String>) is used.
*/
public interface MyStrategy {
    void add(Collection<String> c, String str);
    void delete(Collection<String> c, String str);
    void substitute(Collection<String> c, String str);
    void inspect(Collection<String> c);

}
