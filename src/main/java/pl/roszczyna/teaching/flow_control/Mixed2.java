package pl.roszczyna.teaching.flow_control;

import java.util.List;

/**
 * You need to find the SECOND-smallest number in the list
 */
public class Mixed2 {

    public int findSecondSmallest(List<Integer> numbers) {
        if(numbers.size() < 2) throw new IllegalArgumentException();
        //Your code
        return numbers.get(0);
        // Ends here
    }

}
