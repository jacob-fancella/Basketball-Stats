//Jacob Fancella

import java.io.*;
import java.util.ArrayList;

public class FileRW {

    private File file = new File("data.txt");
    ArrayList[][] temp = new ArrayList[1][4];

    public void Add(String[] a) throws IOException {// <editor-fold defaultstate="collapsed" desc=" Add to File ">
        temp = Get();
        BufferedWriter out = new BufferedWriter(new FileWriter(file));
        temp[0][0].add(a[0]);
        temp[0][1].add(a[1]);
        temp[0][2].add(a[2]);
        temp[0][3].add(a[3]);
        for (int x = 0; x < temp[0][0].size(); x++) {
            for (int y = 0; y < temp[0].length; y++) {
                out.write((String) temp[0][y].get(x));
                out.newLine();
            }
        }
        out.close();
    }
    // </editor-fold>
    public ArrayList[][] Get() throws IOException {// <editor-fold defaultstate="collapsed" desc=" Get from File ">
        for (int x = 0; x < 4; x++) {
            temp[0][x] = new ArrayList();
        }
        BufferedReader in = new BufferedReader(new FileReader(file));
        String test = "";
        for (int x = 0; x != -1; x++) {
            for (int y = 0; y < 4; y++) {
                test = in.readLine();
                if (test == null) {
                    x = -2;
                } else {
                    temp[0][y].add(x, test);
                }
            }
        }
        in.close();
        return temp;
    }
    // </editor-fold>
    public void Rewrite(ArrayList[][] a) throws IOException {// <editor-fold defaultstate="collapsed" desc=" Rewrite File ">
        temp = a;
        BufferedWriter out = new BufferedWriter(new FileWriter(file));
        for (int x = 0; x < temp[0][0].size(); x++) {
            for (int y = 0; y < temp[0].length; y++) {
                out.write((String) temp[0][y].get(x));
                out.newLine();
            }
        }
        out.close();
    }
    // </editor-fold>
}
