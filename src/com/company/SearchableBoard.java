package com.company;

/*public class SearchableBoard implements ISearchable {
    PipeGameBoard board;

    @Override
    public State getInitialState() {
        return new State(board.getStart());
    }

    @Override
    public State getGoalState() {
        return new State(board.getEnd());
    }

    @Override
    public ArrayList<State<Point>> getAllPossibleStates(State s) {
        State<Point> Current = s;
        ArrayList<State<Point>> list = new ArrayList<>();
        ArrayList<Point> allPoint = board.getAllAdj(Current.state);
        for (int i = 0 ; i < allPoint.size();i++)
        {
            State<Point> SP = new State<Point>(allPoint.get(i));
            list.add(SP);
        }
        return list;
    }
}*/