import static java.lang.System.out;
public class hotel {
public static void main (String [] args) {
int guests[] = { 5, 9, 7, 3, 5, 0, 7, 0, 3, 9 } ;
int roomNum = 5;
out.println("Room\tGuests");
for (int numGuests : guests) {
out.println(roomNum++);
out.print("\t");
out.println(numGuests);
}
}
}
