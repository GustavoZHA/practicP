package ordenar.muMethod;

public class Main {

    public static void main(String[] args) {
        Ordenar ordenar = new Ordenar();
        int[] number = {1,2,5,3,7,6};
        ordenar.organizar2(number);
        int[] num2 = {-5,0,5,2,5,3,7,6};
        ordenar.organizar2(num2);
        int[] num3 = {6,7,3,2,-5,-7};
        ordenar.organizar2(num3);
    }
}
