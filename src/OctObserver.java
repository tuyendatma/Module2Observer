public class OctObserver extends Observer {
    @Override
    public void update() {
        System.out.print(" " + Integer.toOctalString(subject.getState()));
    }
    public OctObserver(Subject subject) {
        this.subject = subject;
        this.subject.add( this );
    }
}
