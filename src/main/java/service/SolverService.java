package service;

import models.InputNumbers;
import models.Solution;

/**
 * Created by nick on 14/04/17.
 */
abstract class SolverService {

    private InputNumbers inputNumbers;
    private int target;

    SolverService(InputNumbers inputNumbers, int target) {
        this.inputNumbers = inputNumbers;
        this.target = target;
    }

    abstract Solution solve(InputNumbers inputNumbers);

    public InputNumbers getInputNumbers() {
        return inputNumbers;
    }

    public int getTarget() {
        return target;
    }
}
