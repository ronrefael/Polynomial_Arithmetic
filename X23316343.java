	 
	public class X23316343 extends Polynomial{
	
	public static void main(String args[]) throws Exception {
		
	      Polynomial p = new X23316343(" X^5"), 
	    		  	 q = new X23316343("X^2 - X + 1");
	      Utility.run(p, q);
	   }
	   
	   public X23316343(String s) throws Exception {
	      // complete this code
		  s = s + " ";;
			  
		  Polynomial n = new X23316343();
		  n = this;
		  
		  String [] split = s.split(""); // change string s into array of strings
		 
		  for(int i = 0; i < split.length; i++){
			    
			  char c = split[i].charAt(0);
			  
			  if( (Character.isDigit(c)) && (split[i+1].equals("X")) && (split[i+2].equals("^")) ){ 
				  Term t = new Term(Double.parseDouble(split[i]), Integer.parseInt(split[i+3]));
				  n.data.addLast(t);
 
			  }
			  
			  else if( (split[i].equals("X")) && (split[i+1].equals("^")) ){ 
				  Term t = new Term(1.0, Integer.parseInt(split[i+2]));
				 
				  n.data.addLast(t);
				  
			  }
			  
			  else if( (Character.isDigit(c)) && (split[i+1].equals("X")) ){ 
				  Term t = new Term(Double.parseDouble(split[i]), 1);
				  n.data.addLast(t);
				  
				  if(split[i-2].equals("-")) t.coefficient *= -1;
				  				 
			  }
			  
			  else if( split[i].equals("X") ){ 
				  Term t = new Term(1.0, 1);
				  if(split[i-2].equals("-")) t.coefficient *= -1;
				  
				  n.data.addLast(t);

			  }
			  else if( Character.isDigit(c) && (!split[i-1].equals("^")) ){  
				  Term t = new Term(Double.parseDouble(split[i]), 0);
				  n.data.addLast(t);
				  
				  if(split[i-2].equals("-")) t.coefficient *= -1;

				  }
			  
		  }	  
		 
	   }
	   
	   public X23316343() {
	      super();
	   }

	   public Polynomial add(Polynomial p) {   
		  
		  Polynomial ans = new X23316343();
	   try {
		  DNode<Term> temp1 = this.data.getFirst();
		  DNode<Term> temp2 = p.data.getFirst();
		  
		while(temp1.getNext() != null && temp2.getNext() != null){
			 
			 if(temp1.getData().degree == temp2.getData().degree){  
				  Term t = new Term(temp1.getData().coefficient + temp2.getData().coefficient, temp1.getData().degree);
				  ans.data.addLast(t); 
				  temp1 = temp1.getNext();
				  temp2 = temp2.getNext();
			  }
			  
			 else if(temp1.getData().degree < temp2.getData().degree){ 
				  Term t = new Term(temp2.getData().coefficient, temp2.getData().degree);
				  ans.data.addLast(t);
				  temp2 = temp2.getNext();
			  }
			 
			  else if(temp1.getData().degree > temp2.getData().degree){ 
				  Term t = new Term(temp1.getData().coefficient, temp1.getData().degree);
				  ans.data.addLast(t);
				  temp1 = temp1.getNext();
			  }		  
		}
		 
			if( temp1.getNext() != null){
				while(temp1 != null){ 							
					ans.data.addLast(temp1.getData());
					temp1 = temp1.getNext();
				}
			}
				  
			if( temp2.getNext() != null){
				while(temp2 != null){ 								
					ans.data.addLast(temp2.getData());
					temp2 = temp2.getNext();
				}
			}
	   } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      // complete this code
	      return ans;
	   }

	   public Polynomial subtract(Polynomial p) {
	      
	      Polynomial ans = new X23316343();
	      try {
	      Polynomial sub = new X23316343();
	      DNode<Term> temp1 = p.data.getFirst();
	      
	      while(temp1.getNext() != null){
	    	  Term t = new Term(temp1.getData().coefficient * -1, temp1.getData().degree);
			  sub.data.addLast(t);
			  temp1 = temp1.getNext();
	      }
	      ans = this.add(sub);
	      
	      } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		    }
	      // complete this code
	      return ans; 	      
	   }

	   public Polynomial multiply(Polynomial p) {
	      Polynomial ans = new X23316343();
	      try {
	      DNode<Term> temp1 = this.data.getFirst();
	      DNode<Term> temp2 = p.data.getFirst();
	      
	      while(temp1.getNext() != null){	  
	    	  while(temp2.getNext() != null){
	    	  	Term t = new Term(temp1.getData().coefficient * temp2.getData().coefficient, temp1.getData().degree + temp2.getData().degree);
	    	  	ans.data.addLast(t);
	    	  	temp2 = temp2.getNext();
	    	  }

	    	  temp1 = temp1.getNext();
	    	  temp2 = p.data.getFirst();
	    	  
	     }
	      
	      }catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		   }
	      // complete this code
	      return ans;
	   }

	   public Polynomial divide(Polynomial p) throws Exception {
	      Polynomial ans = new X23316343();
	      // complete this code
	     
	      return ans;
	   }

	   public Polynomial remainder(Polynomial p) throws Exception {
	      Polynomial ans = new X23316343();
	      // complete this code
	      return ans;
	   } 
	  }
	   	
