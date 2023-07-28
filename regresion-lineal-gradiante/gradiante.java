public class gradiante {
    double GradienteB0,GradienteB1,GradienteB2;
    public double GradienteB0(double B0,double alfa,double DPB0,double n){
        GradienteB0=B0-(alfa*DPB0);
        return GradienteB0;
    }
    public double GradienteB1(double B1,double alfa,double DPB1,double n){
        GradienteB1=B1-(alfa*DPB1);
        return GradienteB1;
    }
    public double GradienteB2(double B2,double alfa,double DPB2,double n){
        GradienteB2=B2-(alfa*DPB2);
        return GradienteB2;
    }

}
class calculo {
    funcionPerdida perdida =new funcionPerdida();
    gradiante gradian = new gradiante();

    double loss,dp0,dp1,dp2;
    public void GredienteR2(double[] vectorSales,double[] vectorAdvertising,double n,double B0,double B1,double alfa,double proximo) {
        loss = perdida.FuncionPerdidaR2(B0,B1,vectorSales,vectorAdvertising,n);
        System.out.println(loss);
        while(loss>proximo){
            dp0 = perdida.DPB0(B0, B1, vectorSales, vectorAdvertising, n);
            dp1 = perdida.DPB1(B0, B1, vectorSales, vectorAdvertising, n);
            B0 = gradian.GradienteB0(B0, alfa, dp0, n);
            B1 = gradian.GradienteB1(B1, alfa, dp1, n);
            loss = perdida.FuncionPerdidaR2(B0, B1, vectorSales, vectorAdvertising, n);
            System.out.println(loss);
        }
        System.out.println("B0 =  " + B0  +  " B1= "+ B1 +"  " + perdida);
    }

    //prograama 2
    public void GredienteR3(double[] vectorSales,double[] vectorAdvertising,double[] years,double n,double B0,double B1,double B2,double alfa) {
        loss = perdida.funcionPerdidaR3(B0,B1,B2,vectorSales,vectorAdvertising,years,n);
        System.out.println(loss);
        while(loss>0.09){
            dp0= perdida.DPB0R3(B0,B1,B2,vectorSales,vectorAdvertising,n,years);
            dp1= perdida.DPB1R3(B0,B1,B2,vectorSales,vectorAdvertising,n,years);
            dp2= perdida.DPB2R3(B0,B1,B2,vectorSales,vectorAdvertising,n,years);
            //System.out.println(dp3);
            B0=gradian.GradienteB0(B0,alfa,dp0,n);
            //System.out.println(gB0);
            B1=gradian.GradienteB1(B1,alfa,dp1,n);
            //System.out.println(gB1);
            B2=gradian.GradienteB2(B2,alfa,dp2,n);
            //System.out.println(gB2);
            loss= perdida.FuncionPerdidaR2(B0,B1,vectorSales,vectorAdvertising,n);
            System.out.println(loss);
        }
        System.out.println("B0 =  " + B0  +  " B1= "+ B1 +" B2= " + B2 + "  " +loss);

    }


}
