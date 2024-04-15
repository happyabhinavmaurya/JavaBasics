package Loops;

public class ForEachLoop {

    /*

    for (type variableName : arrayName) {
        // code block to be executed
    }

     */

    public static void main(String[] args) {

        int[] Arr1 = {1, 2, 6, 4, 8, 9, 7};
        loops.forEachOneLine(Arr1);

        String[] Arr2 = {"Abhinav", "Maurya"};
        loops.forEachOneLine(Arr2);

        String[][] Arr3 = {
                {"Abhinav", "Maurya"},
                {"Arpit", "Maurya"}
        };
        loops.forEachOneLine(Arr3);


    }
}
