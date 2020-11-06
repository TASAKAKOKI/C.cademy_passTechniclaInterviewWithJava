import java.util.Arrays;
public class Main {
  //시작변수 선언
  private int temp_array[];
  private int len;
  
  //sort메소드: 정수배열nums을 인수값으로 주면, 객체변수의 initiate 변수를 초기화하고, quickSort()를 호출한다. 
  public void sort(int[] nums) {
    if(nums == null || nums.length == 0) {
      return;
    }
    this.temp_array = nums;
    this.len = nums.length;
    quickSort(0,len -1);
  }
  private void quickSort(int leftIdx, int rightIdx) {
    int i = leftIdx;
    int j = rightIdx;
    // 변수 pivot 생성하기
    int pivot = this.temp_array[(i+j)/2];
    // leftIdx가 rightIdx보다 작은한 while문 실행
    while (i<=j) {
      // leftIdx(i)에 위치한 값과 pivot을 비교한 뒤,
      // 작다면 i값을 오른쪽으로 이동(증가)시킨다.
      // 크다면 while문을 탈출한다.
      while(this.temp_array[i] < pivot) {
        i++;
      }
      while(this.temp_array[j] > pivot) {
        j--;
      }
      // 만약 i<j이면, i위치의 값과 j위치의 값을 서로 바꾼다.
      if(i<=j) {
        int temp = this.temp_array[i];
        this.temp_array[i] = this.temp_array[j];
        this.temp_array[j] = temp;
        i++;
        j--;
      }
    }
    // 바깥의 while문이 종료되면, resursive하게 quickSort메서드를 호출해준다 
    if(leftIdx < j) {
      quickSort(leftIdx,j);
    }
    if(i < rightIdx) {
      quickSort(i,rightIdx);
    }
  }
  public static void main(String[] args) {
    // Write your code here
    Main sample = new Main();
    int nums[] = {7, -5, 3, 2, 1, 0, 45};
    System.out.println("Original Array:");
    System.out.println(Arrays.toString(nums));
    sample.sort(nums);
    System.out.println("Sorted Array");
    System.out.println(Arrays.toString(nums));
  
 }
}