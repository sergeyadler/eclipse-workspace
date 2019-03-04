package stream_api.HomeWork;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import stream_api.HomeWork.*;

import jdk.jshell.spi.ExecutionControl.NotImplementedException;

public class StreamHW {

    public static List<Integer> returnSquareRoot(List<Integer> numbers){
    	return numbers.stream().map(p-> Math.sqrt(p)).map(p->p.intValue()).collect(Collectors.toList());
        
    }

    public static List<Integer> getAgeFromUsers(List<User> user){
        return user.stream().map(User::getAge)
                     .collect(Collectors.toList());
    }

    public static List<Integer> getDistinctAges(List<User> users){
       return users.stream()
    	.map(User::getAge)
        .distinct()
        .collect(Collectors.toList());
    }

    public static List<User> getLimitedUserList(List<User> users, int limit){
        List<User> getlim = users.stream()
                .limit(limit)
                .collect(Collectors.toList());
                return getlim;
    }

    public static Integer countUsersOlderThen25(List<User> users){
//    	 long res = users.stream().filter((p)->p.getAge()>25)
//         		.count();
//          return (int) res;
    	 return (int) users.stream()
         		.filter(u -> u.getAge() > 25)
         		.count();
    }

    public static List<String> mapToUpperCase(List<String> strings){
        return strings.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    public static Integer sum(List<Integer> integers){
    	return integers.stream()
    			.collect(Collectors.summingInt(Integer::intValue));
    }

    public static List<Integer> skip(List<Integer> integers, Integer toSkip){
        return integers.stream().skip(toSkip).collect(Collectors.toList());
        }

//    public static List<String> getFirstNames(List<String> names){
//        throw new NotImplementedException();
//    }

    public static List<String> getDistinctLetters(List<String> names){
    	  return names.stream().map((s)->s.substring(0, s.indexOf(" ")))
        		  .collect(Collectors.toList());

    }


    public static String separateNamesByComma(List<User> users){
    	 return users.stream()
         		.map(User::getName)
         		.collect(Collectors.joining(", "));
    }

    public static double getAverageAge(List<User> users){
    	return users.stream().mapToInt(User::getAge).average().getAsDouble();
    }

    public static Integer getMaxAge(List<User> users){
    	return users.stream().map(User::getAge).max((p1,p2)->p1.compareTo(p2)).get();
    }

    public static Integer getMinAge(List<User> users) {
        return users.stream().map(User::getAge).min((p1,p2)->p1.compareTo(p2)).get();
    }

    public static Map<Boolean, List<User>> partionUsersByGender(List<User> users){
     return users.stream().collect(Collectors.partitioningBy(User::isMale));
    }

    public static Map<Integer, List<User>> groupByAge(List<User> users){
       return users.stream().collect(Collectors.groupingBy(User::getAge));	
    }

    public static Map<Boolean, Map<Integer, List<User>>> groupByGenderAndAge(List<User> users){
        return users.stream().collect(Collectors.groupingBy((User::isMale),Collectors.groupingBy(User::getAge)));
    }

    public static Map<Boolean, Long> countGender(List<User> users){
        return users.stream().collect(Collectors.groupingBy((User::isMale),Collectors.counting()));
    }

    public static boolean anyMatch(List<User> users, int age){
        return users.stream().anyMatch(s->s.getAge()==age);
    }

    public static boolean noneMatch(List<User> users, int age){
       return users.stream().noneMatch(s->s.getAge()==age);
    }

    public static Optional<User> findAny(List<User> users, String name){
       return users.stream().findAny();
    }

   public static List<User> sortByAge(List<User> users){
        return users.stream().sorted((s1,s2)-> s1.getAge().compareTo(s2.getAge())).collect(Collectors.toList());
    }
//
//    public static Stream<Integer> getBoxedStream(IntStream stream){
//        throw new NotImplementedException();
//    }
//
    public static List<Integer> generateFirst10PrimeNumbers(){
       return IntStream.rangeClosed(2, 30).filter(x-> isPrime(x)).boxed().collect(Collectors.toList());
    }

    public static boolean isPrime(int number) {
       return IntStream.rangeClosed(2, number/2).noneMatch(i -> number%i == 0);
   }
//
    public static List<Integer> generate10RandomNumbers(){
    	Random random = new Random();
    	List<Integer> list= random.ints(10).boxed().collect(Collectors.toList());
    	return list;
     
    }

 public static User findOldest(List<User> users){
        return users.stream().max((p1, p2) -> p1.getAge()
	.compareTo(p2.getAge())).get();
}

 public static int sumAge(List<User> users){
	 return users.stream().mapToInt(User::getAge)
 			.sum();
    }
//
  public static IntSummaryStatistics ageSummaryStatistics(List<User> users){
     return users.stream().mapToInt(User::getAge).summaryStatistics();   
    }

}
