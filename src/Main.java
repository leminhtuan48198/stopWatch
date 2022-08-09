public class Main {
    public static void main(String[] args) {
        StopWatch dongHo =new StopWatch();
        long[] arr=new long[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=Math.round(Math.random()*100000)    ;
        }
        dongHo.start();
        int n = arr.length;

        // Duyệt qua từng phần tử của mảng
        for (int i = 0; i < n - 1; i++) {

            // Tìm phần tử nhỏ nhất trong mảng chưa được sắp xếp
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Hoán đổi phần tử nhỏ nhất và phần tử đầu tiên
            long temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        dongHo.stop();
        System.out.println("Thoi gian da troi qua la "+dongHo.getElapsedTime().toMillis()+" mili giay");
    }
}
