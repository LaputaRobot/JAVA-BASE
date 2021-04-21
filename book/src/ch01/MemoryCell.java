package ch01;

public class MemoryCell {
    public Object read(){return storeValue;}
    public void write(Object x){storeValue=x;}
    private Object storeValue;
}
