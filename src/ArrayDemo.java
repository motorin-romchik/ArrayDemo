public class ArrayDemo {
    public static void main (String args[]) {
        int arr[] = new int [10];
        for (int i = 0; i < 10;i++){
            arr[i] = i;
        }
        for (int i = 0;i<10;i++)
            System.out.println("Элемент ["+i+"]: "+arr[i]);
    }
}