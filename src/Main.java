import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        //Tracker data = null;
        Data data = new Data(new HashMap<>());
        data.getFoodList().put("Food", new Nutrition());
        Tracker tracker = new Tracker(new HashMap<String, Data>());
        tracker.getDataList().put("00/00/0000", data);
        updateData(tracker);
        tracker = retrieveData();
        startApp(tracker);
        updateData(tracker);
        return;
    }

    private static Tracker retrieveData() {
        Tracker data = null;
        try {
            FileInputStream fileIn = new FileInputStream("src/nutrition_tracker.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            data = (Tracker) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
            return null;
        } catch (ClassNotFoundException c) {
            System.out.println("Tracker class not found");
            c.printStackTrace();
            return null;
        }

        for(String key : data.getDataList().keySet()) {
            System.out.println("Date: " + key);
            System.out.println(data.getDataList().get(key));
            System.out.println();
        }
        return data;
    }

    private static void startApp(Tracker data) {
        Scanner sc = new Scanner(System.in);
        boolean on = true;
        while (on) {
            System.out.println("What do you want to do?");
            System.out.println("1) Add");
            System.out.println("2) Edit");
            System.out.println("3) Delete");
            System.out.println("4) View all data");
            System.out.println("5) Quit");
            String response = sc.nextLine();
            switch (response) {
                case "1":
                    add(data);
                    break;
                case "2":
                    edit(data);
                    break;
                case "3":
                    delete(data);
                    break;
                case "4":
                    view(data);
                    break;
                case "5":
                    on = false;
                    break;
                default:
                    break;
            }
        }
    }

    private static void add(Tracker data) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Nutrition> foodList = new HashMap<>();
        boolean on = true;
        System.out.println("Input the date in 00/00/0000 format:\n");
        String date = sc.nextLine();
        while (data.getDataList().get(date) != null) {
            System.out.println("This date already exists. Do you want to overwrite data?\n1) Yes\n2) No\n");
            String ans = sc.nextLine();
            if (ans.equals("2")) {
                on = false;
                break;
            } else if (ans.equals("1")){
                break;
            }
        }
        while (on) {
            System.out.println("Do you want to add food to list?\n1) Yes\n2) No\n");
            String response = sc.nextLine();
            switch (response) {
                case "1":
                    System.out.println("What is the name of the food?");
                    String foodName = sc.nextLine();
                    System.out.print("Calorie: ");
                    int calorie = Integer.parseInt(sc.nextLine());
                    System.out.println();

                    System.out.print("Serving size: ");
                    double servingSize = Double.parseDouble(sc.nextLine());
                    System.out.println();

                    System.out.println("Fat:");
                    System.out.print("\tGrams of Fat: ");
                    int gramsOfFat = Integer.parseInt(sc.nextLine());
                    System.out.println();
                    System.out.print("\tPercent fat: ");
                    double percentFat = Double.parseDouble(sc.nextLine());
                    Fat fat = new Fat(gramsOfFat, percentFat);
                    System.out.println();

                    System.out.println("Cholesterol:");
                    System.out.print("\tMilligrams of cholesterol: ");
                    int milligramsOfCholesterol = Integer.parseInt(sc.nextLine());
                    Cholesterol cholesterol = new Cholesterol(milligramsOfCholesterol);
                    System.out.println();

                    System.out.println("Sodium:");
                    System.out.print("\tMilligrams of sodium: ");
                    int milligramsOfSodium = Integer.parseInt(sc.nextLine());
                    Sodium sodium = new Sodium(milligramsOfSodium);
                    System.out.println();

                    System.out.println("Carbohydrate:");
                    System.out.println("\tFiber: ");
                    System.out.print("\t\tGrams of fiber: ");
                    int gramsOfFiber = Integer.parseInt(sc.nextLine());
                    System.out.println();
                    System.out.println("\tSugar: ");
                    System.out.print("\t\tGrams of sugar: ");
                    int gramsOfSugar = Integer.parseInt(sc.nextLine());
                    System.out.println();
                    Fiber fiber = new Fiber(gramsOfFiber);
                    Sugar sugar = new Sugar(gramsOfSugar);
                    Carbohydrate carbohydrate = new Carbohydrate(fiber, sugar);

                    System.out.println("Protein: ");
                    System.out.print("\tGrams of protein: ");
                    int gramsOfProtein = Integer.parseInt(sc.nextLine());
                    Protein protein = new Protein(gramsOfProtein);
                    System.out.println();

                    Nutrition nutrition = new Nutrition(calorie, servingSize, fat, cholesterol, sodium, carbohydrate, protein);
                    foodList.put(foodName, nutrition);
                    updateData(data);
                    System.out.println(foodName + " added to list.");
                    break;
                case "2":
                    on = false;
                    break;
                default:
                    break;
            }
            Data newData = new Data(foodList);
            data.getDataList().put(date, newData);
            System.out.println("All food(s) have been added for " + date);
        }

    }

    private static void edit(Tracker data) {
        if (data == null) {
            System.out.println("There is no data to edit.");
            return;
        }
        Scanner sc = new Scanner(System.in);
        boolean edit = true;
        if (data.getDataList().keySet().isEmpty()) {
            System.out.println("There are no dated lists to show");
            return;
        }
        System.out.println("Which date do you want to edit? (00/00/0000)");
        for (String key: data.getDataList().keySet()) {
            System.out.println(key);
        }
        System.out.println();
        String s1 = sc.nextLine();
        Data retrievedData = data.getDataList().get(s1);
        HashMap<String, Nutrition> map = retrievedData.getFoodList();
        System.out.println("Which food do you want to edit? (Case sensitive)");
        for (String key: map.keySet()) {
            System.out.println(key);
        }
        System.out.println();
        String s2 = sc.nextLine();
        Nutrition nutrition = map.get(s2);
        while (edit) {
            System.out.println("Which nutrition do you want to edit?");
            System.out.println("1) Calorie: " + nutrition.getCalorie());
            System.out.println("2) Serving size: " + nutrition.getServingSize());
            System.out.println("3) Fat: " + nutrition.getFat());
            System.out.println("4) Cholesterol: " + nutrition.getCholesterol());
            System.out.println("5) Sodium: " + nutrition.getSodium());
            System.out.println("6) Carbohydrate: " + nutrition.getCarbohydrate());
            System.out.println("7) Protein: " + nutrition.getProtein());
            System.out.println("8) Quit");
            String s3 = sc.nextLine();
            switch (s3) {
                case "1":
                    System.out.print("Calorie: ");
                    int cal = Integer.parseInt(sc.nextLine());
                    nutrition.setCalorie(cal);
                    updateData(data);
                    break;
                case "2":
                    System.out.print("Serving size: ");
                    double ser = Integer.parseInt(sc.nextLine());
                    nutrition.setServingSize(ser);
                    updateData(data);
                    break;
                case "3":
                    System.out.println("Fat: ");
                    System.out.print("\tGrams of fat: ");
                    int gf = Integer.parseInt(sc.nextLine());
                    System.out.println();
                    System.out.print("\tPercent fat: ");
                    double pf = Double.parseDouble(sc.nextLine());
                    nutrition.setFat(new Fat(gf, pf));
                    updateData(data);
                    break;
                case "4":
                    System.out.print("Cholesterol: ");
                    int cho = Integer.parseInt(sc.nextLine());
                    nutrition.setCholesterol(new Cholesterol(cho));
                    updateData(data);
                    break;
                case "5":
                    System.out.print("Sodium: ");
                    int sod = Integer.parseInt(sc.nextLine());
                    nutrition.setSodium(new Sodium(sod));
                    updateData(data);
                    break;
                case "6":
                    System.out.println("Carbohydrate: ");
                    System.out.println("\tFiber: ");
                    System.out.print("\t\tGrams of fiber: ");
                    int fiber = Integer.parseInt(sc.nextLine());
                    System.out.println();
                    System.out.println("\tSugar: ");
                    System.out.print("\t\tGrams of sugar: ");
                    int sugar = Integer.parseInt(sc.nextLine());
                    System.out.println();
                    nutrition.setCarbohydrate(new Carbohydrate(new Fiber(fiber), new Sugar(sugar)));
                    updateData(data);
                    break;
                case "7":
                    System.out.print("Protein: ");
                    int pro = Integer.parseInt(sc.nextLine());
                    nutrition.setProtein(new Protein(pro));
                    updateData(data);
                    break;
                case "8":
                    edit = false;
                    break;
                default:
                    break;
            }
        }

    }

    private static void delete(Tracker data) {
        if (data == null) {
            System.out.println("There is no data to delete.");
            return;
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Which date do you want to delete? (00/00/0000)");
        for (String key: data.getDataList().keySet()) {
            System.out.println(key);
        }
        String s = sc.nextLine();
        try {
            data.getDataList().remove(s);
        } catch (Exception e) {
            System.err.println("You cannot remove " + e + ". It does not exist or is not of right format");
        }
    }

    private static void view(Tracker data) {
        if (data == null) {
            System.out.println("There is no data to display.");
            return;
        }
        for(String key: data.getDataList().keySet()) {
            System.out.println(data.getDataList().get(key));
            System.out.println();
        }
    }


    private static void updateData(Tracker data) {
        try {
            FileOutputStream fileOut =
                    new FileOutputStream("src/nutrition_tracker.ser", false);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(data);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in src/nutrition_tracker.ser");
            Tracker a = retrieveData();
            for(String key: a.getDataList().keySet()) {
                System.out.println(data.getDataList().get(key));
                System.out.println();
            }
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

}
