

def quick_sort(array):
    if len(array) <= 1:
        return array
    pivot = array[0]
    min_arr = [i for i in array[1:] if i <= pivot]
    max_arr = [i for i in array[1:] if i > pivot]
    return quick_sort(min_arr) + [pivot] + quick_sort(max_arr)


array_test = [2, 54, 8, 7, 6, 2, 15, 7]
print(quick_sort(array_test))
