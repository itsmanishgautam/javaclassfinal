public class superChild extends superParent {
    private String data;
    public superChild(int num1, int num2, String data){
        super(num1, num2);
        this.data=data;

    }

    public void Addition(int num1, int num2){
        int result= super.add(num1,num2);
        System.out.println(num1+"+"+num2+"="+result);

    }

    public void executeAddition(){
        int result= super.add(num1,num2);
        System.out.println(super.num1+"+"+super.num2+"="+result);

    }

    public static void main(String[] args) {
       // superChild child= new superChild();

    }

}
