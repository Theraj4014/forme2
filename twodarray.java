import java.util.*;
public class twodarray {
    public static void main(Strings[] args) {
    int[][] ar1={{1,2,3},{4,5,6}};
    //array name[row_index ][column_index]=value;
    ar1[0][0]=1;
    for(int i=0;i<1;i++)
    {
        for(int j=0;j<=2;j++)
        {
            System.out.println(ar1[i][j]);
        }
    }
    //creating array without values
    
    //creating array without values 
    int[][] ar2 = new int [2][3];
    System.out.println("inserting values in array ");
    Scanner s=new Scanner(System.in);
    for(int i=0;i<=1;i++)
    {
        for(int j=0;j<=2;j++)
        {
            System.out.println("enter element"+i+" "+j);
            ar2[i][j]=s.nextInt();
        }
    }   
    System.out.println("printing array");
    for(int i=0;i<=1;i++)
    {
        for(int j=0;j<=2;j++)
        {
            System.out.println(ar2[i][j]);
        }
    } 
}
}
  
