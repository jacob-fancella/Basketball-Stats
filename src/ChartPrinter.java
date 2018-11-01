//Jacob Fancella
public class ChartPrinter {
    public void print(int t){
        String chart = "";
        for(int x = t; x >= 1; x--){
                 chart = chart + "*";
         }
        System.out.println(chart);
    }
}
