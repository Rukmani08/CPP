public class BuynSell {
   static void Sellnbuy( int arr[]){
        int buy_day=0;
        int sell_day=0;
        int max_profit=0;

        for(int i=0;i<arr.length-1;i++){  //buy
            for(int j= arr.length-1;j>i;j--){     //sell
                int profit=arr[j]-arr[i];
                if(profit>max_profit){
                    max_profit=profit;
                    buy_day=i;
                    sell_day=j;
                }
            }
        }
        System.out.println(" max profit "+max_profit+" Buy on "+buy_day+" sell on "+sell_day);

    }
    public static  void main(String[] args){
      int arr[]={100, 180, 260, 310 ,40, 535, 695, 30 ,50, 70 ,20 ,40, 60, 90 ,10};


      Sellnbuy( arr);

    }
}
