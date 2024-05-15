class Fw {
	String ht, wt;
	Fw(String x, String y) {
		ht = x;
		wt = y;
	}
}
class PubV extends Fw {
	String DP;
	PubV(String x, String y, String z) {
		super(x, y);
		DP = z;
	}
}
class Bus extends PubV {
	String TF;
	Bus(String x, String y, String z, String tf) {
		super(x, y, z);
		TF = tf;
	}
	void bus() {
		System.out.println("\nHeight : " + ht + "\nWeight : " + wt);
		System.out.println("Disel price : " + DP);
		System.out.println("Ticet Fare : " + TF);
	}
}
class Minibus extends PubV {
	String SRC, DST;
	Minibus(String x, String y, String z, String src, String dst) {
		super(x, y, z);
		SRC = src;
		DST = dst;
	}
	void minibus() {
		System.out.println("\nHeight : " + ht + "\nWeight : " + wt);
		System.out.println("Disel price : " + DP);
		System.out.println("SRC : " + SRC + "\nDestination : " + DST);
	}
}
class PriV extends Fw {
	String PP;
	PriV(String x, String y, String z) {
		super(x, y);
		PP = z;
	}
}
class Maruti extends PriV {
	String MFD;
	Maruti(String x, String y, String z, String mfd) {
		super(x, y, z);
		MFD = mfd;
	}
}
class Tata extends PriV {
	String COL;
	Tata(String x, String y, String z, String col) {
		super(x, y, z);
		COL = col;
	}
	void tata() {
		System.out.println("\nHeight : " + ht + "\nWeight : " + wt);
		System.out.println("Petrol price : " + PP);
		System.out.println("COL : " + COL);
	}
}
class Swift extends Maruti {
	String NOS;
	Swift(String x, String y, String z, String mfd, String nos) {
		super(x, y, z, mfd);
		NOS = nos;
	}
	void swift() {
		System.out.println("\nHeight : " + ht + "\nWeight : " + wt);
		System.out.println("Petrol price : " + PP);
		System.out.println("MFD : " + MFD);
		System.out.println("No. of Seats : " + NOS);
	}
}
class Dzire extends Maruti {
	String NOG;
	Dzire(String x, String y, String z, String mfd, String nog) {
		super(x, y, z, mfd);
		NOG = nog;
	}
	void dzire() {
		System.out.println("\nHeight : " + ht + "\nWeight : " + wt);
		System.out.println("Petrol price : " + PP);
		System.out.println("MFD : " + MFD);
		System.out.println("No. of Gears : " + NOG);
	}
}
class Hybrid {
	public static void main(String as[]) {
		Bus b = new Bus("15 ft", "10 ft", "100 rs/L", "10 rs");
		Minibus mb = new Minibus("10 ft", "8 ft", "100 rs/L", "Alipore", "Kamarhati");
		Swift s = new Swift("6 ft", "5 ft", "110 rs/L", "2024", "5");
		Dzire d = new Dzire("6 ft", "5 ft", "110 rs/L", "2024", "6");
		Tata t = new Tata("6 ft", "5 ft", "110 rs/L", "Blue");
		System.out.println("\nBus : ");
		b.bus();
		System.out.println("\nMiniBus : ");
		mb.minibus();
		System.out.println("\nSwift : ");
		s.swift();
		System.out.println("\nDzire : ");	
		d.dzire();
		System.out.println("\nTata : ");
		t.tata();
	}
}