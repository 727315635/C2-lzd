public class Task9 {
    public static void main(String[] args) {
        star a= new star();
        a.shine();
        System.out.println("====================");

        sun sun1  = new sun();
        sun1.doAnything();
        sun1.shine();
//      Universe universe = new Sun();
//      universe.doAnything();
//      sun sun1  = (sun) universe;
//      sun1.shine();                           灰色四行与上面三行等价，不懂记得问。
    }
}



interface Universe{
    public abstract void doAnything();
}

class star{
    public void shine(){
        System.out.println("star:星星一闪一闪亮晶晶");
    }
}

class sun extends star implements Universe{

    @Override
    public void doAnything() {
        System.out.println("sun:太阳吸引着9大行星旋转");
    }

    @Override
    public void shine() {
        System.out.println("sun:光照八分钟,到达地球");
    }
}