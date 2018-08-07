package com.myapp.controltimeout;

import java.time.Instant;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World! " + Instant.now());

        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);

        Runnable task = () -> System.out.println("Timeout Task executed at: " + Instant.now());
        executor.schedule(task, 3, TimeUnit.SECONDS);
        executor.shutdown();

        System.out.println( "Anything after scheduled! " + Instant.now());
    }
}
