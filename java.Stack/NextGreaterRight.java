import java.util.Stack;
public class NextGreaterRight {
public static void main(String[] args) {
        int arr[] = {6,8,0,1,3}; // {8,3,6,7,1,2,9} => 9 6 7 9 2 9 -1 
        Stack<Integer> s = new Stack<>(); 
        int NextGreater[] = new int[arr.length];
        for(int i = arr.length - 1; i>=0; i--){
            // 1. While
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }
            //2. if-else
            if(s.isEmpty()){
                NextGreater[i] = -1;
            }
            else{
                NextGreater[i] = arr[s.peek()];
            }
             // 3. Push in S
             s.push(i);
          
        }
         
            for(int i = 0 ; i<NextGreater.length; i++){
                System.out.print(NextGreater[i] + " ");
            }
            System.out.println();

            // Next Greater Right
            // Next Greater Left
            // Next Smaller Right
            // Next Smaller Left

    }
}