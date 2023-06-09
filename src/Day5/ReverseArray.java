package Day5;

public class ReverseArray {

        public static void main(String[] args){
            int a[] = new int[]{2,3,4,5,6};
            int n = a.length;

            for(int i=n-1;i>=0;i--)
            {
                System.out.println(a[i]);
            }


        }
    }

