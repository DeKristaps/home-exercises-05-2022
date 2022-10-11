package io.codelex.streams.practice;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * TODO - search for StreamsExerciseTest and make all tests pass
 */
public class StreamsExercise {
    public static List<Integer> returnSquareRoot(List<Integer> numbers) {
        return numbers.stream().map(num -> (int) Math.sqrt(num)).toList();
    }

    public static List<Integer> getAgeFromUsers(List<User> user) {
        return user.stream().map(User::getAge).toList();
    }

    public static List<Integer> getDistinctAges(List<User> users) {
        return users.stream().map(User::getAge).distinct().toList();
    }

    public static List<User> getLimitedUserList(List<User> users, int limit) {
        return users.stream().limit(limit).toList();
    }

    public static Integer countUsersOlderThen25(List<User> users) {
        return users.stream().map(User::getAge).filter(age -> age > 25).toList().size();
    }

    public static List<String> mapToUpperCase(List<String> strings) {
        return strings.stream().map(String::toUpperCase).toList();
    }

    public static Integer sum(List<Integer> integers) {
        return integers.stream().mapToInt(Integer::intValue).sum();
    }

    public static List<Integer> skip(List<Integer> integers, Integer toSkip) {
        return integers.stream().skip(toSkip).toList();
    }

    public static List<String> getFirstNames(List<String> names) {
        return names.stream().map(string -> {
            String[] splitString = string.split(" ");
            return splitString[0];
        }).toList();
    }

    public static List<String> getDistinctLetters(List<String> names) {
        return names.stream().map(name -> name.split("")).flatMap(Arrays::stream).distinct().toList();
    }

    public static String separateNamesByComma(List<User> users) {
        return users.stream().map(User::getName).collect(Collectors.joining(", "));
    }

    public static double getAverageAge(List<User> users) {
        return users.stream().map(User::getAge).mapToDouble(Integer::doubleValue).average().orElse(0d);
    }

    public static Integer getMaxAge(List<User> users) {
        return users.stream().map(User::getAge).mapToInt(Integer::intValue).max().orElse(0);
    }

    public static Integer getMinAge(List<User> users) {
        return users.stream().map(User::getAge).mapToInt(Integer::intValue).min().orElse(0);
    }

    public static Map<Boolean, List<User>> partionUsersByGender(List<User> users) {
        return users.stream().collect(Collectors.partitioningBy(User::isMale));
    }

    public static Map<Integer, List<User>> groupByAge(List<User> users) {
        return users.stream().collect(Collectors.groupingBy(User::getAge));
    }

    public static Map<Boolean, Map<Integer, List<User>>> groupByGenderAndAge(List<User> users) {
        return users.stream().collect(Collectors.groupingBy(User::isMale, Collectors.groupingBy(User::getAge)));
    }

    public static Map<Boolean, Long> countGender(List<User> users) {
        return users.stream().collect(Collectors.groupingBy(User::isMale, Collectors.counting()));
    }

    public static boolean anyMatch(List<User> users, int age) {
        return users.stream().map(User::getAge).anyMatch(a -> a == age);
    }

    public static boolean noneMatch(List<User> users, int age) {
        return users.stream().map(User::getAge).noneMatch(a -> a == age);
    }

    public static Optional<User> findAny(List<User> users, String name) {
        return users.stream().filter(c -> c.getName().equals(name)).findAny();
    }

    public static List<User> sortByAge(List<User> users) {
        return users.stream().sorted(Comparator.comparing(User::getAge)).toList();
    }

    public static Stream<Integer> getBoxedStream(IntStream stream) {
        return stream.boxed();
    }

    public static List<Integer> generateFirst10PrimeNumbers() {
        return IntStream.iterate(2, i -> i + 1).filter(StreamsExercise::isPrime).boxed().limit(10).toList();
    }

    public static boolean isPrime(int number) {
        return IntStream.rangeClosed(2, number / 2).noneMatch(i -> number % i == 0);
    }

    public static List<Integer> generate10RandomNumbers() {
        return new Random().ints().boxed().limit(10).toList();
    }

    public static User findOldest(List<User> users) {
        return users.stream().max(Comparator.comparing(User::getAge)).orElse(null);
    }

    public static int sumAge(List<User> users) {
        return users.stream().map(User::getAge).mapToInt(Integer::intValue).sum();
    }

    public static IntSummaryStatistics ageSummaryStatistics(List<User> users) {
        return users.stream().map(User::getAge).mapToInt(Integer::intValue).summaryStatistics();
    }
}
