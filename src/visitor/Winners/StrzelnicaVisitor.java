package visitor.Winners;

public class StrzelnicaVisitor implements Visitor {
    @Override public void visit(Student s) { s.setStrzelnica(); }
}
