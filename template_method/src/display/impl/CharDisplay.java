package display.impl;

import display.AbstractDisplay;
import display.Console;

public class CharDisplay extends AbstractDisplay {

    /** 表示すべき文字 */
    private final char c;

    public CharDisplay(final char c) {
        this.c = c;
    }

    @Override
    protected void open() {
        Console.p("<<");
    }

    @Override
    protected void print() {
        Console.p(c);
    }

    @Override
    protected void close() {
        Console.pl(">>");
    }
}
