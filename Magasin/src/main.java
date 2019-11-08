import Categories.PC;
import Categories.Mobile;
import techSpec.AddSmt;
import techSpec.Brend;
import java.text.ParseException;
import java.util.Scanner;

public class main {
    private static Scanner scanner = new Scanner(System.in);
    static boolean rerun = true;
    private static Store store = new Store();



    static void menu() throws ParseException {
        while (rerun) {
            rerun = false;
            System.out.println("Выберите категорию");
            System.out.println("\n1-Телефон"+"\n2-Компухтер"+"\n3-Овощи"+
                    "\n4-Сладости"+"\n5-Питьевая вода"+"\n6-Сладкая вода"+"\n7-Одежда"+
                    "\n8-Информация по кошельку"+"\n0-Выход");
            int input = scanner.nextInt();
            switch (input) {
                case 1:
                    store.subMenu(store.mobiles);

                    break;
                case 2:
                    store.subMenu(store.pcs);

                    break;
                case 3:
                    store.subMenu(store.vegetables);

                    break;
                case 4:
                    store.subMenu(store.cookies);
                    break;
                case 5:
                    store.subMenu(store.waters);

                    break;
                case 6:
                    store.subMenu(store.sweets);
                    break;
                case 7:
                    store.subMenu(store.clothers);
                    break;
                case 8:
                    System.out.println("Wallet: " + store.wallet + "$");
                    store.repeet();
                    break;
                case 0:
                    System.exit(0);
                default:


            }
        }
    }
    public static void main(String[] args) throws ParseException {
        menu();
    }
}
