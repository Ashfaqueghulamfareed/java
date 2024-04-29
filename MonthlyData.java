public class MonthlyData {
    public static void main(String[] args) {

        

 
        System.out.println("Monthly Data:");
        for (int i = 0; i < monthlyData.length; i++) {
            String month = getMonthName(i);
            System.out.print(month + ": ");
            for (int j = 0; j < monthlyData[i].length; j++) {
                System.out.print(monthlyData[i][j] + " ");
            }
            System.out.println();
        }
    }

    