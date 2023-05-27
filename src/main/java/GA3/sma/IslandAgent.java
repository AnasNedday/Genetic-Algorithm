package GA3.sma;

import GA3.GAUtils3;
import GA3.Individual3;
import GAWithChars.Individual;
import jade.core.Agent;
import jade.core.behaviours.Behaviour;
import jade.core.behaviours.OneShotBehaviour;
import jade.core.behaviours.SequentialBehaviour;
import jade.domain.DFService;
import jade.domain.FIPAAgentManagement.DFAgentDescription;
import jade.domain.FIPAAgentManagement.ServiceDescription;
import jade.domain.FIPAException;

public class IslandAgent extends Agent {
    private Individual3[] population = new Individual3[GAUtils3.POPULATION_SIZE];
    private Individual3 individual31;
    private Individual3 individual32;

    @Override
    protected void setup() {
        DFAgentDescription dfAgentDescription = new DFAgentDescription();
        dfAgentDescription.setName(getAID());
        ServiceDescription serviceDescription = new ServiceDescription();
        serviceDescription.setName("island");
        serviceDescription.setType("ga3");
        dfAgentDescription.addServices(serviceDescription);

        try {
            DFService.register(this, dfAgentDescription);

        } catch (FIPAException e) {
            e.printStackTrace();
        }

    }

    @Override
    protected void takeDown() {
        try {

            DFService.deregister(this);

        } catch (
                FIPAException e) {
            e.printStackTrace();
        }
        addBehaviour(new OneShotBehaviour() {
            @Override
            public void action() {

            }
        });
        SequentialBehaviour sequentialBehaviour=new SequentialBehaviour();
        sequentialBehaviour.addSubBehaviour(new OneShotBehaviour() {
            @Override
            public void action() {

            }
        });
        addBehaviour(new Behaviour() {
            @Override
            public void action() {

            }

            @Override
            public boolean done() {
                return false;
            }
        });
    }

    @Override
    public void addBehaviour(Behaviour b) {
        super.addBehaviour(b);
    }
}

