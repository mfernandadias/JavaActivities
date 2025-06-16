package avancado.generics;

public class Par <T, U>{
    private T t;
    private U u;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        if(t == null){
            throw new IllegalArgumentException("O valor não pode ser nulo");
        }else {
            this.t = t;
        }
    }

    public U getU() {
        return u;
    }

    public void setU(U u) {
        //this.u = u;
        if(t == null){
            throw new IllegalArgumentException("O valor não pode ser nulo");
        }else{
            this.u = u;
        }
    }
}
