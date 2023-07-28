public class funcionPerdida {
    double funcionPerdida,perdida;
    public double FuncionPerdidaR2(double B0, double B1,double[] vectorSales,double[] vectorAdvertising,double n){
        funcionPerdida=0;
        for(int i=0;i<n;i++){
            funcionPerdida+=vectorSales[i]-(B0+B1*vectorAdvertising[i]);
        }
        funcionPerdida=funcionPerdida/n;
        funcionPerdida=funcionPerdida*funcionPerdida;
        return funcionPerdida;
    }

    public double funcionPerdidaR3(double B0, double B1,double B2,double[] vectorSales,double[] vectorAdvertising,double[] years,double n){
        funcionPerdida=0;
        for(int i=0;i<n;i++){
            funcionPerdida+=vectorSales[i]-(B0+(B1*years[i])+(B2*vectorAdvertising[i]));
        }
        funcionPerdida=funcionPerdida/n;
        funcionPerdida=funcionPerdida*funcionPerdida;
        return funcionPerdida;
    }
    //Derivadas parciales
    public double DPB2,DPB1,DPB0;
    public double DPB0(double B0, double B1,double[] vectorSales, double[] vectorAdvertising, double n){
        DPB0=0;
        for(int i=0;i<n;i++){
            DPB0=-2/n*(vectorSales[i]-(B0+(B1*vectorAdvertising[i])));
        }
        return DPB0;
    }
    public double DPB1(double B0, double B1,double[] vectorSales, double[] vectorAdvertising, double n){
        DPB1=0;
        for(int i=0;i<n;i++){
            DPB1=-2/n*((vectorSales[i]-(B0+(B1*vectorAdvertising[i])))*vectorAdvertising[i]);
        }
        return DPB1;
    }

    //programa 2
    public double DPB2R3(double B0, double B1,double B2,double[] vectorSales, double[] vectorAdvertising, double n,double[] years){
        DPB2=0;
        for(int i=0;i<n;i++){
            DPB2+=-2/n*((vectorSales[i]-(B0+(B1*years[i])+(B2*vectorAdvertising[i])))*vectorAdvertising[i]);
        }
        return DPB2;
    }
    public double DPB1R3(double B0, double B1,double B2,double[] vectorSales, double[] vectorAdvertising, double n,double[] years){
        DPB1=0;
        for(int i=0;i<n;i++){
            DPB1+=-2/n*((vectorSales[i]-(B0+(B1*years[i])+(B2*vectorAdvertising[i])))*years[i]);
        }
        return DPB1;
    }
    public double DPB0R3(double B0, double B1,double B2,double[] vectorSales, double[] vectorAdvertising, double n,double[] years){
        DPB0=0;
        for(int i=0;i<n;i++){
            DPB0+=-2/n*(vectorSales[i]-(B0+(B1*years[i])+(B2*vectorAdvertising[i])));
        }
        return DPB0;
    }
}

