package P1;
import java.io.*;

public class Main {
	public static int intScan() {
        int intoutput = 0;
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));

        try {
            intoutput = Integer.valueOf(kb.readLine()).intValue();
        } catch (Exception e) {
            System.out.println("Data error.");
        }

        return intoutput;
    }
	public void main (String args[]) {
		int tmpX, tmpY;
		Point p1 = new Point(3, 5);
		p1.trasla(5, 2);
		
		System.out.println("Inserisci una la coordinata x di un punto: ");
		tmpX = intScan();
		
		System.out.println("Inserisci una la coordinata y dello stesso punto: ");
		tmpY = intScan();
		
		System.out.println("La distanza tra P1("+p1.getX()+", "+p1.getY()+") e P2("+tmpX+", "+tmpY+") è "+p1.distanza(tmpX, tmpY));
		
		
		System.out.println("Inseirsci un nuovo valore per x: ");
		p1.setX(intScan());
		
		System.out.println("Inseirsci un nuovo valore per y: ");
		p1.setY(intScan());
	}
}
