import java.util.ArrayList;
import java.util.Arrays;

/**
 * Learn the difference between call by value and call by reference
 */
public class Parameters
{
    
    // Instance variables are initialized in the initialize method below
    int i;                          // Default 10
    String s;                       // Default "Mr. Jaffe"
    int[] arr;                      // Default 0,1,2,3,4,5,6,7,8,9
    ArrayList<Integer> arrayList1;  // Default 0,1,2,3,4,5
    ArrayList<Integer> arrayList2;  // Default 10,11,12,13,14,15
    
    /**
     * Method to demonstrate calling parameters by value and by reference
     */
    public void master() {
        initialize();
        
        System.out.println("*** BEFORE FUNCTION CALL ***");
        toString(i, s, arr, arrayList1, arrayList2);
        
        function(i, s, arr, arrayList1, arrayList2);
        
        System.out.println("*** AFTER FUNCTION CALL ***");
        toString(i, s, arr, arrayList1, arrayList2);
    }
    
    /**
     * master calls this function to demonstrate calling parameters
     * by value and by reference
     */
    public void function(int iM,
                         String sM,
                         int[] arrM,
                         ArrayList arrayListM1,
                         ArrayList arrayListM2 ) {
        System.out.println("*** INSIDE FUNCTION -- BEFORE CHANGES ***");
        toString(iM, sM, arrM, arrayListM1, arrayListM2);
        
        iM = 25;
        sM = "ABCDEF";
        arrM[2] = 100;
        arrayListM1.set(1, 250);
        arrayListM2 = new ArrayList<>();
        arrayListM2.add(100);
        arrayListM2.add(101);
        arrayListM2.add(102);
        arrayListM2.add(103);
        
        System.out.println("*** INSIDE FUNCTION -- AFTER CHANGES ***");
        toString(iM, sM, arrM, arrayListM1, arrayListM2);
    }
    
    /**
     * These are helper functions for the demonstrations
     */
    public void toString(int i,
                         String s,
                         int[] arr,
                         ArrayList arrayList1,
                         ArrayList arrayList2 ) {
        System.out.println("i="+i);
        System.out.println("s="+s);
        System.out.println("arr="+Arrays.toString(arr));
        System.out.println("arrayList1="+arrayList1.toString());
        System.out.println("arrayList2="+arrayList2.toString());
        System.out.println();
    }
    
    public void initialize() {
      i = 10;
      s = "Mr. Jaffe";
      arr = new int[]{0, 1, 2, 3, 4, 5};
      arrayList1 = new ArrayList();
      arrayList1.add(0);
      arrayList1.add(1);
      arrayList1.add(2);
      arrayList1.add(3);
      arrayList1.add(4);
      arrayList1.add(5);
      arrayList2 = new ArrayList();
      arrayList2.add(10);
      arrayList2.add(11);
      arrayList2.add(12);
      arrayList2.add(13);
      arrayList2.add(14);
      arrayList2.add(15);
    }
}
