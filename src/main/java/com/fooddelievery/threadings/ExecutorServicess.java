package com.fooddelievery.threadings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class ExecutorServicess
{
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(5);
//        executor.execute(new FirstThreadRunable());
//        executor.execute(new FirstThreadRunable());

/*        List<Callable<String>> tasks1 = Arrays.asList(
                new CallAbleImpl("a"),
                new CallAbleImpl("b"),
                new CallAbleImpl("c")
        );

        List<Future<String>> results = executor.invokeAll(tasks1);

        for(Future<String> f : results)
        {
            System.out.println(f.get());
        }
        executor.shutdown();

          CompletableFuture<String> future = CompletableFuture.supplyAsync(() ->
                  {
                    return   future();
                  }

          ).thenApply(str ->  {
                      int a =  4/0;
              return str += " new value" ;
          } ) .thenApply(str ->  { return str.toUpperCase() ; } )
             //     .thenAccept( str -> {    System.out.println(str); } )
                  .exceptionally(ex -> "Fallback: " + ex.getMessage())
                  ;

    System.out.println(future.get());


        CompletableFuture<String> hello = CompletableFuture.supplyAsync(() -> "Hello");
        CompletableFuture<String> world = CompletableFuture.supplyAsync(() -> "World");

        hello.thenCombine(world, (h, w) -> h + " " + w)
                .exceptionally(ex -> "Fallback: " + ex.getMessage())

                .thenAccept(   val ->
                        {
                            System.out.println("  this is value " + val) ;
                        }
).join() ;
*/

  //      ExecutorService executor = Executors.newFixedThreadPool(10);
        List<Callable<String>> tasks = new ArrayList<>();

// Create 1000 tasks
/*
        for (int i = 0; i < 10; i++) {
            tasks.add(new CallAbleImpl() );
        }

// Process in batches of 10 parallel threads
        List<Future<String>> results = executor.invokeAll(tasks);

              for(int a= 0 ;a < results.size();a++ )
              {

                  System.out.println(results.get(a).get());


              }



                    executor.shutdown();
*/

        StringBuilder sb = new StringBuilder(); sb.append("Hello"); sb.append(10); System.out.println(sb);

    }

    public  static String future()
    {
        return "my name is saqib";
    }


}
