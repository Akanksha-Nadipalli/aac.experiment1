class rec{
    public static void main(String[] args) {
        int pos=4;
    
        int got=fib(pos);
        System.out.println(got);
    
    }
    static int fib(int pos){

        if(pos<=1){
            return pos;
        }
        return fib(pos-1)+fib(pos-2);
        
    }
}