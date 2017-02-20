public abstract class Beverage {
    public enum Size { Tall, Grande, Venti };
    Size size = Size.Tall;
    String description = "Unknown beverage";

    public String getDescription() { return size + " " + description; }
    public Size getSize() { return size; }

    public void setSize(Size size) {
        this.size = size;
    }

    public abstract double cost();
}
