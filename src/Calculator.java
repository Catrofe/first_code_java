public class Calculator {
    public static double calculoVt(double salario){
        return salario * 0.06;
    }

    public static double calculoInss(double salario){
        if (salario < 1212.00) {
            return salario * 0.075;
        }
        else if (salario < 2427.35){
            return salario * 0.09;
        }
        else if (salario < 3641.03){
            return salario * 0.12;
        }
        else{
            return salario * 0.14;
        }
    }

    public static double calculoVr(double salario){
        return salario - 80;
    }

    public static double calculaDescontos(boolean vt, boolean vr, double salario){
        if (vt && vr){
            double valorInss = calculoInss(salario);
            double valorVt = calculoVt(salario);
            return calculoVr(salario - (valorInss + valorVt));
        }
        else if (vt){
            return salario - (calculoInss(salario) - calculoVt(salario));
        }
        else if (vr){
            return salario - (calculoInss(salario) - calculoVr(salario));
        }

        return salario - calculoInss(salario);
    }
}
