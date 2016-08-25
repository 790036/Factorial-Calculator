
/**
 * Write a description of class FactCalc here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FactCalc
{
    private int tbf;
    private int thenum;
    public FactCalc(int a){
        tbf = a;
        thenum = 1;
    }
    public int result(){
        while(tbf>0){
            thenum = tbf * thenum;
            tbf = tbf - 1;
        }
        return thenum;

    }
}