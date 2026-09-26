// java hello world
//package javaproject;(if we use this line errors occours resons show in ginven bleow
public class Main{
    static void main(String[] args){
        System.out.println("hello word!");
    }
}
/*
Why?

Currently you have:

src
└── Main.java

So there is no javaproject folder.

If you wanted to use:

        package javaproject;

then the structure should be:

src
└── javaproject
    └── Main.java

        For now, I recommend removing package javaproject;
        while you're learning Java. Once you start Maven projects,
         I'll show you the proper package structure.

        */
