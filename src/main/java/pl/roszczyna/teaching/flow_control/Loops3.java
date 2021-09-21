package pl.roszczyna.teaching.flow_control;

import java.util.ArrayList;
import java.util.List;

/**
 * Using any loop your heart desires return a list of numbers which divide the passed in number without a remainder.
 * Note: To calculate the remainder of the division use the modulo division operator: %. Eg. a % 6 = 0 means that a can be 0, 6, 12, and so on.
 * <p>
 * 1, 2, 3, 4, 5, 6
 */
public class Loops3 {

    public List<Integer> findDivisors(int number) {
        var result = new ArrayList<Integer>();
        // Your code goes here
        int currentDivisor = 1;
        int halfNumber = number / 2;
        while (currentDivisor <= number) {
            if (number % currentDivisor == 0)
                result.add(currentDivisor);
            currentDivisor++;
        }
        return result;
    }

}
