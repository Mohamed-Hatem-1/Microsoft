package Micro;


import Excel.V2010;
import Word.V2023;

public class Main {
    public static void Start(Micro m) {
        m.start();
    }
    public static void Exit(Micro m) {
        m.exit();
    }
    public static void main(String[] args) {
        V2010 v2010Excel = new V2010();
        V2023 v2023Word = new V2023();

        // Another way than importing

        PowerPoint.V2010 v2010PowerPoint = new PowerPoint.V2010();
        Excel.V2010 v2010Excel1 = new Excel.V2010();


        v2010PowerPoint.help();

        Start(v2010Excel);
        Start(v2010PowerPoint);
    }
}