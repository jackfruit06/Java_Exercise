public interface Shape {
    double getPerimeter();
    double getArea();
    default public int compareTo(Shape s){
        if(getArea() > s.getArea()){
            return 1;
        } else if(getArea() == s.getArea()){
            return 0;
        } else{
            return -1;
        }
    }
}
