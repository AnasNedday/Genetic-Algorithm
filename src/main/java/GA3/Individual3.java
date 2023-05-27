package GA3;

import GAWith0and1.GAUtils;

import java.util.Random;

public class Individual3 implements Comparable {
    private int [] chromosome = new int[GAUtils.CHROMOSOME_SIZE];
    private int fitness ;

    public Individual3() {
        Random random=new Random();
        for (int i = 0; i < GAUtils.CHROMOSOME_SIZE; i++) {
            chromosome[i]=random.nextInt(2);
        }
    }

    public Individual3(int[] chromosome) {
        this.chromosome = chromosome;
    }

    public void calculateFitness() {
        for (int i:chromosome) {
            fitness+=i;
        }
    }

    public int getFitness() {
        return fitness;
    }

    public int[] getChromosome() {
        return chromosome;
    }

    @Override
    public int compareTo(Object o) {
        Individual3 individual=(Individual3) o ;
        return Integer.compare(this.fitness, individual.fitness);
    }

    public void setChromosome(int[] chromosome) {
        this.chromosome = chromosome;
    }

    public void setFitness(int fitness) {
        this.fitness = fitness;
    }
}
