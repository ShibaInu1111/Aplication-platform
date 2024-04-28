import java.util.Scanner;

public class Menu {

    public void select() {
        Register register = new Register();
        Scanner scanner = new Scanner(System.in);
        Top top = new Top();
        System.out.println("------メニュー一覧------");
        System.out.println("1.アカウント登録");
        System.out.println("2.サイト登録");
        System.out.println("r:Topに戻る q:終了する");
        while (true) {
            String str_input = scanner.nextLine();

            if (str_input.equals("1")) {
                System.out.println("アカウントの新規登録を行います");
                register.registerAccount();
            } else if (str_input.equals("2")) {
                System.out.println("サイトの新規登録を行います");
                register.registerSite();
            } else if (str_input.equals("r")) {
                System.out.println("Top画面に戻ります");
                top.select();
            } else if (str_input.equals("q")) {
                System.out.println("アプリケーションを終了します");
                System.exit(0);
            } else {
                System.out.println("無効な入力です");
            }
        
        }
    }
    
}