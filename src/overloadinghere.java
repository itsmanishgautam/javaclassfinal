public class overloadinghere {
    public static void main (String args[]){

        overloadinghere demo = new overloadinghere();

        demo.add("Texas","Int","College");
        demo.add("Texas","College");
    }

    public void add(String num1, String num2, String num3){
        String result= num1+""+num2+""+num3;
        System.out.println("Full Name"+ result);
    }

    public void add(String num1, String num2){
        String result= num1+""+num2;
        System.out.println("Full Name"+ result);
    }



}
