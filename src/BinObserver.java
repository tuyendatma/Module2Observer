public class BinObserver extends Observer{
    @Override
    public void update() {
        System.out.print(" " + Integer.toBinaryString(subject.getState()));

    }
    public BinObserver(Subject subject) {
        this.subject = subject;
        this.subject.add(this);
    }

}

