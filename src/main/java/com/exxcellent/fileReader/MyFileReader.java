package com.exxcellent.fileReader;

import java.util.Collection;

/*
    inferface for reading a given file to a destinated collection;
    This interface contains only one method.
*/
@FunctionalInterface
public interface MyFileReader {
    void readFile(String url, Collection<String> collection);
}
