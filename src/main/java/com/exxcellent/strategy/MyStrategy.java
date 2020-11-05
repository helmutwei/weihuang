package com.exxcellent.strategy;

import java.util.Collection;

public interface MyStrategy {
    void add(Collection<String> c, String str);
    void delete(Collection<String> c, String str);
    void substitute(Collection<String> c, String str);
    void inspect(Collection<String> c);

}
