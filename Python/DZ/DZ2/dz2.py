# Задача 12: Петя и Катя – брат и сестра. Петя – студент, а Катя – школьница. 
#  Петя помогает Кате по математике. Он задумывает два натуральных числа X и Y (X,Y≤1000), 
#  а Катя должна их отгадать. Для этого Петя делает две подсказки. 
#  Он называет сумму этих чисел S и их произведение P.Помогите Кате отгадать задуманные Петей числа.

# x+y=S
# x=S-y
# x*y=P
# P/x=y

S = int(input("Введите сумму чисел "))
P = int(input("Введите роизведение чисел "))
ind = 0
for i in range(S):
    for j in range(P):
        if S == i + j and P == i * j:
            print(f"{i} {j}")
        ind += 1
print(ind)