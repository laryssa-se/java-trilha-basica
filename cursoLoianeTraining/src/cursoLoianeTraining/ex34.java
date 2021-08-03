package cursoLoianeTraining;

public class ex34 {

		public static void main(String[] args) {
						
			int populacaoA = 80000;
			int populacaoB = 200000;
			int count = 0;			
			
			while(populacaoA < populacaoB) {
				populacaoA += (populacaoA/100)*3;
				populacaoB += (populacaoB/100)*1.5;
				count++;
				}
			
			System.out.println(populacaoA);
			System.out.println(populacaoB);
			System.out.println(count);
			}			
		}

