package PrototypeDesignpattern.Practise;

public class IntelligentStudent extends Student {
    double iq;

    IntelligentStudent(IntelligentStudent other){
        super(other);
        other.iq = 100;
    }
    @Override
    public IntelligentStudent copy() {
        IntelligentStudent s = new IntelligentStudent(this);
        return s;
    }
}
