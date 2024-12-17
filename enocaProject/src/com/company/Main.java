package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Main object = new Main();

        Random random = new Random();
        List<Integer> randomNumbers = new ArrayList<>();

        while (randomNumbers.size() < 100) {
            int randomNum = random.nextInt(100);
            if (!randomNumbers.contains(randomNum)) {
                randomNumbers.add(randomNum);
            }
        }

        System.out.println("Birinci Liste: " + randomNumbers);

        List<Integer> randomNumbers2 = new ArrayList<>(randomNumbers);

        System.out.println("İkinci Liste: " + randomNumbers2);

        int choosenOne = random.nextInt(100);

        System.out.println("Seçilen Sayı: " + choosenOne);

        for (int i =0; i<randomNumbers2.size(); i++){
            if (randomNumbers2.get(i) == choosenOne){
                randomNumbers2.remove(i);
                i--;
            }
        }

        System.out.println("Sayı Çıkarılmış Liste: " + randomNumbers2);

        System.out.println("*****");

        object.findNum(randomNumbers, randomNumbers2);

    }
    public void findNum(List<Integer> copiedList, List<Integer> copyingList ){
        List<Integer> remainigNum = new ArrayList<>(copiedList);
        remainigNum.removeAll(copyingList);

        System.out.println("Eksik olan sayı: " + remainigNum);
    }
}

