package oops.LibraryManagementSystem;

public class TablePrinter {
    public static class printTable {
        String[][] table;

        public printTable(String[][] table) {
            this.table = table;
        }

        public static int[] getColumnWidths(String[][] tableData) {
            int columns = tableData[0].length;
            int[] columnWidths = new int[columns];

            for (String[] row : tableData) {
                for (int i = 0; i < columns; i++) {
                    columnWidths[i] = Math.max(columnWidths[i], row[i].length());
                }
            }

            return columnWidths;
        }

        private static void printSeparatorLine(int[] columnWidths) {
            for (int width : columnWidths) {
                System.out.print("+");
                for (int i = 0; i < width + 2; i++) {
                    System.out.print("-");
                }
            }
            System.out.println("+");
        }

        private static void printRow(String[] rowData, int[] columnWidths) {
            for (int i = 0; i < rowData.length; i++) {
                System.out.printf("%-" + (columnWidths[i] + 2) + "s", rowData[i]);
            }
            System.out.println();
        }

        public void getTable() {
            // Find the maximum width of each column
            int[] columnWidths = getColumnWidths(table);

            // Print table headers
            printRow(table[0], columnWidths);

            // Print separator line
            printSeparatorLine(columnWidths);

            // Print table data
            for (int i = 1; i < table.length; i++) {
                printRow(table[i], columnWidths);
            }
        }
    }

}
