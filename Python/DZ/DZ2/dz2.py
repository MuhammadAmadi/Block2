# Задача 12: Петя и Катя – брат и сестра. Петя – студент, а Катя – школьница. 
#  Петя помогает Кате по математике. Он задумывает два натуральных числа X и Y (X,Y≤1000), 
#  а Катя должна их отгадать. Для этого Петя делает две подсказки. 
#  Он называет сумму этих чисел S и их произведение P.Помогите Кате отгадать задуманные Петей числа.
import math

# x+y=S
# x=S-y
# x*y=P
# P/x=y

b = int(input("Введите сумму чисел "))
c = int(input("Введите произведение чисел "))

k = -b / 2
D = k ** 2 - c  # D = -k^2 - ac
if D > 0:
    x = -k + D ** 0.5  # x1 = (-k^2+√D)/a
    y = -k - D ** 0.5  # x1 = (-k^2-√D)/a
elif D == 0:
    y = x = -k + D ** 0.5  # x1 = (-k^2+√D)/a
else:
    х = "Нет"
    y = " корней"
print(x, y)
