/*   Created by IntelliJ IDEA.
 *   Author: Naman Seth (namaseth01)
 *   Date: 09/12/21
 *   Time: 9:24 PM
 *   File: FractionalKnapsack.java
 */

package GreedyApproach.FractionalKnapsack;

public class FractionalKnapsack {

    class ItemValue {
        Double cost;
        double wt, val, ind;

        // item value function
        public ItemValue(int wt, int val, int ind)
        {
            this.wt = wt;
            this.val = val;
            this.ind = ind;
            cost = (double) val / (double) wt;
        }
    }
}
