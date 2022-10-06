

import java.util.Scanner;
   
    class Temperature {
    double degree;
    char scale;
    
    public Temperature () {
        degree = 0.0;
        scale = 'C';
    }


    public Temperature(double degree) {
        this.degree = degree;
        scale = 'C';
    }
    
    public Temperature(char scale) {
        this.scale = scale;
        this.degree = 0.0;
    }
    
    public Temperature(double degree, char scale) {
        this.degree = degree;
        this.scale = scale;
    }
    
    public double getDegreeInCelsius() {
        double C;
        if (Character.toString(this.scale).equals("C")) {
            C = this.degree;
        }
        else{
            C = ((this.degree - 32)/9) * 5;
        }
        return C;
    }
        public double getDegreeInFahrenheit() {
        double F;
        if (Character.toString(this.scale).equals("F")) {
            F = this.degree;
        }
        else{
            F = (1.8 * this.degree) + 32;
        }
        return F;
    }
        
    public void setDegree(double degree) {
        this.degree = degree;
    }
    
    public void setDegree(char scale) {
        this.scale = scale;
    }
    
    public void setDegree(double degree, char scale) {
        this.degree = degree;
        this.scale = scale;
    }
    
   public boolean equals(Temperature obj)
   {
      
       if(this.getDegreeInCelsius() == obj.getDegreeInCelsius())
           return true;
       else
           return false;
   }
  
   // method to compare two temperatures
   public boolean isLessThan(Temperature obj)
   {
      
       if(this.getDegreeInCelsius() < obj.getDegreeInCelsius())
           return true;
       else
           return false;
   }
  
   // method to compare two temperatures
   public boolean isGreaterThan(Temperature obj)
   {
      
       if(this.getDegreeInCelsius() > obj.getDegreeInCelsius())
           return true;
       else
           return false;
   }
  
}
   

    public class TravisTaylorProject09 { 
        
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
       Temperature t1=new Temperature();
      
       System.out.printf("\nThe first Temperature in celsius is %.2f C.", t1.getDegreeInCelsius());
       System.out.printf("\nThe first Temperature in fahrenheit is %.2f F.",t1.getDegreeInFahrenheit());
      
       System.out.println("\nEnter the degree (a number) and the scale (F or C) of the first Temperature.");
       
       System.out.print("Degree: ");
       double degree1 = input.nextDouble();
      
       System.out.print("Scale: ");
       char scale1 = input.next().charAt(0);
      
       t1.setDegree(degree1,scale1);
      
       System.out.printf("The first Temperature in celsius is %.2f C.", t1.getDegreeInCelsius());
       System.out.printf("\nThe first Temperature in fahrenheit is %.2f F.",t1.getDegreeInFahrenheit());
       
       System.out.print("\n");
       
       Temperature t2=new Temperature(32);
      
       System.out.printf("\nThe second Temperature in celsius is %.2f C.", t2.getDegreeInCelsius());
       System.out.printf("\nThe second Temperature in fahrenheit is %.2f F.",t2.getDegreeInFahrenheit());
      
       System.out.println("\nEnter the degree (a number) and the scale (F or C) of the second Temperature.");
       
       System.out.print("Degree: ");
       double degree2 = input.nextDouble();
      
       System.out.print("Scale: ");
       char scale2 = input.next().charAt(0);
      
       t2.setDegree(degree2,scale2);
      
       System.out.printf("The second Temperature in celsius is %.2f C.", t2.getDegreeInCelsius());
       System.out.printf("\nThe second Temperature in fahrenheit is %.2f F.",t2.getDegreeInFahrenheit());
       
       System.out.print("\n");
       
       Temperature t3=new Temperature('F');
      
       System.out.printf("\nThe third Temperature in celsius is %.2f C.", t3.getDegreeInCelsius());
       System.out.printf("\nThe third Temperature in fahrenheit is %.2f F.",t3.getDegreeInFahrenheit());
       
       System.out.println("\nEnter the degree (a number) and the scale (F or C) of the third Temperature.");
       
       System.out.print("Degree: ");
       double degree3 = input.nextDouble();
      
       System.out.print("Scale: ");
       char scale3 = input.next().charAt(0);
      
       t3.setDegree(degree3,scale3);
      
       System.out.printf("The third Temperature in celsius is %.2f C.", t3.getDegreeInCelsius());
       System.out.printf("\nThe third Temperature in fahrenheit is %.2f F.",t3.getDegreeInFahrenheit());
       
       System.out.print("\n");
       
       Temperature t4=new Temperature();
      
       System.out.printf("\nThe fourth Temperature in celsius is %.2f C.", t4.getDegreeInCelsius());
       System.out.printf("\nThe fourth Temperature in fahrenheit is %.2f F.",t4.getDegreeInFahrenheit());
      
       System.out.println("\nEnter the degree (a number) and the scale (F or C) of the fourth Temperature.");
       
       System.out.print("Degree: ");
       double degree4 = input.nextDouble();
      
       System.out.print("Scale: ");
       char scale4 = input.next().charAt(0);
      
       t4.setDegree(degree4,scale4);
      
       System.out.printf("The fourth Temperature in celsius is %.2f C.", t4.getDegreeInCelsius());
       System.out.printf("\nThe fourth Temperature in fahrenheit is %.2f F.",t4.getDegreeInFahrenheit());
       
       System.out.println("\n"); 
       
       compare(t1,"First",t2,"Second");
       compare(t1,"First",t3,"Third");
       compare(t1,"First",t4,"Fourth");
          
       compare(t2,"Second",t1,"First");
       compare(t2,"Second",t3,"Third");
       compare(t2,"Second",t4,"Fourth");
      
       compare(t3,"Third",t1,"First");
       compare(t3,"Third",t2,"Second");
       compare(t3,"Third",t4,"Fourth");
   }
  
   static void compare(Temperature t1,String label1,Temperature t2, String label2)
   {
       if(t1.equals(t2))
       {
           System.out.printf("\n%s temperature is equal to the %s temperature",label1,label2);
       }
       else
       {
           System.out.printf("\n%s temperature is not equal to the %s temperature",label1,label2);
       }
      
       if(t1.isLessThan(t2))
       {
           System.out.printf("\n%s temperature is less than the %s temperature",label1,label2);
       }
       else
       {
           System.out.printf("\n%s temperature is not less than the %s temperature",label1,label2);
       }
      
       if(t1.isGreaterThan(t2))
       {
           System.out.printf("\n%s temperature is greater than the %s temperature",label1,label2);
       }
       else
       {
           System.out.printf("\n%s temperature is not greater than the %s temperature",label1,label2);
       }
 
   }
}

/*
The first Temperature in celsius is 0.00 C.
The first Temperature in fahrenheit is 32.00 F.
Enter the degree (a number) and the scale (F or C) of the first Temperature.
Degree: 77
Scale: C
The first Temperature in celsius is 77.00 C.
The first Temperature in fahrenheit is 170.60 F.

The second Temperature in celsius is 32.00 C.
The second Temperature in fahrenheit is 89.60 F.
Enter the degree (a number) and the scale (F or C) of the second Temperature.
Degree: 77
Scale: F
The second Temperature in celsius is 25.00 C.
The second Temperature in fahrenheit is 77.00 F.

The third Temperature in celsius is -17.78 C.
The third Temperature in fahrenheit is 0.00 F.
Enter the degree (a number) and the scale (F or C) of the third Temperature.
Degree: 25
Scale: C
The third Temperature in celsius is 25.00 C.
The third Temperature in fahrenheit is 77.00 F.

The fourth Temperature in celsius is 0.00 C.
The fourth Temperature in fahrenheit is 32.00 F.
Enter the degree (a number) and the scale (F or C) of the fourth Temperature.
Degree: 100
Scale: C
The fourth Temperature in celsius is 100.00 C.
The fourth Temperature in fahrenheit is 212.00 F.


First temperature is not equal to the Second temperature
First temperature is not less than the Second temperature
First temperature is greater than the Second temperature
First temperature is not equal to the Third temperature
First temperature is not less than the Third temperature
First temperature is greater than the Third temperature
First temperature is not equal to the Fourth temperature
First temperature is less than the Fourth temperature
First temperature is not greater than the Fourth temperature
Second temperature is not equal to the First temperature
Second temperature is less than the First temperature
Second temperature is not greater than the First temperature
Second temperature is equal to the Third temperature
Second temperature is not less than the Third temperature
Second temperature is not greater than the Third temperature
Second temperature is not equal to the Fourth temperature
Second temperature is less than the Fourth temperature
Second temperature is not greater than the Fourth temperature
Third temperature is not equal to the First temperature
Third temperature is less than the First temperature
Third temperature is not greater than the First temperature
Third temperature is equal to the Second temperature
Third temperature is not less than the Second temperature
Third temperature is not greater than the Second temperature
Third temperature is not equal to the Fourth temperature
Third temperature is less than the Fourth temperature
Third temperature is not greater than the Fourth temperatureBUILD SUCCESSFUL (total time: 14 seconds)

*/


