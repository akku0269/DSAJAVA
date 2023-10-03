
// Fractional Knapsack
//Q. Given the heights and profits of N items, in the form of {profit,height} put these items in a knapsack of
//        capacity W to get the maximum total profit in the knapsack. In fractional Knapsack, we can break items for
//        maximizing the total value of the knapsack.


import java.util.*;


public class fractionalKnapsackQ1 {

    private static class Item{
        Integer value;
        Integer weight;
        public String toString(){
            return value+" "+weight;
        }
    }

    private static class ItemComparator implements Comparator<Item>{
        @Override
        public int compare(Item i1, Item i2) {
            if((i1.value/i1.weight) < (i2.value/i2.weight))
                return 1;
            else if ((i1.value / i1.weight) > (i2.value / i2.weight))
                return -1;
            else
                return 0;
        }
    }
    public static void main(String[] args) {
        List<Integer> value = List.of(60, 100, 150, 120);
        List<Integer> weights = List.of(10, 20, 50, 15);
        List<Item> itemsList = new ArrayList<>();
        for(int i=0; i<value.size(); i++){
            Item item = new Item();
            item.value = value.get(i);
            item.weight = weights.get(i);
            itemsList.add(item);
        }
        itemsList.sort(new ItemComparator());
        System.out.println(itemsList);
        int W = 30;
        int profit = 0;

            for(int i=0; i<itemsList.size() && W > 0; i++){
                Item item = itemsList.get(i);
                if(item.weight <= W){
                    profit += item.value;  // profit me item ki value dal ni
                    W -= item.weight;  // weight minus kr diya W se
                }else{
                    profit += (item.value)/(item.weight) * W;
                    W = 0;
                }
            }
        System.out.println(profit);
    }
}
