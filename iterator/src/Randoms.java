import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;

    public  Randoms(int min, int max) {
        Random random = new Random();
        int rand = random.nextInt(max + 1);
        if (rand < min){
            rand = min;
        }


    }


    @Override
    public Iterator<Integer> iterator() {
        return null;
    }
}



