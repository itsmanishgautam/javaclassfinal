public class childMethodoverriding extends parentMethodoverriding {
    public void showdetails(String Collegename, String CollegeAddress){

        System.out.println("From Child Class:");
        System.out.println("CollegeDetails:"+ Collegename+CollegeAddress);



    }

    public static void main(String[] args) {


        parentMethodoverriding obj = new parentMethodoverriding();
        obj.showdetails("Texas", "Kathmandu");

        parentMethodoverriding obj2= new childMethodoverriding();
        obj2.showdetails("Texas","Mitrapark");


    }
}
