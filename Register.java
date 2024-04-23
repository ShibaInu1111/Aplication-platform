public class Register{
    String[] items;
    public Register(int flag){
        System.out.println(flag);
        switch (flag) {
            case 1:
                // サイト
                this.items = new String[] {"開発目的","何ができるか","開発時期・期間","誰が作ったか","サイトURL","サイトイメージ"};
                break;
            default:
                // アカウント
                this.items = new String[] {"表示名","メールアドレス","githubアカウント","アイコン画像","Upload"};
                break;

        }
        System.out.println("以下の項目について入力してください。\n-----------------");
        String[] input_list = new String[this.items.length];
        for(String value:this.items){
            System.out.println(value);
        }
        for(int i = 0; i < this.items.length; i++){
            input_list[i] = new java.util.Scanner(System.in).nextLine();
        }
        System.out.println("入力内容\n----------");
        for(int i = 0; i < this.items.length; i++){
            System.out.println(this.items[i]+" : "+input_list[i]);
        }
    }
}