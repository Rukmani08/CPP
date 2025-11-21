public class BinarynSequentialSearch {

//Sqquential


    static int sequential_search(int a[], int key) {
        for (int i = 0; i < a.length; i++) {
            if (key == a[i])
                return i;//found
        }
        return -1;//not found
    }


}


//Binary
    static    int binary_search(int a[],int start,int end,int key)
    {

        int mid=(start+end)/2;
        if(start<end){
            if(a[mid]==key){
                return mid;
            }else{
                if(key<mid){
                    binary_search( a, start, mid-1, key) ;
                }else{
                    binary_search( a, mid+1, end, key) ;
                }

            }
        }
            return -1;


    }

    static void print(int a[]){

        for(int i:a){
            System.out.println(i);
        }
    }

    static void main(String[] args) {
        int a[]={2,3, 8,4,63,3,76,8,4};
        int a1[]={ 1,4,8,9,34,67,90,110};

        int ans1=BinarynSequentialSearch.sequential_search( a,63);
        System.out.println(ans1);

        int ans2=binary_search( a1,0,a1.length, 67);
        System.out.println(ans2);



    }





