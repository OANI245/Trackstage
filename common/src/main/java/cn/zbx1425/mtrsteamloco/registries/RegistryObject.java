package cn.zbx1425.mtrsteamloco.registries;

public class RegistryObject<T> {
    private final T val;

    public RegistryObject(T val) {
        this.val = val;
    }

    public T get() {
        return val;
    }
}
