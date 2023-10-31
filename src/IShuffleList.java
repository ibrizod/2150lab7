import java.util.List;
import java.util.Random;

public interface IShuffleList<T> extends List<T> {

    Random rand = new Random();
    int rand_num = rand.nextInt(100);

    /**
     * Shuffles the positions of elements in the list by swapping random pairs.
     *
     * @param swaps The number of times two positions should be swapped.
     *
     * @pre swaps > 0
     * @post The positions of list elements are randomized by performing 'swaps' number of random swaps.
     */
    default void shuffle(int swaps) {
        Random rand = new Random();
        for (int k = 0; k < swaps; k++) {
            int i = rand.nextInt(); // Assuming list size is not provided, this will need adjustment
            int j = rand.nextInt(); // Assuming list size is not provided, this will need adjustment
            swap(i, j);
        }
    }

    /**
     * Swaps the values at positions i and j in the list.
     *
     * @param i The index of the first element.
     * @param j The index of the second element.
     *
     * @pre 0 <= i < list.size() AND 0 <= j < list.size() (Assuming a list is associated with this interface)
     * @post The values at positions i and j in the list have been exchanged.
     */
    default void swap(int i, int j) {
         Object temp = list.get(i);

         list.set(i, list.get(j));
         list.set(j, temp);
    }

}
