package pl.roszczyna.teaching.structures;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Structures {

    public static void main(String[] args) {
        // List, Map/Dictionary, Set, Queue
        // List
        List<String> names = List.of("Peter", "Jane", "Tarzan", "Leonidas", "Tarzan", "Guinewra", "Artur", "Geralt");

        // Set
        Set<String> namesSet = new HashSet<>(names);

        // Map
        Map<String, String> peselToIdentity = new HashMap<>();
        peselToIdentity.put("9781234449123", "Jerzy Kowalski");
        peselToIdentity.get("9781234449123").equals("Jerzy Kowalski");

        // Queue
        Queue<String> queue = new PriorityQueue<>();
        queue.offer("Jowite");
        queue.offer("Henryk");

        // Stream
        // filter
        List<String> gNames = names
                .stream()
                .filter(s -> s.startsWith("G"))
                .collect(Collectors.toList());
        // map
        List<Integer> lettersCount = names.stream()
                .map(s -> s.length())
                .collect(Collectors.toList());
        // reducers
        Integer namesCount = names.size();
        Optional<Integer> lettersCountAvg = names.stream()
                .map(s -> s.length())
                .reduce(Integer::sum);
        double avg = namesCount == 0 ? 0 : lettersCountAvg.orElse(0).doubleValue() / namesCount.doubleValue();
        // git

    }
}
