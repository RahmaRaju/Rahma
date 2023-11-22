class Return {
 static boolean temp(int celcius) {
 if (celcius>=37) {
 return true; 
 } else {
 return false;
 } 
 } public static void main (String [] args) {
 int x = 38;
 if (temp(x)==true) {
 System.out.println("your sick, diagnosis: fever, take a rest for each day and don't forget to take medicine");
 }
 }
 }