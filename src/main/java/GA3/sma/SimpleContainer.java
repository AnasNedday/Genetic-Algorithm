package GA3.sma;

import GA3.GAUtils3;
import jade.core.Profile;
import jade.core.ProfileImpl;
import jade.core.Runtime;
import jade.wrapper.AgentContainer;
import jade.wrapper.AgentController;
import jade.wrapper.ControllerException;

public class SimpleContainer {
    public static void main(String[] args) throws ControllerException {
        Runtime runtime=Runtime.instance();
        ProfileImpl profile=new ProfileImpl();
        profile.setParameter(Profile.MAIN_PORT,"localhost");
        AgentContainer agentContainer=runtime.createMainContainer(profile);
        for(int i=0;i< GAUtils3.ISLAND_NUMBER;i++){
            AgentController islandAgent=agentContainer.createNewAgent("IslandAgent"+i,IslandAgent.class.getName(),new Object[]{});
            islandAgent.start();
        }
        AgentController masteragent =agentContainer.createNewAgent("masteragent",MasterAgent.class.getName(),new Object[]{});
        masteragent.start();
    }
}
