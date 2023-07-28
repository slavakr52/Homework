
class Reverse:

    def __init__(self, info, next=None):
        self.info = info
        self.next = next

def print_list(list, indent='\n'):
    while list:
        print(list.info, end=' >> ' if list.next else '')
        list = list.next
    print(end=indent)

def reverse_list(front, back=None):
    while front:
        front.next, back, front = back, front, front.next
    return back

list = Reverse(1, Reverse(2, Reverse(3, Reverse(4))))

print_list(list)

print_list(reverse_list(list))