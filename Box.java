public class Box {
    int width = 0;
    int height = 0;
    int length = 0;

    // Constructor
    public Box(int w, int h, int l) {
        width = w;
        height = h;
        length = l;

        // Calculate and display Volume
        System.out.println("Box Volume = " + w * h * l);
    }
}
