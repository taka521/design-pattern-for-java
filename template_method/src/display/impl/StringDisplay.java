package display.impl;

import display.AbstractDisplay;
import display.Console;

import java.nio.charset.Charset;

public class StringDisplay extends AbstractDisplay {

    /** 表示すべき文字列 */
    private final String s;

    /** 表示する文字列のバイト数 */
    private final int length;

    public StringDisplay(final String s) {
        this.s = s;
        this.length = s.getBytes(Charset.forName("Shift_JIS")).length;
    }

    @Override
    protected void open() {
        printLine();
    }

    @Override
    protected void print() {
        Console.pl("|" + s + "|");
    }

    @Override
    protected void close() {
        printLine();
    }

    private void printLine() {
        Console.p("+");
        for (int i = 0; i < length; i++) Console.p("-");
        Console.pl("+");
    }
}
