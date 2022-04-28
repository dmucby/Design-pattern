package HomeWork.Composite;

class Line extends Graphic{
    @Override
    public void Draw() {
        System.out.println("画出了一条直线");
    }
}

class Rectangle extends Graphic{
    @Override
    public void Draw() {
        System.out.println("画出了一组长方形");
    }
}

class Text extends Graphic{
    @Override
    public void Draw() {
        System.out.println("打印出一个文本");
    }
}

public class Main {
    public static void main(String[] args) {
        Picture picture = new Picture();
        picture.Add(new Line());
        picture.Add(new Rectangle());
        picture.Add(new Text());

        picture.Draw();

    }
}
