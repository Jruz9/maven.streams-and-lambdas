package com.github.curriculeon.conversions;

import com.github.curriculeon.anthropoid.Person;
import com.github.curriculeon.anthropoid.PersonFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by leon on 5/25/17.
 */
public final class StreamConverter extends PersonConversionAgent<Stream<Person>> {
    private final List<Person> personList;
    public StreamConverter(Stream<Person> people) {
        super(people);
        this.personList = super.objectSequence.collect(Collectors.toList());
    }

    public StreamConverter(int collectionSize) {
        this(Stream
                .generate(new PersonFactory()::createRandomPerson)
                .limit(collectionSize));
    }

    // TODO
    public List<Person> toList() {
        List<Person>personList1 = new ArrayList<>();
        personList.stream().
                forEach(personList1::add);
        return personList1;
    }

    // TODO
    public Stream<Person> toStream() {
        return personList.stream();
    }

    // TODO
    public Person[] toArray() {
        return this.personList.toArray(new Person[0]);
    }
}
