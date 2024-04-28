import java.util.Scanner;

public class Register {
    Scanner scanner = new Scanner(System.in);
    Menu menu = new Menu();

    public void registerAccount() {
        String[] info = {"アカウント名","メールアドレス","githubのURL","アイコン画像"};
        System.out.println("アカウント名を入力してください");
        info[0] = scanner.nextLine();
        System.out.println("メールアドレスを入力してください");
        info[1] = scanner.nextLine();
        System.out.println("githubアカウントのURLを入力してください");
        info[2] = scanner.nextLine();
        System.out.println("アイコン画像をアップロードしてください");
        info[3] = scanner.nextLine();
        menu.select();
    }

    public void registerSite() {
        String[] info = {"開発目的","サイト概要","開発期間・時期","作成者","URL","サイトイメージ"};
        System.out.println("開発目的を入力してください");
        info[0] = scanner.nextLine();
        System.out.println("サイトの概要を入力してください");
        info[1] = scanner.nextLine();
        System.out.println("開発期間・時期を入力してください");
        info[2] = scanner.nextLine();
        System.out.println("作成者を選択してください");
        info[3] = scanner.nextLine();
        System.out.println("サイトのURLを入力してください");
        info[4] = scanner.nextLine();
        System.out.println("サイトイメージをアップロードしてください");
        info[5] = scanner.nextLine();
        menu.select();
    }
    
}