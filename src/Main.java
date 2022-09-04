public class Main {
    public static void main(String[] args) {
        int values[] = {-3,2,5,4,7};
        boolean result = true;
        for (int n = 1; n>5;) {
            if (result == true && n < 5) {
                if (values[n] < values[n - 1]) {
                    result = false;
                    n++;
                }
                else
                    n++;
            }
            else {
                System.out.println(result);
                break;
            }
        }
    }
}