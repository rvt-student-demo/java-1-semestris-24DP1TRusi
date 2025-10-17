package rvt;

import java.util.*; 

public class JMArrayList {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();

        strings.add("First");
        strings.add("Second");
        strings.add("Third");
        

        System.out.println(strings);

        removeLast(strings);
        removeLast(strings);

        System.out.println(strings);
    }

    public static void onlyTheseNumbers() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<>();
        
        while (true) {
            int cip = Integer.valueOf(scanner.nextLine());

            if (cip == -1) {
                break;
            }
            num.add(cip);
        }
        System.out.println("From where?");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("To where?");
        int second = Integer.valueOf(scanner.nextLine());

        while (first <= second) {
            System.out.println(num.get(first));
            first++;
        }
        scanner.close();
    }

    public static void listSize() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> name = new ArrayList<>();
        
        while (true) {
            String per = scanner.nextLine();

            if (per.equals("") ) {
                break;
            }
            name.add(per);
        }
        System.out.println("In total: " + name.size());
        scanner.close();
    }

    public static void onTheList() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> name = new ArrayList<>();
        
        while (true) {
            String per = scanner.nextLine();

            if (per.equals("") ) {
                break;
            }
            name.add(per);
        }
        System.out.println("Search for? ");
        String search = scanner.nextLine();

        if (name.contains(search)) {
            System.out.println(search + " was found!");
        }
        else {
            System.out.println(search + " was not found!");
        }
        scanner.close();
    }

    public static void removeLast(ArrayList<String> string) {
        
        while (true) {
            int i = 0;
            if (i == string.size()) {
                string.remove(i -1);
                break;
            }
            else {
                i++;
            }
        }
    }
}
