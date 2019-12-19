public class Deret implements InterfaceDeret {
    public int fn, n, fn_1, fn_2;
    
    public Deret (int n, int fn, int fn_2, int fn_1){
        this.n = n;
        this.fn = fn;
        this.fn_1 = fn_1;
        this.fn_2 = fn_2;
    }
    
    public Deret (){       
    }
    
    public void fibonacci(int n) {
        fn = 1;
        fn_1 = 0;
        fn_2 = 0;
        
        for (int i = 0; i < n; i++){
            System.out.print(fn + " ");
            fn_2 = fn_1;
            fn_1 = fn;
            fn = fn_1 + fn_2;
        }
    }

    public int getFn() {
        return fn;
    }

    public void setFn(int fn) {
        this.fn = fn;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getFn_1() {
        return fn_1;
    }

    public void setFn_1(int fn_1) {
        this.fn_1 = fn_1;
    }

    public int getFn_2() {
        return fn_2;
    }

    public void setFn_2(int fn_2) {
        this.fn_2 = fn_2;
    }
    
}
