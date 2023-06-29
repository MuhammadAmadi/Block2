package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
//Задание 2.1:
//Заполнить список названиями планет Солнечной системы
//в произвольном порядке с повторениями.
//Задание 2.2
//Удалить повторяющиеся элементы из списка
public class test2 {
    public static void main(String[] args) {
        List<String> planets = List.of("Mercury","Venus","Earth","Jupiter","Saturn","Neptune","Uranus","Pluto");


        List<String> testList = findPlanet(planets, 10);
        System.out.println(testList);
        testList.sort(Comparator.naturalOrder());
        countPlanets(testList);
        removeCopy(testList);
        System.out.println(testList);

    }

    private static List<String> findPlanet(List<String> planets, int length){
        Random random = new Random();
        List<String> testList = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            testList.add(planets.get(random.nextInt(planets.size())));
        }
        return testList;
    }

    private static void countPlanets(List<String> testList){
        int count = 1;
        for (int i = 0; i < testList.size()-1; i++) {
            if(testList.get(i).equals(testList.get(i+1))){
                count++;
                continue;
            }
            System.out.println(testList.get(i) + ":" + count);
            count = 1;
        }
    }

    private static void removeCopy(List<String> testList){
        int i = 0;
        while (i < testList.size()-1) {
            if (testList.get(i).equals(testList.get(i+1))){
                testList.remove(i);
            }
            i++;
        }
    }
}
