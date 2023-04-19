

def my_quick_sort(array):
    if len(array) <= 1:
        return array
    else:
        pivot = array[0]
    min_val = [i for i in array[1:] if i <= pivot]
    max_val = [i for i in array[1:] if i > pivot]
    return my_quick_sort(min_val) + pivot + my_quick_sort(max_val)