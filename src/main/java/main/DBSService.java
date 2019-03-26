package main;

import action.prediction;
import model.Goal;
import org.springframework.stereotype.Service;

@Service
public class DBSService {



    public String calculateAction(String username, Goal goal) {
        prediction pred = new prediction();
        if(username.contains("mary")) {
            return pred.getPrediction(goal.getAmount(), goal.getYear(), 1);
        } else{
            return pred.getPrediction(goal.getAmount(), goal.getYear(), 2);
        }


    }
}
