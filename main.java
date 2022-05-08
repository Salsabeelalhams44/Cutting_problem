import java.util.* ;
public class Program
{
    public static void main(String[] args) {
        
 Scanner input = new Scanner (System.in);
 int n = input.nextInt() ;
 int b = input.nextInt() ;
 int a []  = new int [100];
 for (int i=0; i<n; i++) {
     a[i]= input.nextInt() ;
 }
 
 int even=0, odd=0;
 ArrayList <Integer> arr = new    ArrayList<Integer>();
 for(int i =0; i<n; i++){
     if( i!=0 && even ==odd){
         arr.add(Math.abs(a[i]- a[i-1]));
     }
     if(a[i]%2==0){
         even++;
     }else{
         odd++;
     }
     
 }
 Collections.sort(arr);
 int solution =0;
 int result []  = new int [arr.size()];
 for(int i=0;i<arr.size();i++){
     result [i]=arr.get(i);
 }
 for(int i =0; i<result.length; i++){
   if(b>=result[i]){
       solution++;
       b-=result[i];
   }
 }
 System.out.println(solution);
        
    }
}
