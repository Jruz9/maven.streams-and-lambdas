package com.github.curriculeon;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by leon on 5/24/17.
 */
public class StreamMap {
    /**
     * Section 8.3
     * @param someWord - word to convert to Stream<String>
     * @return - a Stream of single characters
     */ //TODO
    public static Stream<String> letters(String someWord) {
//        String[] stringStream=someWord.split("") ;
//        return  Stream.of(stringStream);

        //or

        return  Arrays.stream(someWord.split(""))
                .sequential();
    }

    /**
     * @param someWords - variable amount of String arguments
     * @return - a Stream of several Streams of single characters
     */ //TODO
    public static Stream<Stream<String>> wordsMap(String... someWords) {
       // List<Stream<String>> nestedList = new ArrayList<>();
        return Arrays.stream(someWords).map(StreamMap::letters);

    }

    /**
     * @param stringArray - variable amount of String arguments
     * @return - a Stream of several Streams of single characters
     */ //TODO
    public static Stream<String> wordsFlatMap(String... stringArray) {
        return Arrays.stream(stringArray).flatMap(StreamMap::letters);
    }
}