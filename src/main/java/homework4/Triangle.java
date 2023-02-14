package homework4;

public class Triangle {
    public static void main(String[] args) {
        Integer a = 5;
        Integer b = 6;
        Integer c = 7;
        float p = (a + b + c) / 2.f;
        float s = (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println("Сторона a равна: " + a);
        System.out.println("Сторона b равна: " + b);
        System.out.println("Сторона c равна: " + c);
        System.out.println("Площадь треугольника равна: " + s);
    }
}
