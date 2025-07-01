package visitor.Winners;

public class KwalifikacjaVisitor implements Visitor {
    private boolean kwalifikuje = false;

    @Override
    public void visit(Student s) {
        kwalifikuje =
                s.isLaureate()
                        || s.getAverage() >= 4.75
                        || (s.getAverage() >= 4.5 && s.isAllFirstTerm());
    }

    public boolean isQualified() { return kwalifikuje; }
}
