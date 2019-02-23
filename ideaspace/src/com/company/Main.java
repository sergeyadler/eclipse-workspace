package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Address a1 = new Address("MainStreet", 13);
        Address a2 = new Address("5th Avenue", 3);
        Address a3 = new Address("privatestr", 1);

        Person p1 = new Person("Nick", 8, a1);
        Person p2 = new Person("Jane", 16, a1);
        Person p3 = new Person("Sam", 33, a2);
        Person p4 = new Person("Kim", 12, a2);
        Person p5 = new Person("mans", 13, a3);
        Person p6 = new Person("Jack", 45, a3);
        Person p7 = new Person("Jack", 45, a3);
        Person p8 = new Person("Sam", 33, a2);

        BankAccount ba1 = new BankAccount("DE090923455  ", p1);
        BankAccount ba2 = new BankAccount("US12323242", p2);
        BankAccount ba3 = new BankAccount("DE555496996996", p3);
        BankAccount ba4 = new BankAccount("RU569969969", p4);
        BankAccount ba5 = new BankAccount("DE92949994999", p5);
        BankAccount ba6 = new BankAccount("US93939393939", p6);
        BankAccount ba7 = new BankAccount("KZ004004040", p7);
        BankAccount ba8 = new BankAccount("KJ99499494", p8);


        List<Person> list = Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8);
        List<String> names = list.stream().map(p -> p.getName()).collect(Collectors.toList());

        System.out.println(names);
        System.out.println("-------------------------------------------------------------------------");
        System.out.println(removeDublicates(names));
        System.out.println("-------------------------------------------------------------------------");


        List<Address> addresses = getAddresses(Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8));

        System.out.println("Addresses more 17 " + addresses);
        System.out.println("-------------------------------------------------------------------------");


        Map<Integer, List<Person>> personsByAge = getPersonsByAge(Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8));

        System.out.println("Person by age " + personsByAge);
        System.out.println("-------------------------------------------------------------------------");

        System.out.println("Stars ibanns " + starseBankAccounts(Arrays.asList(ba1, ba2, ba3, ba4, ba5, ba6, ba7, ba8)));
        System.out.println("-------------------------------------------------------------------------");

        System.out.println("Total age " + sumAge(Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8)));
        System.out.println("-------------------------------------------------------------------------");

        System.out.println(ofLegalAge(Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8)));

        System.out.println("-------------------------------------------------------------------------");

        String isNumber = "39493923493294234993493249324";
        System.out.println("IS "+ isNumber +"a nubmer?  ----->    "+ stringIsNumber(isNumber));
        String isNumber2 = "39bazinga98989";
        System.out.println("IS "+ isNumber2 +"a nubmer?  ----->    "+ stringIsNumber(isNumber2));


//		Employee frank = new Employee("Frank", 2500);
//		Integer salary = frank.getSalary();
//
//		Supplier<Integer>sup = frank::getSalary;
//		Employee jimbo = new Employee("Jimbo", 2500);
//		Employee jane = new Employee("Jane", 2500);
//
//		List<Employee> employees = Arrays.asList(frank,jimbo,jane);
//
//


    }

    public static List<String> removeDublicates(List<String> names) {
        return names.stream().distinct().collect(Collectors.toList());
    }

    public static List<Address> getAddresses(List<Person> people) {
        return people.stream().filter(p -> p.getAge() > 17).map(p -> p.getAddress()).collect(Collectors.toList());

    }


    //groipingBy -->Returns a Collector implementing a "group by" operation on input elements of type T,
    // grouping elements according to a classification function, and returning the results in a Map.
    public static Map<Integer, List<Person>> getPersonsByAge(List<Person> persons) {
        return persons.stream().collect(Collectors.groupingBy(Person::getAge));

    }

    public static List<String> starseBankAccounts(List<BankAccount> bankAccounts) {
        return bankAccounts
                .stream()
                .map(BankAccount::getIBANN)
                .map(s -> starsInIbann(s))
                .collect(Collectors.toList());
    }

    //replaceAll--Replaces each substring of this string that matches the given regular expression with the given replacement.
    public static String starsInIbann(String ibann) {
        return ibann.substring(0, 3) + ibann.substring(3).replaceAll("\\d", "*");
        //  \\d замена числа на " * "

    }

    public static int sumAge(List<Person> persons) {

        return persons.stream()
                .filter(p -> p.getAge() > 17)
                .reduce(0, (a, b) -> a + b.getAge(), (a, b) -> a + b);

    }

    public static String ofLegalAge(List<Person> persons) {
        return persons.stream()
                .filter(p -> p.getAge() > 17)
                .map(Person::getName)
                .collect(Collectors.joining(" and ", "In Germany ", " are of legal age"));
    }

    public static boolean stringIsNumber(String isNumber) {
        return isNumber.chars().allMatch(Character::isDigit);
    }
}