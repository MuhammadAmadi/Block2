# палиндром или нет рекурсией

def palindrome(text, idx=0):
    if idx < len(text)//2:
        if text[idx] == text[-1-idx]:
            return palindrome(text, idx+1)
        else:
            return "Не палиндром"
    return "Палиндром"


def palindrome_check(text):
    if len(text) < 2:
        return "Палиндром"
    if text[0] != text[-1]:
        return "Не палиндром"
    return palindrome_check(text[1:-1])


n = input("Введите строку")
print(palindrome(n))
print(palindrome_check(n))
