package Java_Frameworks;

class Data{
    private int num;
    private String name;
    private InternalData internalData;

    Data(int _num, String _name, int _revenue){
        this.num = _num;
        this.name = _name;
        this.internalData = new InternalData(_revenue);
    }

    public void setNum(int _num){
        this.num = _num;
    }

    public void setName(String _name){
        this.name = _name;
    }

    public int getNum(){
        return num;
    }

    public String getName(){
        return name;
    }
}

class InternalData{
    public int revenue;
    InternalData(int _revenue){
        this.revenue = _revenue;
    }
}
public class basics {
    public static void main(String[] args) {
        Data dataObj1 = new Data(4,"Achyuta", 10000);
        Data dataObj = new Data(5,"Tom", 10000);
    }
}
