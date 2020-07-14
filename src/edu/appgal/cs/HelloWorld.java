package edu.appgal.cs;

public class HelloWorld
{
    public static void main(String[] args)
    {
        HelloWorld object = new HelloWorld();

        //Demonstrate the concept of a Memory
        object.memoryDemo();

        //Demonstrate the concept of a OutOfMemory
        object.outOfMemoryDemo();
    }

    public void memoryDemo()
    {
        for(int i=0; i<10; i++)
        {
            String message = "Love you World";
            System.out.println(message);
        }
    }

    public void outOfMemoryDemo()
    {
        String message = "OUT_OF_MEMORY_DEMO";
        System.out.println(message);
        outOfMemoryDemo();
    }
}

