//import stuff here?

//Your code here
public class Program5{
    public static void main(String [] args){
     
        double RoyaleM = 286;
        double KoopaM = 412;
        double PipeM = 361;
        double BadwagonM = 161;
        
        double RoyaleG = 9;
        double KoopaG = 40;
        double PipeG = 18;
        double BadwagonG = 11;
        
        double rMPG = RoyaleM / RoyaleG;
        rMPG = Math.round(rMPG*10.0)/10.0;
        
        double rKPG = KoopaM / KoopaG;
        rKPG = Math.round(rKPG*10.0)/10.0;
        
        double rPPG = PipeM / PipeG;
        rPPG = Math.round(rPPG*10.0)/10.0;
        
        double rBPG = BadwagonM / BadwagonG;
        rBPG = Math.round(rBPG*10.0)/10.0;
        
        
        
        System.out.println ("Mushroom Cup Prix Racer Average Miles/Per Gallon:");
        System.out.println ();
        System.out.println ("Royale averaged " + rMPG + " m/g");
        System.out.println ();
        System.out.println ("Koopa King averaged " + rKPG + " m/g");
        System.out.println ();
        System.out.println ("Pipe Frame averaged " + rPPG + " m/g");
        System.out.println ();
        System.out.println ("Bandwagon averaged " + rBPG + " m/g");
    }
}   
//Paste console output below:
/*
Mushroom Cup Prix Racer Average Miles/Per Gallon:

Royale averaged 31.8 m/g

Koopa King averaged 10.3 m/g

Pipe Frame averaged 20.1 m/g

Bandwagon averaged 14.6 m/g

*/
