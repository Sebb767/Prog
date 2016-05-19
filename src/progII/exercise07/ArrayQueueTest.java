package exercise07;

public class ArrayQueueTest 
{
	

	public static void main (String [] arga)
	{
		String kette_ref = null;
		ArrayQueue<String> schlange_ref = new ArrayQueue<String>(3);

		System.out.println("Schlange leer? " + schlange_ref.empty());
			for (int i = 1; i <=5; i++)
			{
				try
				{
						kette_ref = "Element_" + i;
						schlange_ref.enqueue(kette_ref);
						System.out.println("Abgelegtes Element: " + kette_ref);
				}//endtry
				catch(IllegalAccessException e_ref)
				{
					System.out.println("FEHLER: " + e_ref.getMessage());
				}//endcatch
			}//endfor
		
		System.out.println("\nSchlange leer? " + schlange_ref.empty());
		
			for (int i = 1; i <=5; i++)
			{
				kette_ref = schlange_ref.front();
				if(kette_ref != null)
					System.out.println("Abgefragtes Kopf-Element: " + kette_ref);
				else
					System.out.println("Schlange leer: " + kette_ref);
				
				kette_ref = schlange_ref.dequeue();
				if(kette_ref != null)
					System.out.println("Entnommenes Kopf-Element:" + kette_ref);
				else
					System.out.println("Schlange leer: " + kette_ref);

			}//endfor	
			
			System.out.println("\nSchlange leer? " + schlange_ref.empty());
	}//endmethod main
	
}//endclass ArrayQueueTest
