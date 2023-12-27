public class superParent {


    protected int num1;
    protected int num2;

    public superParent( int num1, int num2){
        this.num1=num1;
        this.num2=num2;
    }

    public int add(int num1, int num2){
        return num1+num2;
    }

    public double sub(double num1, double num2){
        return num1-num2;
    }

}
