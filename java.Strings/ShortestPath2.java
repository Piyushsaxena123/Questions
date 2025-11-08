public class ShortestPath2 {
    public static float Shortestpath(String Path){
        int x = 0; 
        int y = 0;

        for(int i = 0; i < Path.length(); i++){
            char dir = Path.charAt(i);  // Corrected here
            if(dir == 'S'){
                y--; // south
            }
            else if(dir == 'W'){
                x--; // West
            }
            else if(dir == 'N'){
                y++; // North
            }
            else{
                x++; // East
            }
        }

        int X2 = x * x;
        int Y2 = y * y;
        return (float)Math.sqrt(X2 + Y2); // By default sqrt is a double type so we can type cast it to float.
    }

    public static void main(String[] args) {
        String Path = "WNEENESNNN";
        System.out.println(Shortestpath(Path));
    }
}
