
	static class CheckPrime {
	        static boolean isPrime(long number) {
	                boolean isPrime = false;
	                int i = (int) Math.ceil(Math.sqrt(number));
	                while (i > 1) {
	                        if ((number != i) && (number % i == 0)) {
	                                isPrime = false;
	                                break;
	                        } else if (!isPrime)
	                                isPrime = true;
	                        --i;
	                }
	                return isPrime;
	        }

	        public static void main(String[] args) {
	                Scanner new = new Scanner(System.new);
	                boolean quit = false; 
	                do {
	                 
	                                System.out.println("\nInput N: ");
	                                long comp = new.nextLong();
	                                if (isPrime(comp)) {
	                                        System.out.print(comp +" is prime\n");
	                                }
	                                else {
	                                		System.out.print(comp + " is composite with prime factors");
	                                        for (int i = 1; i < comp; i++) {
	                                                if (comp % i == 0) 
	                                                        if (isPrime(i))
	                                                        	System.out.print(", "+ i + " ")  ;               
	                                        }

	                                }
	                                
	                        }
	                 while (!quit);
	        }
	}
}