import java.util.Scanner;

public class Top {

    public void select() {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        System.out.println("------KOHOKU PLATFORM------");
        System.out.println("1.Menu\n2.tool1\n3.tool2");
        while (true) {
            String input = scanner.nextLine();

            if (input.equals("1")) {
                menu.select();
            } else if (input.equals("2")) {
                System.out.println("tool1に該当するアプリケーションが存在しません");
            } else if (input.equals("3")) {
                System.out.println("tool2に該当するアプリケーションが存在しません");
            } else {
                System.out.println("無効な入力です");
            }
        }
    }
    
}