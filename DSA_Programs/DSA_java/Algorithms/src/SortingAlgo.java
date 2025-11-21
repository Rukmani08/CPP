class SortingAlgo {

    void optimized_bubble_sort(int a[]) {
        boolean done = true;
        for (int i = a.length - 1; i > 0; i--)//limit passes
        {
            done = true;
            for (int j = 0; j < i; j++)//j stops at second last
            {
                if (a[j] > a[j + 1]) {
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                    done = false;
                }
            }
            if (done == true)
                break;
        }

    }
//
//
//
//
//
//

    void selection_sort(int a[]) {
        int min, pos;
        for (int i = 0; i < a.length - 1; i++) {
            min = a[i];
            pos = i;//reference
            for (int j = i + 1; j < a.length; j++)//j stops at second last
            {
                if (a[j] < min) {//update
                    min = a[j];
                    pos = j;
                }
            }
            //swap
            a[pos] = a[i];
            a[i] = min;
        }
    }
//

void insertion_sort(int a[])
{
    int element;
    for(int i=0;i<a.length-1;i++)
    {
        element=a[i+1];
       int  j=i+1;
        while(j>0 && a[j-1]>element)
        {	//move back
            a[j]=a[j-1];
            j--;//move ahead
        }
        //insert
        a[j]=element;
    }
}

//
//


  static  void print(int a[]) {
        for (int i : a) {
            System.out.println(i);
        }
    }

    public void main(String[] args) {
        int a[] = {50, 10, 20, 30, 40};
        System.out.println("Before bubble sort");


        //or


        optimized_bubble_sort(a);
        System.out.println("After bubble sort");
        SortingAlgo.print(a);


        selection_sort(a);
        System.out.println("After selection_sort");
        SortingAlgo.print(a);



    }

}

