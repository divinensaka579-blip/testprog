//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    String[] cities = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};
            String[] consoles = {"PS5", "XBOX", "SWITCH"};
            int[][] sales = {{1000, 2000, 3000}, {2000, 3000, 4000}, {1500, 1100, 1200}};


            int[] totalSales = new int[3];

            int maxSales = 0;
            String cityWithMostSales = "";
            int maxIndex = 0;

            for (int i = 0; i < sales.length; i++) {
                int sum = 0;
                for (int j = 0; j < sales[i].length; j++) {
                    sum += sales[i][j];
                }
                totalSales[i] = sum;


                if (sum > maxSales) {
                    maxSales = sum;
                    cityWithMostSales = cities[i];
                    maxIndex = i;
                }
            }


            System.out.println("--------------------------------------------------------------------------------");
            System.out.println("GAMING CONSOLE REPORT");
            System.out.println("--------------------------------------------------------------------------------");
            System.out.printf("%-20s %-15s %-15s %-15s\n", "", consoles[0], consoles[1], consoles[2]);
            System.out.println();

            for (int i = 0; i < cities.length; i++) {
                System.out.printf("%-20s %-15d %-15d %-15d\n", cities[i], sales[i][0], sales[i][1], sales[i][2]);
            }

            System.out.println("--------------------------------------------------------------------------------");
            System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
            System.out.println("--------------------------------------------------------------------------------");

            for (int i = 0; i < cities.length; i++) {
                System.out.printf("%-20s %d\n", cities[i], totalSales[i]);
            }

            System.out.println();
            System.out.println("CITY WITH THE MOST SALES: " + cityWithMostSales);
            System.out.println("--------------------------------------------------------------------------------");
        }


