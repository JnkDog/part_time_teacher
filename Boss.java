package Office;

import People.MyDate;
import People.Lop;
import People.Person;

import java.io.PrintStream;

public class Boss extends Person {
    private Lop workers;

    public Boss(String n, MyDate myDate){
        super(n, myDate);
        workers = new Lop();
    }
    public void addWorker(Worker worker) {
        workers.add(worker);
    }
    public void subWorker(Worker worker) {
        workers.remove(worker);
    }
    public void print(PrintStream ps) {
        super.print(ps);
        if(workers.getSize() > 0){
            ps.print(":bosses:"+workers.getName(0));
            if(workers.getSize() > 1){
                for(int i = 1;i < workers.getSize();i++) {
                    ps.print(","+workers.getName(i));
                }
            }
        }
    }

}
