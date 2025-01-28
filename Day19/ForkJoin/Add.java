package ForkJoin;

import java.util.concurrent.RecursiveTask;

public class Add extends RecursiveTask<Long> {
    public static final long THRESHOLD = 10000;
    private final int s;
    private final int e;
    public Add(int s, int e) {
        this.s = s;
        this.e = e;
    }

    @Override
    protected Long compute() {
        if (e - s <= THRESHOLD) {
            long sum = 0;
            for (int i = s; i <= e; i++) {
                sum += i;
            }
            return sum;
        } else {
            int middlenum = (s + e) / 2;
            Add leftsub = new Add(s, middlenum);
            Add rightsub = new Add(middlenum + 1, e);
            leftsub.fork();
            long rightres = rightsub.compute();
            long leftres = leftsub.compute();
            return leftres + rightres;
        }
    }
}
