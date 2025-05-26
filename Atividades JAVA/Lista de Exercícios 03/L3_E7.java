public class L3_E7 {
	public static void main(String[] args) {
		System.out.print("Número de votos no eleitor A: ");
		
		int va = Integer.parseInt(System.console().readLine());

		System.out.print("Número de votos no eleitor B: ");
		
		int vb = Integer.parseInt(System.console().readLine());

		System.out.print("Número de votos no eleitor C: ");
		
		int vc = Integer.parseInt(System.console().readLine());

		System.out.print("Número de votos nulos: ");
		
		int vnu = Integer.parseInt(System.console().readLine());

		System.out.print("Número de votos brancos: ");
		
		int vbr = Integer.parseInt(System.console().readLine());

        int vt = va+vb+vc+vnu+vbr;
		
		double pa = (va*100.0)/vt;
		double pb = (vb*100.0)/vt;
		double pc = (vc*100.0)/vt;
	    double pbr = (vbr*100.0)/vt;
		double pnu = (vnu*100.0)/vt;
				
		System.out.print("número total de eleitores: "+vt);
        System.out.printf("\nPercentual de votos do candidato A: %.2f%%\n", pa);
        System.out.printf("Percentual de votos do candidato B: %.2f%%\n", pb);
		System.out.printf("Percentual de votos do candidato C: %.2f%%\n", pc);
		System.out.printf("Percentual de votos brancos: %.2f%%\n", pbr);
		System.out.printf("Percentual de votos nulos: %.2f%%\n", pnu);
		
	}
}