package Menu;

import immigrantsCollection.ImmigrantsCollection;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Menu
{
    private static Scanner scanner = new Scanner(System.in);

    public static void mainMenu(ImmigrantsCollection immigrantsCollection)
    {
        while (true)
        {
            System.out.println("---MENU---");
            System.out.println("1. Zarejestruj nowego imigranta");
            System.out.println("2. Wyświetl aktualny stan");
            System.out.println("3. Wczytaj...");
            System.out.println("4. Zapisz");
            System.out.println("0. Wyjdź");
            System.out.print("Wybieram:");
            char selectedOption;
            selectedOption = scanner.nextLine().charAt(0);
            switch (selectedOption)
            {
                case '1' -> registerNewImmigrant(immigrantsCollection);
                case '2' -> viewCurrentStatus(immigrantsCollection);
                case '3' -> load(immigrantsCollection);
                case '4' -> save(immigrantsCollection);
                case '0' -> exit();
            }
        }
    }

    public static void registerNewImmigrant(ImmigrantsCollection immigrantsCollection)
    {
        System.out.print("Wpisz imie: ");
        String tmpFirstName = scanner.nextLine();
        System.out.print("Wpisz nazwisko: ");
        String tmpLastName = scanner.nextLine();
        immigrantsCollection.registerImmigrant(tmpLastName, generateRandomNumber(), generateRandomNumber(), tmpFirstName);
    }


    public static void viewCurrentStatus(ImmigrantsCollection immigrantsCollection)
    {
        for (int i = 0; i < immigrantsCollection.getSize(); ++i)
        {
            immigrantsCollection.getImmigrant(i).show();
        }
    }

    public static void load(ImmigrantsCollection immigrantsCollection)
    {
        immigrantsCollection.clear();
        List<String> allFiles = new ArrayList<>();


        File[] files = new File("files").listFiles();
        if (files == null)
        {
            System.exit(1);
        }

        for (File file : files)
        {
            if (file.isFile())
            {
                allFiles.add(file.getName());
            }
        }
        if (allFiles.size() == 0)
        {
            System.out.println("-BRAK ZAPISÓW-");
            return;
        }
        System.out.println("---WYBIERZ ZAPIS---");
        for (int i = 0; i < allFiles.size(); ++i)
        {
            System.out.println(i + ". " + allFiles.get(i));
        }
        System.out.print("Wybieram: ");
        int selectedFileIndex = Integer.parseInt(String.valueOf(scanner.nextLine().charAt(0)));
        BufferedReader reader;
        try
        {
            reader = new BufferedReader(new FileReader("files/" + allFiles.get(selectedFileIndex)));
            String line = reader.readLine();

            while (line != null)
            {
                immigrantsCollection.loadImmigrant(line);
                line = reader.readLine();
            }

            reader.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
            System.exit(1);
        }
    }

    public static void save(ImmigrantsCollection immigrantsCollection)
    {
        try
        {
            FileWriter writer = new FileWriter("files/" + new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date()) + ".txt");
            for (int i = 0; i < immigrantsCollection.getSize(); ++i)
            {
                writer.write(immigrantsCollection.getImmigrant(i).toString() + "\n");
            }
            writer.close();
        }
        catch (Exception e)

        {
            e.printStackTrace();
            System.exit(1);
        }
    }

    public static void exit()
    {
        System.out.println("---OPUSZCZANIE PROGRAMU---");
        System.exit(0);
    }


    private static Double generateRandomNumber()
    {
        return new Random().nextDouble() * 90;
    }
}