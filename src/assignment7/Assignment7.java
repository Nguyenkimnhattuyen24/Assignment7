import java.util.Scanner;

public class Assignment7 {
    
    //Nhập mảng số thực
    public static float[] importData(float[] arrays) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so tu trong mang:");
        int n = scanner.nextInt();
        arrays = new float[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu : " + (i + 1) + ": ");
            arrays[i] = scanner.nextFloat();
        }
        return arrays;
    }

    //Xuất mảng ra màn hình
    public static void printData(float[] arrays) {
         System.out.println("//------------------//");
        for (int i = 0;i <arrays.length ;i++ ) {
            System.out.println("so thu " + (i + 1) + " la :" + arrays[i]);
        }
        System.out.println();
    }

    //Tìm giá trị phần tử lớn thứ 2 trong mảng
    public static float findMax2(float[] arrays) {
        if (arrays.length < 2) {
            System.out.println("Mang khong du phan tu de lam gia tri lon thu 2.");
            return Float.NaN;
        }

        float max1 = Float.NEGATIVE_INFINITY;
        float max2 = Float.NEGATIVE_INFINITY;

        for (float num : arrays) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2 && num < max1) {
                max2 = num;
            }
        }

        if (max2 == Float.NEGATIVE_INFINITY) {
            System.out.println("Khong tim thay gia tri lon thu 2.");
            return Float.NaN;
        } else {
            return max2;
        }
    }

    // Xóa các phần tử lẻ ra khỏi mảng
    public static float[] deleteOddNumber(float[] arrays) {
        int countEven = 0;
        for (float num : arrays) {
            if ((int) num % 2 == 0) {
                countEven++;
            }
        }

        float[] result = new float[countEven];
        int index = 0;
        for (float num : arrays) {
            if ((int) num % 2 == 0) {
                result[index++] = num;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        float[] arrays = null;

        arrays = importData(arrays);

        printData(arrays);

        float max2 = findMax2(arrays);
        if (!Float.isNaN(max2)) {
            System.out.println("Gia tri lon thu 2 la: " + max2);
        }
        arrays = deleteOddNumber(arrays);
        System.out.println("Mang sau khi xoa cac phan tu le:");
        printData(arrays);
    }
}
