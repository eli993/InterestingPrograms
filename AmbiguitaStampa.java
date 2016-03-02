public class ambiguita{
	public static void main (String[] args){
		int[] a = {1,2,3,4};
		int i = 0;
		
			System.out.println(a[i++]);
				//Stampa 1 (prima usa i e poi lo incrementa)
				//Forma estesa:	System.out.println(a[i]); i++;			
			System.out.println(a[++i]);
				//Stampa 1 (prima incrementa i e poi lo usa)
				//Forma estesa:	i++; System.out.println(a[i]); 			
			System.out.println(a[i]++);
				//Stampa 3 e poi incrementa l'iesimo elemento dell'array (3 diventa 4)
				//Forma estesa: System.out.println(a[i]); a[i]++;
	}
}