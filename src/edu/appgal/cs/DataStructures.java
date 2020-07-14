package edu.appgal.cs;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class DataStructures {

    public static void main(String[] args)
    {
        DataStructures object = new DataStructures();

        //InEfficient Lookup
        object.inefficientLookup();

        //Efficient Lookup
        object.efficientLookup();
    }

    public void inefficientLookup()
    {
        List<String> list = new ArrayList<>();
        for(int i=0; i<100000; i++)
        {
            list.add(""+i);
        }

        //Find 0 (top)
        long start = TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        String searchResult = null;
        for(String number:list)
        {
            if(number.equals("0"))
            {
                searchResult = number;
                break;
            }
        }
        long end = TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        long speed = end - start;
        System.out.println("*******");
        System.out.println("Time for Search (Top): Result :"+searchResult+" Speed: "+speed+" nanoseconds");
        System.out.println("*******");

        //Find 9 (bottom)
        start = TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        searchResult = null;
        for(String number:list)
        {
            if(number.equals("99999"))
            {
                searchResult = number;
                break;
            }
        }
        end = TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        speed = end - start;
        System.out.println("*******");
        System.out.println("Time for Search (Bottom): Result :"+searchResult+" Speed: "+speed+" nanoseconds");
        System.out.println("*******");
    }

    public void efficientLookup()
    {
        Map<String, String> map = new HashMap<>();
        for(int i=0; i<100000; i++)
        {
            map.put(""+i, ""+i);
        }

        //Find 0 (top)
        long start = TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        String searchResult = map.get("0");
        long end = TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        long speed = end - start;
        System.out.println("*******");
        System.out.println("Time for Search (Top): Result :"+searchResult+" Speed: "+speed+" nanoseconds");
        System.out.println("*******");

        //Find 9 (bottom)
        start = TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        searchResult = map.get("99999");
        end = TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        speed = end - start;
        System.out.println("*******");
        System.out.println("Time for Search (Bottom): Result :"+searchResult+" Speed: "+speed+" nanoseconds");
        System.out.println("*******");
    }
}
