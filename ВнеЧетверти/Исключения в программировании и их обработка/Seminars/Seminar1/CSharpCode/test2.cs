// Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный 
// массив. 
// Необходимо посчитать и вернуть сумму элементов этого массива. 
// При этом накладываем на метод 2 ограничения: метод может работать только с 
// квадратными 
// массивами (кол-во строк = кол-ву столбцов), и в каждой ячейке может лежать
//  только значение 0 или 1. 
// Если нарушается одно из условий, метод должен бросить RuntimeException с 
// сообщением об ошибке.

int[,] matrix = {{1,0,0},
                {0,1,1},
                {1,1,1}};

System.Console.WriteLine();
int SumArr(int[,] matrix)
{

    int sum = 0;

    if (matrix.GetLength(0) != matrix.GetLength(1))
        throw new Exception("Не квадратный");

    foreach (int i in matrix)
    {
        if (i == 0 || i == 1)
        {
            sum += i;
        }
        else
            throw new Exception("элементы не только 0 и 1");
    }
    return sum;
}