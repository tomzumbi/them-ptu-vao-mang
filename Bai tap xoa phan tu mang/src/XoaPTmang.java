import java.util.Arrays;
import java.util.Scanner;

public class XoaPTmang {
    public static void main(String[] args) {
        System.out.println("nhap vao do dai mang");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        System.out.println("nhap vao cac ptu trong mang");
        int[] arr = new int[size];
        int[] newarr = new int[size - 1];
        int i = 0;
        while (i < size) {
            arr[i] = scanner.nextInt();
            i++;
        }
        System.out.println("nhap vi tri can xoa");
        int vitri = scanner.nextInt();
        while (vitri >= size) {
            System.out.println("nhap lai");
            vitri = scanner.nextInt();
        }
        for (int j = 0; j < newarr.length; j++) {
            if (j < vitri) {
                newarr[j] = arr[j];
            }else {
                newarr[j]= arr[j+1];
            }
        }
        System.out.println(Arrays.toString(newarr));
    }
}

