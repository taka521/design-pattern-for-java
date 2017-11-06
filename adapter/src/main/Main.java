package main;

import extend.Print;
import extend.PrintBanner;

public class Main {

    public static void main(String[] args) {

        // 継承を使用したPrintBanner
        Print print = new PrintBanner("Java");
        print.printWeak();
        print.printStrong();

        // 委譲を使用したPrintBanner
        composition.Print cp = new composition.PrintBanner("PHP");
        cp.printWeak();
        cp.printStrong();

    }

}
