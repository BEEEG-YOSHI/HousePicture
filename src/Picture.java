public class Picture
{
    private Square backround;
    private Square ground;
    private Square bricks;
    private Square brickBG;
    private Square wall1;
    private Square pillar1;
    private Square wall1BG;
    private Square pillar2;
    private Triangle roofBG;
    private Triangle roof;
    private Square chimeney;
    private Square chimenyBG;
    private Square wall2;
    private Square wall2BG;
    private Square garage;
    private Square ln1;
    private Square ln2;
    private Square ln3;
    private Square ln4;
    private Square door1;
    private Circle doorknob;
    private Square doorWindow;
    private Square windowBG;
    private Square window;
    private Person person;
    private Circle sun;
    private boolean drawn;


    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        backround = new Square(500,300,0,0, "sky");
        ground = new Square(500,50,0,260, "ground");
        brickBG = new Square(410,45,45,215, "black");
        bricks = new Square(400,35,50,220,"brick");
        wall1 = new Square(250,125, 60, 90, "wall");
        wall1BG = new Square(260,135,55,85,"black");
        pillar1 = new Square(25, 185, 30, 80, "trim");
        pillar2 = new Square(25, 185, 315, 80, "trim");
        roof = new Triangle(70,330,180,10,"wall");
        roofBG = new Triangle(80,370,180,5,"black");
        chimeney = new Square(50,90,60,20,"brick");
        chimenyBG = new Square(60,100,55,15,"black");
        wall2 = new Square(115,115, 330, 97, "wall");
        wall2BG = new Square(125,125, 325, 90, "black");
        garage = new Square(95,105, 345, 100, "black");
        ln1 = new Square(80,10, 353, 160, "trim");
        ln2 = new Square(80,10, 353, 185, "trim");
        ln3 = new Square(80,10, 353, 135, "trim");
        ln4 = new Square(80,10, 353, 115, "trim");
        door1 = new Square(50,90,250,125,"trim");
        doorknob = new Circle(10,255,175,"yellow");
        doorWindow = new Square(35,20,257,135,"sky");
        windowBG = new Square(135,60,90,125,"black");
        window = new Square(125,50,95,130,"sky");
        sun = new Circle(50,400,25,"yellow");
        person = new Person();
        drawn = false;
    }

    public static void main(String[] args) {
        Picture picture = new Picture();
        picture.draw();
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {

            backround.makeVisible();
            chimenyBG.makeVisible();
            chimeney.makeVisible();
            ground.makeVisible();
            brickBG.makeVisible();
            bricks.makeVisible();
            wall1BG.makeVisible();
            wall1.makeVisible();
            wall2BG.makeVisible();
            wall2.makeVisible();
            garage.makeVisible();
            ln1.makeVisible();
            ln2.makeVisible();
            ln3.makeVisible();
            ln4.makeVisible();
            pillar2.makeVisible();
            pillar1.makeVisible();
            roofBG.makeVisible();
            roof.makeVisible();
            door1.makeVisible();
            doorknob.makeVisible();
            doorWindow.makeVisible();
            windowBG.makeVisible();
            window.makeVisible();
            person.makeVisible();
            sun.makeVisible();

            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {

    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {

    }
}
