

def my_merge_sort(nums, count=0):
    count += 1
    if len(nums) > 1:
        mid = len(nums) // 2
        left_nums = nums[:mid]
        right_nums = nums[mid:]
        my_merge_sort(left_nums, count)
        my_merge_sort(right_nums, count)
        i = j = k = 0
        while i < len(left_nums) and j < len(right_nums):
            if left_nums[i] < right_nums[j]:
                nums[k] = left_nums[i]
                i += 1
            else:
                nums[k] = right_nums[j]
                j += 1
            k += 1

        while i < len(left_nums):
            nums[k] = left_nums[i]
            i += 1
            k += 1

        while j < len(right_nums):
            nums[k] = right_nums[j]
            j += 1
            k += 1


list1 = [54, 12, 54, 5, 1, 5, 7, 26, 687, 74, 5167, 78]
my_merge_sort(list1)
print(list1)
