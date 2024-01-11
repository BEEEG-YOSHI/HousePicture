public class Picture
{
    private Square backround;
    private Square ground;
    private Square bricks;
    private Square brickBG;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        backround = new Square(500,300,0,0, "sky");
        ground = new Square(500,50,0,260, "ground");
        brickBG = new Square(410,40,50,220);
        bricks = new Square(400,35,50,220,"brick");
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
            ground.makeVisible();
            brickBG.makeVisible();
            bricks.makeVisible();














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
