//Jacob Fancella
//This code is based off David's version due to mine being rather buggy
import java.io.IOException;
import java.util.ArrayList;

public class Sorter {
    public void Alphabetical() throws IOException{// <editor-fold defaultstate="collapsed" desc=" Alphabetical Sorter ">
        FileRW rw = new FileRW();
        String c1;
        String c2;
        char t1;
        char t2;
        String tS;
        ArrayList[][] tList = new ArrayList[1][4];
        tList = rw.Get();
        for (int i = 0; i < tList[0][0].size() + tList[0][0].size() / 2; i++) {
            for (int x = 0; x < tList[0][0].size() - 1; x++) {
                t1 = (c1 = (String) tList[0][0].get(x)).charAt(0);
                t2 = (c2 = (String) tList[0][0].get(x + 1)).charAt(0);
                if (t1 > t2) {
                    for (int y = 0; y < 4; y++) {
                        tS = (String) tList[0][y].get(x);
                        tList[0][y].set(x, tList[0][y].get(x + 1));
                        tList[0][y].set(x + 1, tS);
                    }
                }
            }
        }
        rw.Rewrite(tList);
    }
    // </editor-fold>
    
    public void Baskets() throws IOException{// <editor-fold defaultstate="collapsed" desc=" Baskets Sorter ">
        FileRW rw = new FileRW();
        int c1;
        int c2;
        String tS;
        ArrayList[][] tList = new ArrayList[1][4];
        tList = rw.Get();
        for (int i = 0; i < tList[0][0].size() + tList[0][0].size() / 2; i++) {
            for (int x = 0; x < tList[0][0].size() - 1; x++) {
                c1 = Integer.parseInt((String) tList[0][1].get(x));
                c2 = Integer.parseInt((String) tList[0][1].get(x + 1));
                if (c1 < c2) {
                    for (int y = 0; y < 4; y++) {
                        tS = (String) tList[0][y].get(x);
                        tList[0][y].set(x, tList[0][y].get(x + 1));
                        tList[0][y].set(x + 1, tS);
                    }
                }
            }
        }
        rw.Rewrite(tList);
    }
    // </editor-fold>
    
    public void FowlShots() throws IOException{// <editor-fold defaultstate="collapsed" desc=" FowlShots Sorter ">
        FileRW rw = new FileRW();
        int c1;
        int c2;
        String tS;
        ArrayList[][] tList = new ArrayList[1][4];
        tList = rw.Get();

        for (int i = 0; i < tList[0][0].size() + tList[0][0].size() / 2; i++) {
            for (int x = 0; x < tList[0][0].size() - 1; x++) {
                c1 = Integer.parseInt((String) tList[0][2].get(x));
                c2 = Integer.parseInt((String) tList[0][2].get(x + 1));
                if (c1 < c2) {
                    for (int y = 0; y < 4; y++) {
                        tS = (String) tList[0][y].get(x);
                        tList[0][y].set(x, tList[0][y].get(x + 1));
                        tList[0][y].set(x + 1, tS);
                    }
                }
            }
        }
        rw.Rewrite(tList);
    }
    // </editor-fold>
    
    public void TotalPoints() throws IOException {// <editor-fold defaultstate="collapsed" desc=" TotalPoints Sorter ">
        FileRW rw = new FileRW();
        int c1;
        int c2;
        String tS;
        ArrayList[][] tList = new ArrayList[1][4];
        tList = rw.Get();
        for (int i = 0; i < tList[0][0].size() + tList[0][0].size() / 2; i++) {
            for (int x = 0; x < tList[0][0].size() - 1; x++) {
                c1 = Integer.parseInt((String) tList[0][3].get(x));
                c2 = Integer.parseInt((String) tList[0][3].get(x + 1));
                if (c1 < c2) {
                    for (int y = 0; y < 4; y++) {
                        tS = (String) tList[0][y].get(x);
                        tList[0][y].set(x, tList[0][y].get(x + 1));
                        tList[0][y].set(x + 1, tS);
                    }
                }
            }
        }
        rw.Rewrite(tList);
    }
    // </editor-fold>
}
