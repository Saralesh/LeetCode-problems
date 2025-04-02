int removeElement(int* nums, int numsSize, int val) {
    int k = 0;
    for (int i = 0; i < numsSize; i++) {  // Use index-based loop
        if (nums[i] != val) {
            nums[k++] = nums[i];  // Move non-val elements forward
        }
    }
    return k;  // Number of remaining elements
}
