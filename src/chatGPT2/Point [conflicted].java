package chatGPT2;

public class Point {

private int x;
private int y;


//constructors
public Point() {
this (0,0);
}

public Point(int x, int y) {
this.x = x;
this.y = y;
}

//copy constructor

public Point (Point pointobj) {
this.x = pointobj.x;
this.y = pointobj.y;
}

// method to display the coordinates
public String display() {
return "Point(" + x + ", " + y + ")";
}
}