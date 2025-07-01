package visitor.Winners;

public class ZwolnienieCzesnegoVisitor implements Visitor {
    @Override public void visit(Student s) { s.setCzesneZw(); }
}

