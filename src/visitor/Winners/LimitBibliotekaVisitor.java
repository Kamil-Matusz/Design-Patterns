package visitor.Winners;

public class LimitBibliotekaVisitor implements Visitor {
    @Override public void visit(Student s) { s.setLimitBib(); }
}
