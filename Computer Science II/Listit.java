import java.util.*;

public class Listit {

    public static void main(String[] args) {
        // declare and array list size 3
        ArrayList<String> theList = new ArrayList<String>();
        // ask for 3 names
        System.out.println("Enter a name:");
        Scanner s = new Scanner(System.in);
        String input = s.next();
        theList.add(input);
        System.out.println("Enter a name:");
        s = new Scanner(System.in);
        input = s.next();
        theList.add(input);
        System.out.println("Enter a name:");
        s = new Scanner(System.in);
        input = s.next();
        theList.add(input);
        System.out.println("");
        // prints out the list of names
        print(theList);
        // sort the names
        Collections.sort(theList);
        print(theList);

        while (true) {
            System.out.println("Enter a command:");
            s = new Scanner(System.in);
            input = s.nextLine();
            if (input.equals("quit")) {
                break;
            }
            if (input.startsWith("add")) {
                System.out.println("");
                String x = input.substring(input.indexOf(" ") + 1);
                if (!theList.contains(x)) {
                    theList.add(x);
                    Collections.sort(theList);
                    print(theList);
                } else {
                    System.out.println("Already on the list!");
                    System.out.println("");
                }
            }
            if (input.startsWith("kill")) {
                System.out.println("");
                String x = input.substring(input.indexOf(" ") + 1);
                theList.remove(x);
                Collections.sort(theList);
                print(theList);
            }
            if (input.startsWith("clear")) {
                System.out.println("");
                theList.clear();
                System.out.println("List has been cleared");
            }
            if (input.startsWith("lookup")) {
                System.out.println("");
                String x = input.substring(input.indexOf(" ") + 1);
                int i = theList.indexOf(x);
                if (i == -1) {
                    System.out.println("Not Found");
                } else {
                    System.out.println("Indexed at: " + i);
                }
                System.out.println("");
            }
            if (input.startsWith("print")) {
                print(theList);
            }
            if (input.startsWith("random")) {
                System.out.println("");
                Collections.shuffle(theList);
                print(theList);
            }
            if (input.startsWith("sort")) {
                System.out.println("");
                Collections.sort(theList);
                print(theList);
            }
        }
    }

    public static void print(ArrayList<String> l) {
        /*
         * for (String s : l) { System.out.println(s); } System.out.println("");
         */
        Iterator<String> i = l.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        System.out.println("");
    }
}