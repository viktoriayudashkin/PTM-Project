package com.company;

import java.util.HashMap;

public abstract class CacheManager implements ICacheManager { // My way - Multiple problems \ solutions
    //Dictionary<IProblem, ISolution> savedSolutions;
    HashMap<IProblem,ISolution> savedSolutions;
    //HashMap<IProblem,ISolution> saasas = new HashMap<>();

    @Override
    public void save(IProblem problemAsID, ISolution solutionToSave) {
        savedSolutions.put(problemAsID, solutionToSave);
    }

    @Override
    public ISolution load(IProblem problemAsID) throws NullPointerException {
        return savedSolutions.get(problemAsID);
    }

    @Override
    public boolean isSolutionStored(IProblem problem) {
        try {
            return (savedSolutions.get(problem) != null);
        } catch (Exception ex) {
            return false;
        }
    }
}