//You are a person in an island. There is only one shop in this island, this shop is open on all days of the week
//        except for Sunday. Consider following constraint
//        S – Number of days you are required to survive{
//        N – Maximum unit of food you can buy each day{
//        M – Unit of food required each day to survive.
//        Currently, it’s Monday, and you need to survive for the next S days.

//        Find the minimum number of days on which you need to buy food from the shop so that you can survive the
//        next S days, or determine that it isn’t possible to survive.
//
//        Input:
//        S = 10 N = 16 M = 2
//        Output: Yes
//        Minimum days to buy food 7

public class Q4 {
    public static void main(String[] args) {
        int S = 10; // No. of days
        int N = 16; // Mon-Sat Buy
        int M = 2;  // Har din consume(Sunday ko khana ni milega)

        int totalFoodRequired = S*M;
        int result;
        String flag = "no";

        // 1 week consumption > 1 week buy
        if(M > N || (7*M > 6*N)){ // khana khana Hai / khana kharid sakta hu
            result = -1;
        } else{
            result = (int)Math.ceil((double)totalFoodRequired / N); // divide krne se double aara hai usme bad hum use int me type cast kiye hai
            flag = "yes"; // floor(Lower no. round off) ceil(upper no. me round off)    Day adha ni ho skta krke roundoff kiye hai
            // 9 - 9.9 - 10
        }

        System.out.println(flag + ", you can survive for "+S+" days");
        System.out.println("Minimum days to buy food: "+result);
    }
}
