package StreamsAndLambdas;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsClient {
    public static void main(String[] args){
        List<Integer> list = List.of(2, 72, 3, 4, 6, 6, 62, 10, 1, 9, 8, 9, 12);

        Stream<Integer> stream = list.stream();

//        filter only even numbers , reject all odd numbers
//        filter is an intermediate method : returns back stream object
//        intermediate : Apply as many intermediate operations as much required
//          collect : terminal method : helps to close the stream and get some data back
        List<Integer> l2 =
                stream
                .filter((x) -> { return x  % 2 == 0;})
                .sorted()
                .collect(Collectors.toList());

        System.out.println(l2);
        //        multiple terminal methods can't be invoked on the same stream
//        once you invoke a terminal , the stream is closed

//        stream has already been operated upon or closed

//        stream.filter((x) -> x % 2 != 0);
//     map(argument) -> transforms into something else using the logic mentioned
//        filter the even data and sort, for every element get it's square

         List<Integer> l3 =
                 list.stream()
                        .filter((x) -> { return x  % 2 == 0;})
                        .sorted()
                        .map((x) -> x * x)
                        .collect(Collectors.toList());

        System.out.println(l3);

        List<Integer> l4 =
                list.stream()
                        .filter((x) -> { return x  % 2 == 0;})
                        .sorted()
                        .map((x) -> x * x)
                        .distinct()
                        .collect(Collectors.toList());

        System.out.println(l4);

        Optional<Integer> l5 =
                list.stream()
                        .filter((x) -> {
                            System.out.println("Filtering :" + x);
                            return x  % 2 == 0;}
                        )
                        .map((x) -> {
                            System.out.println("Mapping : " + x);
                            return x * x;
                        })
                        .sorted()
                        .distinct()
                        .findAny();
        Integer ans = null;
        if(l5.isEmpty()){
            System.out.println("No element is present in the output");
        }
        ans = l5.get();

//        in a scenario where filter filters out all elements, findAny should return null
//        Optional helps you handle null in much better manner

//        Student.findByRollNumber(5);
        try{
            Student.find(5);
        } catch (FileNotFoundException e) {
            System.out.println("File Not found! Please check if file even exists or not");
        } catch (NullPointerException e) {
            System.out.println("Null pointer exception is coming, it's my mistake because of which it is coming. Please don't fire me");
        } catch (RuntimeException e){
            System.out.println("Handling this exception");
        }
// whenever you are writing multiple catches, specific exception should come first,
//        general should come later on
        Exception ex = new FileNotFoundException();
        ex = new NullPointerException();
        ex = new IOException();
        ex = new ArithmeticException();

        Student.findAgain(5);
    }
}

// test (Integer t) {
// matches the testing logic
// }
