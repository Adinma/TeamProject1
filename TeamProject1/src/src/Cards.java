package src;

public class Cards {
		
		//Attributes of a card
		int egg;
		String name;
		int cost;
		char habitat;
		String power;
		
		//Default constructor
		Cards(){
			this.name = "Birds";
		}
		
		//Constructor that initializes class variables
		Cards(int e,String n,int c,char h,String p ){
			this.egg = e;
			this.name = n;
			this.cost = c;
			this.habitat = h;
			this.power = p;
		}
		
		 //Setters
		 public void setEgg(int e) {
			    this.egg = e;
			  }
		 public void setName(String n) {
			    this.name = n;
			  }
		 public void setCost(int c) {
			    this.cost = c;
			  }
		 public void setHabitat(char h) {
			    this.habitat = h;
			  }
		 public void setPower(String p) {
			    this.power = p;
			  }
		 
		 //Getters
		 public int getEgg() {
			    return egg;
			  }
		 public String getName() {
			    return name;
			  }
		 public int getCost() {
			    return cost;
			  }
		 public char getHabitat() {
			    return habitat;
			  }
		 public String getPower() {
			    return power;
			  }
		
		//To string method that displays a card
		public String toString(){
		      return "Egg: "+ getEgg() + 
		    		 "\nName: "+ getName() +
		    		 "\nCost: "+ getCost() +
		    		 "\nHabitat: "+ getHabitat() +
		    		 "\nName: "+ getPower()
		    		  ;
		    }
	}

