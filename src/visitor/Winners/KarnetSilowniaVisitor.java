package visitor.Winners;

public class KarnetSilowniaVisitor implements Visitor {
    @Override public void visit(Student s) { s.setKarnet(); }
}
