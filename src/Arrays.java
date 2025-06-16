public class Arrays {
    public static void main(String[] args) {
        int[] array = new int[20];
        int[][] matrice = {{1,2,3},
                           {4,5,6},
                           {7,8,9}};

        String[] strings = new String[2];
        strings[0]="Hello";
        strings[1]="world";

        for(String string:strings){
            System.out.println(string);
        }
        for(int i=0;i<array.length;i++){
            array[i]=i*3;
        }
        for(int i:array){
            System.out.println(i);
        }
        for(int i = 0;i< matrice.length;i++){
            for(int j = 0;j< matrice[i].length;j++){
                System.out.print(matrice[i][j]+" ");
            }
            System.out.println();
        }
    }

}
