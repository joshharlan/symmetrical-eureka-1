package euler2;

public class eulergang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int sum=0;
		for(int i = 0; i < 4000000; i++){
		}*/
	    int first=0;
	    int second=1;
	    int bound=4_000_000;
	    int sum=0;

	    boolean dingo=false; //when fib numbers > bound
	    while(!dingo){
	        int newFib=first + second;
	        first = second;
	        second = newFib;

	        if(newFib > bound){
	            dingo=true;
	            break;
	        }

	        if(newFib % 2 == 0){
	            sum += newFib;
	        }
	    }

	    System.out.println(sum);
	}

}
