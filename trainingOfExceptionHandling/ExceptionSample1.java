package trainingOfExceptionHandling;

public class ExceptionSample1 {

    public static void main(String[] args) {
        try {
            int[] targetArray = { 37, 85, 64, 57, 98, 100, 47, 23, 71, 69 };
            int search = 55;

            int i;

            for (i = 0;i <= targetArray.length ;i++) {
                if (search == targetArray[i]) {
                    break;
                }
            }

            if (i >= targetArray.length) {
                System.out.println("対象のデータが見つかりませんでした！");
            }else {
                System.out.println("添字に"+ i +"に対象のデータが見つかりました！");
            }
        }catch (IndexOutOfBoundsException e){
            System.out.println("配列の添え字が超えました");
        }catch (ArithmeticException e) {
            System.out.println("0除算を行っています。");
        }
        

    }

}
