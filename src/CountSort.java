import java.util.*;

        class Solution
        {
            public void sort(Integer[] array)// then press Enter. You can now see whitespace characters in your code.

            {

                int n=Collections.max(Arrays.asList(array));
                int[] countarray=new int[n+1];
                for(int i=0;i<array.length;i++)
                {
                    countarray[array[i]]++;
                }
                for(int i=1;i<countarray.length;i++)
                {
                    countarray[i]=countarray[i]+countarray[i-1];
                }
                int[] sorted=new int[array.length+1];
                for(int i=array.length-1;i>=0;i--)
                {
                    int temp=array[i];
                    int index=countarray[temp];
                    sorted[index]=temp;
                    countarray[temp]=index-1;
                }
                for(int i=1;i<sorted.length;i++)
                {
                    System.out.print(sorted[i]+" ");
                }
            }

        }

        class CountSort
        {
            public static void main(String args[])
            {
                Scanner scanner=new Scanner(System.in);
                int n=scanner.nextInt();
                Integer[] array=new Integer[n];
                for(int i=0;i<n;i++)
                {
                    array[i]=scanner.nextInt();
                }
                Solution solution =new Solution();
                solution.sort(array);
            }
        }