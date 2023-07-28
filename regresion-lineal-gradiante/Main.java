public class Main {

    public static void main(String[] args){
        // vectores
        //double[] sales = {651,762,856,1063,1190,1298,1421,1440,1518};
        //double[] advertising = {23,26,30,34,43,48,52,57,58};
        //double[] Years = {1,2,3,4,5,6,7,8,9};
        double[] sales = {2,4,6,8,10,12,14,16,18};
        double[] advertising = {1,2,3,4,5,6,7,8,9};
        double n=9;

     
         betas  cal1= new betas();
         calculo cal = new calculo();
        cal.GredienteR2(sales,advertising,n,cal1.B0,cal1.B1, cal1.alfa, cal1.proximo);
        //pr.GredientDesentAlgorithmR3(sales,advertising,Years,n, step1.B0, step1.B1, step1.B2, step1.alfa);

    }
}
