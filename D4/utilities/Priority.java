package D4.utilities;

public enum Priority {
    LOW(1), MEDIUM(2), HIGH(3);
    public final int val;
    Priority(int i) {
        this.val = i;
    }
    public void disp() {
        System.out.println(val);
    }
}
