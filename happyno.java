public class happyno {
    public static void main(String[] args) {
        int n = 19;
        int temp = n;

        while (temp != 1 && temp != 4) {
            int sum = 0;

            while (temp > 0) {
                int digit = temp % 10;
                sum = sum + (digit * digit);
                temp = temp / 10;
            }

            temp = sum;
        }

        if (temp == 1) {
            System.out.println("Happy number");
        } else {
            System.out.println("Not a happy number");
        }
    }
}