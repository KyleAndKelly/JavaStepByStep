package com.kylechen.teststream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStream {
    public static void main(String[] args) {
        //1. list stream
        List<Integer> nums = new ArrayList<>();
        Collections.addAll(nums,4,3,8,7,7,79);
        Stream<Integer> listStream = nums.stream();
        listStream.filter(n->n>3).sorted((o1,o2)->o2-o1)
                .skip(1)
                .limit(2)
                .distinct()
                .forEach(n-> System.out.println(n));

        //2.map stream
        Map<String,Double> names = new HashMap<>();
        names.put("Tom",176.3);
        names.put("Kelly",158.6);
        names.put("Kyle",181.1);
        Set<Map.Entry<String,Double>> entrySet = names.entrySet();

        Stream<Map.Entry<String,Double>> mapStream1 = entrySet.stream();
        mapStream1.filter(k->k.getKey().contains("K")).forEach(k-> System.out.println(k.getKey()));

        Stream<Map.Entry<String,Double>> mapStream2 = entrySet.stream();
        System.out.println(
                mapStream2.filter(k->k.getKey().contains("K"))
                        .max((k1,k2)->Double.compare(k2.getValue(),k1.getValue())).get().getKey()
        );

        Stream<Map.Entry<String,Double>> mapStream3 = entrySet.stream();
        List<String> keyList = mapStream3.filter(k->k.getKey().contains("K")).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(keyList);

        Stream<Map.Entry<String,Double>> mapStream4 = entrySet.stream();
        Map<String, Double> resultMap  = mapStream4.filter(k->k.getKey().contains("K")).collect(Collectors.toMap(k->k.getKey(),k->k.getValue()));
        System.out.println(resultMap);

    }
}
