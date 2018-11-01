//Jacob Fancella
//Basket Ball Stats Reporter
import java.io.IOException;
import java.util.*;

public class BasketballStats {
    public static void main(String[] args) throws IOException {
        Scanner k = new Scanner(System.in);
        Sorter sort = new Sorter();
        FileRW rw = new FileRW();
        ChartPrinter c = new ChartPrinter();
        ArrayList[][] team = new ArrayList[1][4];
        for (int x = 0; x < 4; x++) {
            team[0][x] = new ArrayList();
        }
        String[] temp = new String[4];
        String in = "";
        while (!in.equalsIgnoreCase("exit")) {
            System.out.println("To add a player enter \"Add\"");
            System.out.println("To sort and list team enter \"List\"");
            System.out.println("To quit enter \"Exit\"");
            in = k.next();
            if (in.equalsIgnoreCase("Add")) {
                in = "yes";

                System.out.print("Enter players name:");
                temp[0] = k.next();
                System.out.print("\nEnter # of Baskets:");
                temp[1] = k.next();
                System.out.print("\nEnter # of Foul Shots");
                temp[2] = k.next();
                int totalPoints = Integer.parseInt(temp[1]) + (Integer.parseInt(temp[2]) * 3);
                temp[3] = Integer.toString(totalPoints);
                rw.Add(temp);
                System.out.println("Total points: " + totalPoints);
                
            } else if (in.equalsIgnoreCase("list")) {
                System.out.println("How would you like the team sorted?");
                System.out.println("Alphbetical enter \"A\"");
                System.out.println("Baskets enter \"B\"");
                System.out.println("Foulshots enter \"F\"");
                System.out.println("Total Points \"T\"");
                in = k.next();
                if (in.equalsIgnoreCase("A")){       // <editor-fold defaultstate="collapsed" desc=" Sort Alphabetical ">



                    sort.Alphabetical();

                    team = rw.Get();
                    for (int x = 0; x < team[0][0].size(); x++) {
                        for (int y = 0; y < team[0].length; y++) {
                            System.out.println(team[0][y].get(x));
                            String t = (String) ((team[0][y + 3]).get(x));
                            int points = (Integer.parseInt(t));
                            c.print(points);
                            y += 4;

                        }
                    }
                    // </editor-fold>
                } else if (in.equalsIgnoreCase("B")){// <editor-fold defaultstate="collapsed" desc=" Sort by Baskets ">
                    sort.Baskets();
                    team = rw.Get();
                    for (int x = 0; x < team[0][0].size(); x++) {
                        for (int y = 0; y < team[0].length; y++) {
                            System.out.println(team[0][y].get(x));
                            String t = (String) ((team[0][y + 3]).get(x));
                            int points = (Integer.parseInt(t));
                            c.print(points);
                            y += 4;

                        }
                    }
                    // </editor-fold>
                } else if (in.equalsIgnoreCase("F")){// <editor-fold defaultstate="collapsed" desc=" Sort by Foul Shots ">
                    sort.FowlShots();
                    team = rw.Get();
                    for (int x = 0; x < team[0][0].size(); x++) {
                        for (int y = 0; y < team[0].length; y++) {
                            System.out.println(team[0][y].get(x));
                            String t = (String) ((team[0][y + 3]).get(x));
                            int points = (Integer.parseInt(t));
                            c.print(points);
                            y += 4;

                        }
                    }
                    // </editor-fold>
                } else if (in.equalsIgnoreCase("T")){// <editor-fold defaultstate="collapsed" desc=" Sort by Total Points ">
                    sort.TotalPoints();
                    team = rw.Get();
                    for (int x = 0; x < team[0][0].size(); x++) {
                        for (int y = 0; y < team[0].length; y++) {
                            System.out.println(team[0][y].get(x));
                            String t = (String) ((team[0][y + 3]).get(x));
                            int points = (Integer.parseInt(t));
                            c.print(points);
                            y += 4;

                        }
                    }
                }
                // </editor-fold>
            }
        }
    }
}
