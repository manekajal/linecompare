package bridgelabz;

public class LineLength {
    public static int startp1,endp1,startp2,endp2;
    double length;
    public LineLength(int startp1, int endp1, int startp2, int endp2)
    {
        this.startp1=startp1;
        this.endp1=endp1;
        this.startp2=startp2;
        this.endp2=endp2;
    }

    public static void main(String args[])
    {
        LineLength line = new LineLength(15,27,23,22 );
        double length=Math.sqrt((endp2-startp1)^2+(endp2-startp2)^2);
        System.out.println(length);


    }

}
