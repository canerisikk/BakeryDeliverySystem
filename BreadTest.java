import java.io.*;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class BreadTest {

    static int a;
    static Scanner K = new Scanner(System.in);
    static String filename = "orderingList.txt";

    public static void lala(Type p, Yeast y, Sliced z, String haha) throws IOException {
        BreadTest vava = new BreadTest();
        Inventory inventory = new Inventory();
        initializeInventory(inventory);
        Breadx whatCustomerLikes = new Breadx(p, y, z);
        List matchingBreads = inventory.search(whatCustomerLikes);
        if (!matchingBreads.isEmpty()) {
            System.out.println("Customer, we found your bread which you want details in the below:");
            for (Iterator i = matchingBreads.iterator(); i.hasNext(); ) {
                Bread bread = (Bread) i.next();
                Breadx x = bread.getx();
                System.out.println(x.getYeast() + " and it is " +
                        x.getSliced() +
                        ".\n  You can get it for only $" +
                        bread.getPrice() + "!\n  ----");
                String name, surname;
                System.out.println("Please enter your name");
                name = K.next();
                System.out.println("Please enter your surname");
                surname = K.next();
                order(name,surname,haha);
                File file = new File("orderingList.txt");
            }
        } else {
            System.out.println("Sorry Customer,we do not have bread which you want but you can search another breads on application.");
        }
    }
    public static void main(String[] args) throws IOException {
        while (true) {
            System.out.println("-----------Welcome to Eskisehir Bakery.-------------\n" +
                    "-----------Please enter one number for selecting bread type.-------------\n" +
                    "----------1-Menu of the breads-------\n" +
                    "----------2-Ordering bread---\n");
            a = K.nextInt();
            switch (a) {
                case 1:
                    System.out.println("----------MENU-------------\n" +
                            "You can order types of breads which different types in the below\n" +
                            "----------1-TrabzonBread------\n" +
                            "----------2-Multigrain_Bread---\n" +
                            "----------3-Rye_Bread,---\n" +
                            "----------4-Corn_Bread--------\n" +
                            "----------5-Wholemeal_Bread------\n" +
                            "----------6-Buckwheat_Bread-----------\n"
                            + "\t");
                    break;
                    case 2:
                    System.out.println("----------Ordering-------------\n" +
                            "----------1-TrabzonBread------\n" +
                            "----------2-Multigrain_Bread---\n" +
                            "----------3-Rye_Bread,---\n" +
                            "----------4-Corn_Bread--------\n" +
                            "----------5-Wholemeal_Bread------\n" +
                            "----------6-Buckwheat_Bread-----------\n"
                            + "\t");
                    a = K.nextInt();
                    switch (a) {
                        case 1:
                            System.out.println("-----------Choose the type of bread which you want-------------\n" +
                                    "-----------1-Trabzon Bread Including Yeast and Not Sliced------\n" +
                                    "----------2-Trabzon Bread  Including  Yeast and  Sliced---\n" +
                                    "----------3-Trabzon Bread Not Including Yeast and  Sliced---\n" +
                                    "----------4-Trabzon Bread Not Including Yeast and Not Sliced--------\n");
                            a = K.nextInt();
                            switch (a){
                                case 1:
                                    System.out.println("-----------Trabzon Bread Including Yeast and Not Sliced-------------\n");
                                    String str = "Trabzon Bread Including Yeast and not Sliced";
                                    lala(Type.TrabzonBread, Yeast.IncludingYeast, Sliced.notSliced,str);
                                    break;

                                case 2:
                                    System.out.println("-----------2-Trabzon Bread Including Yeast and Sliced-------------\n");
                                    String sztr = "Trabzon Bread Including Yeast and Sliced";
                                    lala(Type.TrabzonBread, Yeast.IncludingYeast, Sliced.Sliced,sztr);
                                    break;
                                    case 3:
                                    System.out.println("3-Trabzon Bread Not Including Yeast and  Sliced---\\n\"\n");
                                    String sstr = "Trabzon Bread Not Including Yeast and Sliced";
                                    lala(Type.TrabzonBread, Yeast.IncludingYeast, Sliced.Sliced,sstr);
                                    break;

                                    case 4:
                                    System.out.println("-----------4-Trabzon Bread Not Including Yeast and Not Sliced-------------\n");
                                    String svtr = "Trabzon Bread Not Including Yeast and Not Sliced";
                                    lala(Type.TrabzonBread, Yeast.IncludingYeast, Sliced.Sliced,svtr);
                                    break;
                                default :
                                    System.out.println("Please enter the correct number");
                                    break;
                            }
                            break;
                            case 2:
                            System.out.println("-----------Choose the type of bread which you want-------------\n" +
                                    "-----------1-Multigrain_BreadIncluding Yeast and Not Sliced------\n" +
                                    "----------2-Multigrain_Bread  Including  Yeast and  Sliced---\n" +
                                    "----------3-Multigrain_Bread Not Including Yeast and  Sliced---\n" +
                                    "----------4-Multigrain_Bread Not Including Yeast and Not Sliced--------\n");
                            a = K.nextInt();

                            switch (a){
                                case 1:
                                    System.out.println("-----------Multigrain_BreadIncluding Yeast and Not Sliced-------------\n");
                                    String satr = "Multigrain_BreadIncluding Yeast and Not Sliced";
                                    lala(Type.Multigrain_Bread, Yeast.IncludingYeast, Sliced.notSliced,satr);
                                    break;
                                    case 2:
                                    System.out.println("-----------Multigrain_Bread  Including  Yeast and  Sliced-------------\n");
                                    String sstr = "Multigrain_Bread  Including  Yeast and  Sliced";
                                    lala(Type.Multigrain_Bread, Yeast.IncludingYeast, Sliced.Sliced,sstr);
                                    break;
                                    case 3:
                                        System.out.println("-----------Multigrain_Bread Not Including Yeast and  Sliced-------------\n");
                                    String sbtr = "Multigrain_Bread Not Including Yeast and  Sliced";
                                    lala(Type.Multigrain_Bread, Yeast.notIncludingYeast, Sliced.Sliced,sbtr);
                                    break;
                                    case 4:
                                        System.out.println("-----------Multigrain_Bread Not Including Yeast and Not Sliced-------------\n");
                                        String sftr = "Multigrain_Bread Not Including Yeast and Not Sliced";
                                    lala(Type.Multigrain_Bread, Yeast.notIncludingYeast, Sliced.notSliced,sftr);
                                    break;
                                default :
                                    System.out.println("Please enter the correct number");
                                    break;
                            }
                            break;
                            case 3:
                            System.out.println("-----------Choose the type of bread which you want-------------\n" +
                                    "-----------1-Rye_Bread Bread Including Yeast and Not Sliced------\n" +
                                    "----------2-Rye_Bread Bread  Including  Yeast and  Sliced---\n" +
                                    "----------3-Rye_Bread Bread Not Including Yeast and  Sliced---\n" +
                                    "----------4-Rye_Bread Bread Not Including Yeast and Not Sliced--------\n");
                            a = K.nextInt();
                            switch (a){
                                case 1:
                                    System.out.println("-----------1-Rye_Bread Bread Including Yeast and Not Sliced-------------\n");
                                    String satr = "Rye_Bread Bread Including Yeast and Not Sliced";
                                    lala(Type.Rye_Bread, Yeast.IncludingYeast, Sliced.notSliced,satr);
                                    break;
                                    case 2:

                                    System.out.println("-----------3-Rye_Bread Bread  Including Yeast and  Sliced-------------\n");
                                    String s7tr = "Rye_Bread Bread  Including Yeast and  Sliced";
                                    lala(Type.Rye_Bread, Yeast.IncludingYeast, Sliced.Sliced,s7tr);
                                    break;
                                    case 3:
                                    System.out.println("-----------3-Rye_Bread Bread Not Including Yeast and  Sliced-------------\n");
                                    String s6tr = "Rye_Bread Bread Not Including Yeast and  Sliced";
                                    lala(Type.Rye_Bread, Yeast.notIncludingYeast, Sliced.Sliced,s6tr);

                                    break;


                                case 4:
                                    System.out.println("-----------4-Rye_Bread Bread Not Including Yeast and Not Sliced-------------\n");
                                    String s5tr = "Rye_Bread Bread Not Including Yeast and Not Sliced";
                                    lala(Type.Rye_Bread, Yeast.notIncludingYeast, Sliced.notSliced,s5tr);

                                    break;
                                default :
                                    System.out.println("Please enter the correct number");
                                    break;
                            }
                            break;


                        case 4:
                            System.out.println("-----------Choose the type of bread which you want-------------\n" +
                                    "-----------1-Corn_Bread Bread Including Yeast and Not Sliced------\n" +
                                    "----------2-Corn_Bread Bread  Including  Yeast and  Sliced---\n" +
                                    "----------3-Corn_Bread Bread Not Including Yeast and  Sliced---\n" +
                                    "----------4-Corn_Bread Bread Not Including Yeast and Not Sliced--------\n");
                            a = K.nextInt();

                            switch (a){
                                case 1:
                                    System.out.println("-----------Corn_Bread Bread Including Yeast and Not Sliced-------------\n");

                                    String st4r = "Corn_Bread Bread Including Yeast and Not Sliced";
                                    lala(Type.Corn_Bread, Yeast.IncludingYeast, Sliced.notSliced,st4r);
                                    break;

                                case 2:
                                    System.out.println("-----------Corn_Bread Bread  Including  Yeast and  Sliced-------------\n");
                                    String st3r = "Corn_Bread Bread  Including  Yeast and  Sliced";
                                    lala(Type.Corn_Bread, Yeast.IncludingYeast, Sliced.Sliced,st3r);

                                    break;



                                case 3:
                                    System.out.println("-----------Corn_Bread Bread Not Including Yeast and  Sliced-------------\n");
                                    String str2 = "Corn_Bread Bread Not Including Yeast and  Sliced";
                                    lala(Type.Corn_Bread, Yeast.notIncludingYeast, Sliced.Sliced,str2);

                                    break;


                                case 4:
                                    System.out.println("-----------Corn_Bread Bread Not Including Yeast and Not Sliced-------------\n");
                                    String str1 = "Corn_Bread Bread Not Including Yeast and Not Sliced";
                                    lala(Type.Corn_Bread, Yeast.notIncludingYeast, Sliced.notSliced,str1);

                                    break;
                                default :
                                    System.out.println("Please enter the correct number");
                                    break;
                            }
                            break;



                        case 5:
                            System.out.println("-----------Choose the type of bread which you want-------------\n" +
                                    "-----------1-Wholemeal_Bread  Including Yeast and Not Sliced------\n" +
                                    "----------2-Wholemeal_Bread   Including  Yeast and  Sliced---\n" +
                                    "----------3-Wholemeal_Bread Not Including Yeast and  Sliced---\n" +
                                    "----------4-Wholemeal_Bread Not Including Yeast and Not Sliced--------\n");
                            a = K.nextInt();

                            switch (a){
                                case 1:
                                    System.out.println("-----------Wholemeal_Bread  Including Yeast and Not Sliced-------------\n");
                                    String szctr = "Wholemeal_Bread  Including Yeast and Not Sliced";
                                    lala(Type.Wholemeal_Bread, Yeast.IncludingYeast, Sliced.notSliced,szctr);
                                    break;

                                case 2:
                                    System.out.println("-----------Wholemeal_Bread   Including  Yeast and  Sliced-------------\n");
                                    String sntr = "Wholemeal_Bread   Including  Yeast and  Sliced";
                                    lala(Type.Wholemeal_Bread, Yeast.IncludingYeast, Sliced.Sliced,sntr);

                                    break;



                                case 3:
                                    System.out.println("-----------Wholemeal_Bread Not Including Yeast and  Sliced-------------\n");
                                    String stlr = "Wholemeal_Bread Not Including Yeast and  Sliced";
                                    lala(Type.Wholemeal_Bread, Yeast.notIncludingYeast, Sliced.Sliced,stlr);

                                    break;


                                case 4:

                                    System.out.println("-----------Wholemeal_Bread Not Including Yeast and Not Sliced-------------\n");
                                    String suutr = "Wholemeal_Bread Not Including Yeast and Not Sliced";
                                    lala(Type.Wholemeal_Bread, Yeast.notIncludingYeast, Sliced.notSliced,suutr);
                                    break;
                                default :
                                    System.out.println("Please enter the correct number");
                                    break;
                            }

                            break;


                        case 6:

                            System.out.println("-----------Choose the type of bread which you want-------------\n" +
                                    "-----------1-Buckwheat_Bread Including Yeast and Not Sliced------\n" +
                                    "----------2-Buckwheat_Bread  Including  Yeast and  Sliced---\n" +
                                    "----------3-Buckwheat_Bread Not Including Yeast and  Sliced---\n" +
                                    "----------4-Buckwheat_Bread Not Including Yeast and Not Sliced--------\n");
                            a = K.nextInt();

                            switch (a){
                                case 1:
                                    System.out.println("-----------Buckwheat_Bread Including Yeast and Not Sliced-------------\n");
                                    String settr = "Buckwheat_Bread Including Yeast and Not Sliced";
                                    lala(Type.Buckwheat_Bread, Yeast.IncludingYeast, Sliced.notSliced,settr);
                                    break;

                                case 2:
                                    System.out.println("-----------Buckwheat_Bread  Including  Yeast and  Sliced-------------\n");
                                    String stytr = "Buckwheat_Bread  Including  Yeast and  Sliced";
                                    lala(Type.Buckwheat_Bread, Yeast.IncludingYeast, Sliced.Sliced,stytr);

                                    break;



                                case 3:
                                    System.out.println("-----------Buckwheat_Bread Not Including Yeast and  Sliced-------------\n");
                                    String stewr = "Buckwheat_Bread Not Including Yeast and  Sliced";
                                    lala(Type.Buckwheat_Bread, Yeast.notIncludingYeast, Sliced.Sliced,stewr);

                                    break;


                                case 4:
                                    System.out.println("-----------Buckwheat_Bread Not Including Yeast and Not Sliced-------------\n");
                                    String stqerwr = "Buckwheat_Bread Not Including Yeast and Not Sliced";
                                    lala(Type.Buckwheat_Bread, Yeast.notIncludingYeast, Sliced.notSliced,stqerwr);

                                    break;
                                default :
                                    System.out.println("Please enter the correct number");
                                    break;

                            }


                            break;

                        default :
                            System.out.println("Please enter the correct number");
                            break;
                    }
                    break;


                default :
                    System.out.println("Please enter the correct number");
                    break;


            }

        }


    }
    private static void initializeInventory (Inventory inventory){
        inventory.addBread("1", 5, Type.TrabzonBread, Yeast.IncludingYeast, Sliced.Sliced);
        inventory.addBread("2", 4, Type.TrabzonBread, Yeast.IncludingYeast, Sliced.notSliced);
        inventory.addBread("3", 3, Type.TrabzonBread, Yeast.notIncludingYeast, Sliced.notSliced);
        inventory.addBread("4", 2, Type.TrabzonBread, Yeast.notIncludingYeast, Sliced.Sliced);
        inventory.addBread("5", 1, Type.Corn_Bread, Yeast.notIncludingYeast, Sliced.notSliced);

    }
    public static void order (String ad, String soyad, String str) throws IOException {

        FileWriter fwr = new FileWriter(filename, true);
        BufferedWriter bwr = new BufferedWriter(fwr);
        PrintWriter pwr = new PrintWriter(bwr);
        pwr.println(ad + " " + soyad + " " + str);
        pwr.flush();
        pwr.close();


    }
}