package uff.ic.lleme.tcc00175.aulas.exercicios.temporizador.view;

import uff.ic.lleme.tcc00175.aulas.exercicios.temporizador.model.SubjectImpl;

public class ObserverImpl implements Observer {

    public void update() {
        // TODO Auto-generated method stub
    }

    public Object getState() {
        return state;
    }

    public void setState(Object state) {
        this.state = state;
    }
    private SubjectImpl subjectImpl;
    private Object state;
}
