import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class W_Mirror_Clock{
	
	static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );

static int n,hour,minite;

static void solve(){
	
	int addition=0;
	
	if( minite==0 ){
		
		addition=1;
		
	}
	
	hour=11-hour+addition;
	
	if(hour<=0){
		
		hour+=12;
		
	}
	
	if( minite!=0 ){
		
		minite=60-minite;
		
	}
	
	System.out.printf("%02d:%02d\n", hour, minite);
	
}

	public static void main(String[] amit) throws IOException{
		
		n=in.nextInt();
		
		for(int i=0;i<n;i++){
			
	String s[]=in.next().split(":");		
			
			hour=Integer.parseInt(s[0]);
			
			minite=Integer.parseInt( s[1] );
			
			solve();
			
		}
		
	}
	
		static class Scanner{
        
        BufferedReader in;
        StringTokenizer st;

        public Scanner() {
        
            in=new BufferedReader( new InputStreamReader(System.in) );
            
        }
        
        String next() throws IOException{
            
            while(st==null || !st.hasMoreElements()){
                
                st=new StringTokenizer(in.readLine());
                
            }
            
            return st.nextToken();
            
        }
        
        int nextInt() throws IOException{
            
            return Integer.parseInt(next());
            
        }
        
        long nextLong() throws IOException{
            
            return Long.parseLong(next());
            
        }
        
        String nextLine() throws IOException{
            
            return in.readLine();
            
        }
        
        char nextChar() throws IOException{
            
            return next().charAt(0);
            
        }
        
        double nextDouble() throws IOException{
            
            return Double.parseDouble(next());
            
        }
        
        float nextFloat() throws IOException{
            
            return Float.parseFloat(next());
            
        }
        
        boolean nextBoolean() throws IOException{
            
            return Boolean.parseBoolean(next());
            
        }
        
        void close() throws IOException{
            
            in.close();
            
        }
        
    }
	
}