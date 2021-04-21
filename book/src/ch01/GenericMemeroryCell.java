package ch01;

public class GenericMemeroryCell <Any>{
    public Any read(){return storeValue;}
    public void write(Any x){storeValue=x;}
    private Any storeValue;
}
