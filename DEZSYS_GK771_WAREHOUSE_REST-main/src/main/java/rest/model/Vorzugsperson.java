package rest.model;
import rest.election.ElectionSimulation;
public class Vorzugsperson {
    private String name;
    private int stimmen;
    public Vorzugsperson(String name, int stimmen) {
        this.name = name;
        this.stimmen = stimmen;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getStimmen() {
        return stimmen;
    }
    public void setStimmen(int stimmen) {
        this.stimmen = stimmen;
    }
    @Override
    public String toString() {
        return name+", "+stimmen+" Stimmen; ";
    }
}