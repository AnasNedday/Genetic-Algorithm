package GA3;

import GAWith0and1.GAUtils;
import GAWith0and1.GeneticAlgorithm;

import java.util.Arrays;

public class GAApplication3 {


    public static void main(String[] args) {
        GeneticAlgorithm3 ga = new GeneticAlgorithm3();
        ga.initializePopulation();
        ga.sortPopulation();
        ga.showPopulation();
        int iter = 0;
        while (GAUtils.MAX_ITERATIONS > iter && ga.getBestFitnessValue() < GAUtils.CHROMOSOME_SIZE) {
            ga.sortPopulation();
//            System.out.println("------------------");
            ga.crossover();
//            System.out.println("------------------");
            ga.mutation();
            ga.sortPopulation();
            System.out.println("it: "+iter+" "+Arrays.toString(ga.getPopulation()[0].getChromosome())+" : "+ga.getBestFitnessValue());
            iter++;
        }
//        geneticAlgorithm.showPopulation();

    }

    private static int getCounter(int counter) {
        counter++;
        return counter;
    }



}
