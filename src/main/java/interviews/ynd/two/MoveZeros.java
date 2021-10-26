package interviews.ynd.two;

public class MoveZeros {

  public void moveZeros(int[] nums) {
    int r = 1;
    int len = nums.length;
    for (int i = 0; i < len - 1; i++) {
      if (nums[i] == 0) {
        int index = Math.max(i + 1, r);
        for (int j = index; j < len; j++) {
          if (nums[j] != 0) {
            r = j + 1;
            swap(nums, i, j);
            break;
          }
        }
      }
    }
  }

  void swap(int[] nums, int l, int r) {
    int tmp;
  }
}

// 1 2 3 4 i0 0 0 0 0 j5 0 6
// 1 2 3 4 5 6 0 0 0
