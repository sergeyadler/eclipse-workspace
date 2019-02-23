package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Main2 {
    public static void main(String[] args) {

        Employee frank = new Employee("Frank", 2500);
        Integer salary = frank.getSalary();

        Supplier<Integer>sup = frank::getSalary;
        Employee jimbo = new Employee("Jimbo", 4500);
        Employee jane = new Employee("Jane", 2500);

        List<Employee> employees = new ArrayList<>();
        employees.add(jane);
        employees.add(jimbo);
        employees.add(frank);
        Stream<Employee> s1 = Stream.of(frank,jimbo,jane);
        Optional<Integer>max= s1.map(Employee::getSalary).max(Integer::compare);
        System.out.println("Max"+max.get());

        List<Employee>e2= Arrays.asList(jane,frank);
        employees.addAll(e2);
        System.out.println(employees.size());
        Stream<Integer> map = employees.stream().map(e->{
            System.out.println("Name "+e.name);
            return e.getSalary();
        });
        map.forEach(System.out::println);
    }


}

