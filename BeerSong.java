class BeerSong
{
	public static void main(String[] args)
	{
		
		Ninety_Nine_Bottles_Of_Beer( 99 ); 	
	
	}

	
	public static void Ninety_Nine_Bottles_Of_Beer(int numBottles)
	{

            if ( numBottles != 0)
            {
                if (numBottles != 99 )
                {

                    if ( numBottles == 1) 
                        System.out.printf("%d bottle of beer on the wall.",numBottles);
                    else      
                        System.out.printf( "%d bottles of beer on the wall.",numBottles);

                 }
                if ( numBottles == 1) 
                       System.out.printf("\n%d bottle of beer on the wall, %d bottle of beer." +
                        " \nTake one down pass it around, ",numBottles,numBottles);
                else
                    System.out.printf("\n%d bottles of beer on the wall, %d bottles of beer." +
                        " \nTake one down pass it around, ",numBottles,numBottles);

                Ninety_Nine_Bottles_Of_Beer( numBottles-1 ); 
            }
            else
                System.out.printf("no more bottles of beer on the wall.");
        }
    }
        
