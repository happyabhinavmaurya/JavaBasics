public class Main {

    static void printf(String string) {
        System.out.println(string);
    }

    public static void main(String[] args) {
        String[] arr1 = {"Abhinav", "Maurya", "Arpit", "February"};
        int maxLength = 0;
        for (int i = 0; i <= arr1.length - 2; i++) {
            maxLength = Math.max(arr1[i + 1].length(), arr1[i].length());
        }

        System.out.println(maxLength);

    }

}