public class Montecarlo{

//simulatinng integration of sin(x) on range 0 to 180
	public static void main(String[] args){
		
		float sum_y = 0;
		for (int n= 10; n<=180; n*=2){
			for (int i = 0; i <= n; i++){
				double u = Math.random();
				double x = u * Math.PI;//makes random between 0 to 180
				sum_y += Math.sin(x);
			}

			System.out.println("n="+n+" i="+Math.PI*sum_y/n);//(max-min)sum(g(x))/n
			sum_y = 0;

		}
	}
}