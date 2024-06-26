package Basics.Final.v0;

public class FinalClass {
    final int key = 10;
    final int value; // requires a constructor with parameter (mandatory)

    // Default constructor is also not allowed as one of the value which is final has not been initialized
    // Any constructor defined here hence must contain value as arg and that should also set the value
    public FinalClass(int value) {
        this.value = value;
    }

    public FinalClass(int key, int value) {
//        this.key = key; // not allowed when instance variable is final
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public int getValue() {
        return value;
    }
}
