public class Detail extends Select{
    public int current_index = -1;
    public Detail(int index, int before_index){
        // if(index == 0){
        //     return;
        // }
        System.out.println(super.menu[index]+"\nurl:string\n開発者:mitsutoshi, eiya, tomoaki\n\nr:戻る\nq:終了");
        char k = new java.util.Scanner(System.in).next().charAt(0);
        if(k == 'r'){
            super.backBefore(before_index);
        }
        else return;
    }
}