public class CheckPrimeNum {
    public static void main(String[] args) {

        int n = 100;
        boolean[] numList = new boolean[n];

        for (int i = 0; i < numList.length; i++) {
            numList[i] = true;
        }

        for (int i = 2; i <= Math.sqrt(numList.length); i++) {
            if (numList[i - 1] == true) {
                for (int j = i * i; j <= numList.length; j += i) {
                    if (numList[j - 1]) {
                        numList[j - 1] = false;
                        // System.out.println(j + "," + numList[j - 1]);
                    }
                }
            }
        }

        System.out.println("質數：");
        for (int i = 0; i < numList.length; i++) {
            if (numList[i]) {
                System.out.printf("%d ", i + 1);
            }
        }

        System.out.println("\n");
        System.out.println("非質數：");
        for (int i = 0; i < numList.length; i++) {
            if (!numList[i]) {
                System.out.printf("%d ", i + 1);
            }
        }

    }
}
