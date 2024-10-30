import java.util.Scanner;
import java.util.LinkedList;

public class LinkSwitchScan {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();

        while(true){
        System.out.print("- - - Menu - - -\n"
                       + "1. Add an Item\n"
                       + "2. Remove an Item\n"
                       + "3. View all the Item Added\n"
                       + "4. Search an Item\n"
                       + "5. Exit\n"
                       + "Choice a number: ");
                       int opt = sc.nextInt();
        
        switch(opt){
            case 1: System.out.print("\nEnter a item to add: ");
                    String addItem = sc.next();
                    list.add(addItem);
                    System.out.println(addItem + " is Added.\n");
                break;
            case 2: if(list.isEmpty()){
                        System.out.println("\nNo Item to remove.");
                    } else {
                        System.out.print("\nWrite the item to remove: ");
                        String rem = sc.next();
                        if(list.contains(rem)){
                            System.out.println(rem + " is remove\n");
                            list.remove(rem);
                        } else {
                            System.out.println("There is no item " + rem + " in the list.\n");
                        }
                    }
                break;
            case 3: for(int i = 0; i < list.size(); i++){
                        System.out.println("- " + list.get(i));
                    }
                    System.out.println("");
                break;
            case 4: System.out.print("What item you want to search: ");
                    String item = sc.next();
                    if(list.contains(item)){
                        System.out.println(item + " is found in the system.\n");
                    } else {
                        System.out.println(item + " is not found in the system.\n");
                    }
                break;
            case 5: System.out.println("Exiting the program...");
                    System.exit(0);
                break;
            default: System.out.println("There is not " + opt + " optiong for this program.");
                     System.out.println("Please choice again\n");
                break;
        }
    }
        
    }
}
