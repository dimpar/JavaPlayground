package designPatterns.Singleton;

//Best approach. Serializable, no reflection (100% guaranteed that only one instance is present withing JVM)
public enum SingletonEnum {
    INSTANCE;

    int value;

    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
}
