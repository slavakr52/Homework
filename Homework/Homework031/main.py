
def heap_find(array, i, j):
    max = j
    x = 2 * j + 1
    y = 2 * j + 2

    if x < i and array[j] < array[x]:
        max = x

    if y < i and array[max] < array[y]:
        max = y

    if max != j:
        array[j],array[max] = array[max],array[j]
        heap_find(array, i, max)

def heap_sort(array):
    n = len(array)

    for i in range(n, -1, -1):
        heap_find(array, n, i)

    for i in range(n-1, 0, -1):
        array[i], array[0] = array[0], array[i]
        heap_find(array, i, 0)



array = [33, 17, 23, 4, 9, 27]
heap_sort(array)
n = len(array)
print ("Sorted array: ")
for i in range(n):
    print ("%d" %array[i])