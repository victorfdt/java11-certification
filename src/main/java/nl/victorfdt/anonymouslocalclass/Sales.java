package nl.victorfdt.anonymouslocalclass;

public interface Sales {

    void toSell();
    default int returnNumber(){
        return 2;
    };
}
