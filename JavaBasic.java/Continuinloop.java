public class Continuinloop {
    public static void main(String[] args) {
        // for (int num = 1; num <= 50; num++) {
        //     if (num % 3 == 0) {
        //         continue; // Skip numbers divisible by 10
        //     }
        //     System.out.println(num);
        // }

        int num = 1;
        while (num <= 50){
            if(num % 2 == 0){
                num++;
                continue;
            }
            System.out.println(num);
            num++;
        }
    }
}

