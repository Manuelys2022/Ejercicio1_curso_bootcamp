public class sumar2 {
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 200;
        int num3 = 300;
        int suma = sumartresnumeros(num1, num2, num3);
        System.out.println(suma);
    }


    public static int sumartresnumeros(int num1, int num2, int num3) {

        int resultado = num1 + num2 + num3;
        return resultado;
    }
}

