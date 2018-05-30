public class Exercise1_2_30 {
    public static void main(String[] args){
        double a = Math.random();
        double b = Math.random();
        double c = Math.random();
        double d = Math.random();
        double e = Math.random();
        double avg = (a+b+c+d+e)/5;
        if(a>b){
            if(a>c){
                if(a>d){
                    if(a>e){
                        System.out.println(a);
                    }
                }
            }
        } else if (b>a){
            if(b>c){
                if(b>d){
                    if(b>e){
                        System.out.println(b);
                    }
                }
            }
        } else if (c>a){
            if(c>b){
                if(c>d){
                    if(c>e){
                        System.out.println(c);
                    }
                }
            }
        } else if (d>a){
            if(d>b){
                if(d>c){
                    if(d>e){
                        System.out.println(d);
                    }
                }
            }
        } else{
            System.out.println(e);
        }
        System.out.println(avg);
    }
}
