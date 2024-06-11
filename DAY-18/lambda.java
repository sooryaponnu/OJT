interface Mathoperation{
    int operate(int a, int b);
}

public class lambda {
    public static void main(String[] args) {
        Mathoperation add = (a, b) -> a + b;
        Mathoperation sub = (a, b) -> a - b;

        int res1=add.operate(2, 5);
        int res2=sub.operate(8, 6);
        System.out.println("Add result-: "+res1);
        System.out.println("Sub result-: "+res2);
    }
}
