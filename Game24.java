
import java.util.Random;
public class Game24 {
    public float[] Generate4Num(){
        Random ran=new Random();
        float[] num=new float[4];
        for (int i=0;i<num.length;i++){
            int k=ran.nextInt(13)+1;
            num[i]=(float)(k);
        }
        return num;
    }
    public void print4Num(float num[]){
        System.out.println("随机产生的这四个数字是：");
        for (int i=0;i<num.length;i++){
            if (num[i]==1.0|num[i]==11.0|num[i]==12.0|num[i]==13.0){
                switch((int)num[i])
                {
                    case 1:
                        System.out.println("A(1)");break;
                    case 2:
                        System.out.println("J(11)");break;
                    case 3:
                        System.out.println("Q(12)");break;
                    case 4:
                        System.out.println("K(13)");break;
                    default:break;
                }
            }
            else {
                int k=(int) num[i];
                System.out.println(k+"");
            }
        }
        System.out.println();
    }

    public String game24(float num[]){
        float a=num[0];
        float b=num[1];
        float c=num[2];
        float d=num[3];
        float operator[][]={{a,b,c,d},{a,b,d,c},{a,c,b,d},{a,c,d,b},{a,d,b,c},{a,d,c,b},
                {b,a,c,d},{b,a,d,c},{b,c,a,d},{b,c,d,a},{b,d,a,c},{b,d,c,a},
                {d,a,b,c},{d,a,c,b},{d,b,a,c},{d,b,c,a},{d,c,a,b},{d,c,b,a}};
        char[]symbol={'+','-','*','/'};
        for (int i=0;i<24;i++){
            for (int k1=0;k1<4;k1++){
                for (int k2=0;k2<4;k2++){
                    for (int k3=0;k3<4;k3++){
                        float m1=fun(operator[i][0],operator[i][1],symbol[k1]);
                        float m2=fun(m1,operator[i][2],symbol[k2]);
                        float m3=fun(m2,operator[i][3],symbol[k3]);
                        if (m3==24.0){
                            System.out.println("(("+operator[i][0]+symbol[k1]+operator[i][1]+")"+symbol[k2]+operator[i][2]+")"+symbol[k3]+operator[i][3]);
                        }
                    }
                }
            }
        }
        System.out.println("输出1完成。");
        return null;
    }
    public float fun(float f,float g,char c) {
        switch (c) {
            case '+':
                return f + g;
            case '-':
                return f - g;
            case '*':
                return f * g;
            case '/':
                return f / g;
            default:
                break;
        }return 0;
    }
    public static void main(String[] args){
        Game24 game=new Game24();
        float[]num=new float[4];
        num=game.Generate4Num();
        game.print4Num(num);
        game.game24(num);
    }
}
