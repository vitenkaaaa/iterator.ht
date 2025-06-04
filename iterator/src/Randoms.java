import java.util.*;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    private List list = new ArrayList();

    public Randoms(int min, int max) {
        Random random = new Random();
        int i = 0;
        int numd = 0;
        int rand = random.nextInt(max + 1);
        if (rand < min) {
            rand = min;
        }
//        while (i < 10) {
//            numd = random.nextInt();
//            list.add(numd);
//            i++;
//        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            int next = 0;

            @Override
            public boolean hasNext() {
                if (next < list.size()) {
                    return true;
                } else {
                    return false;
                }
            }

            @Override
            public Integer next() {
                if (next < list.size()) {
                    int number = (int) list.get(next);
                    next++;
                    return number;
                }
                return 0;
            }
        };

    }
}



