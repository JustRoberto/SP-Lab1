import jdk.jshell.spi.ExecutionControl;

public class Table extends Element {
    public String something;
    public Table(String s) {
        this.something=s;
    }

    @Override
    public void add(Element element) {
        //nimic
    }

    @Override
    public void get(int id) {
        //nimic
    }

    @Override
    public void remove(Element element) {
        //nimic
    }
    @Override
    public void print()
    {
        System.out.println(something);
    }
}
