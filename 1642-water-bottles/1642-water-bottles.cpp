class Solution {
public:
    int numWaterBottles(int numBottles, int numExchange) {
        int res = numBottles;   // total bottles drunk
        int empty = numBottles; // current empty bottles

        while (empty >= numExchange) {
            int newBottles = empty / numExchange; // bottles we can get by exchange
            res += newBottles;
            empty = empty % numExchange + newBottles; // leftover + new empties
        }

        return res;
    }
};
