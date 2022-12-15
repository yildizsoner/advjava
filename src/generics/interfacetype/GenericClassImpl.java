package generics.interfacetype;

// eger bir "generic interface" implement ederseniz Class'da generic olmalidir.
public class GenericClassImpl <T> implements GenericInterface<T>  {


    @Override
    public void setValue(T t) {

    }

    @Override
    public T getValue() {
        return null;
    }
}
