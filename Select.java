public class Select{
    String[] menu = {"Top","分析ツール","観分判ツール","申請ツール","Menu","終了"};
    public int select(int current_index) {
        this.showMenu(current_index);
        int index = new java.util.Scanner(System.in).nextInt();
        if(index <= current_index) {
            index++;
        }
        else if(index >= this.menu.length){
            System.out.println("間違っているため、再入力してください。");
            this.select(current_index);
            return current_index;
        }
        if(index == (this.menu.length-1))return -1;
        System.out.println(this.menu[index]);
        return index;
    }

    public void backBefore(int index){
        if(index == 0){
            Top top = new Top();
            top.select();
        }
        else if(index >= (this.menu.length-1)){
            return;
        }
        else {
            Detail detail = new Detail(index, 0);
        }
    }

    public void showMenu(int current_index){
        System.out.println(this.menu[current_index]+"\n------------");
        int count = 1;
        for(int i = 0; i < this.menu.length; i++){
            if(i == current_index)continue;
            System.out.println(count+". "+this.menu[i]);
            count++;
        }
    }
}