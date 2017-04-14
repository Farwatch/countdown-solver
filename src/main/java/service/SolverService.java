package service;

import models.InputNumbers;
import models.Solution;

/**
 * Created by nick on 14/04/17.
 */
public interface SolverService {

    Solution solve(InputNumbers inputNumbers);

}
