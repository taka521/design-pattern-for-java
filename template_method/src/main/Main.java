package main;

import display.AbstractDisplay;
import display.impl.CharDisplay;
import display.impl.StringDisplay;

public class Main {

    public static void main(String[] args) {

        AbstractDisplay d1 = new CharDisplay('H');
        AbstractDisplay d2 = new StringDisplay("Hello World.");
        AbstractDisplay d3 = new StringDisplay("こんにちは。");

        d1.display();
        d2.display();
        d3.display();

        // 実行結果
        //      <<HHHHH>>
        //      +------------+
        //      |Hello World.|
        //      |Hello World.|
        //      |Hello World.|
        //      |Hello World.|
        //      |Hello World.|
        //      +------------+
        //      +------------+
        //      |こんにちは。|
        //      |こんにちは。|
        //      |こんにちは。|
        //      |こんにちは。|
        //      |こんにちは。|
        //      +------------+

    }

}
