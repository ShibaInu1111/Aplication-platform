public class Top extends Select{
    int current_index;
    public Top(){
        this.current_index = 0;
    }
    public void select(){
        int next_index = super.select(this.current_index);
        if(next_index == (super.menu.length-1)){
            return;
        }
        else if(next_index == (this.menu.length-2)) {
            return;
        }
        Detail detail = new Detail(next_index,this.current_index);
    }
}