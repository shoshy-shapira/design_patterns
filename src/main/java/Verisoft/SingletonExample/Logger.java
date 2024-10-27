package Verisoft;

public class SingletonExample {
    private static SingletonExample example;
    private SingletonExample(){};
    public static synchronized SingletonExample getInstance(){
        if(example==null){
            example=new SingletonExample();
        }
        System.out.println("SingletonExample");
        return example;
    }

}
