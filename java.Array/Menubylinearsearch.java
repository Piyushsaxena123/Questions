public class Menubylinearsearch {
    public static int MenuItems(String menu[], String item) {
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equals(item)) { 
                return i; 
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String menu[] = {"Dosa", "Iddli", "Samosa", "Patties"};
        String key = "Samosa";

        int index = MenuItems(menu, key);
        if (index == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("Key is at index: " + index);
        }
    }
}
