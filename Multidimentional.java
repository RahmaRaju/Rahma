class Multidimentional {
public static void main(String[] args) {
int[][] num = {
{15, 16, 17},
{18, 19, 20}
};
for(int x=0; x<num.length; x++) {
for(int y=0; y<num[x].length; y++) {
System.out.println(num[x][y]);
}
}
}
}