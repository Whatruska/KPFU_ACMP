package OOP;

public class Company {
    Workable[] workables;
    Learnable[] learnables;

    public void workAll(){
        for (Workable work : workables){
            work.work(8);
        }
    }

    public void studyAll(){
        for (Learnable learn : learnables){
            learn.study(8);
        }
    }

    //for(int i =0; i < learnables.length; i++){
    //learn = learnables[i]
}
