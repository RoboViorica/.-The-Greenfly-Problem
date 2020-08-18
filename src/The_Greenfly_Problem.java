import java.util.Scanner;

public class The_Greenfly_Problem {
    public static void main(String []args){

        Scanner in = new Scanner(System.in);
        int num = 1;
        int sec = 1;
        int third = 1;
        int fourth =1;
        int fifth = 1;
        for (int i=1; i<=7; i++){
            num = num+8;} //9, 17, 25, 33, 41, 49, 57

        for (int k=8; k<=14; k++){
            sec = sec+8; //9, 17, 25, 33, 41, 49, 57
            num = num +sec*8; } //129, 265, 465, 729, 1057, 1449, 1905

        for (int k=15; k<=21; k++){
            third = third+8; //9, 17, 25, 33, 41, 49, 57
            sec = sec+third*8; //129, 265, 465, 729, 1057, 1449, 1905
            num = num +sec*8; } //2937, 5057, 8777, 14609, 23065, 34657, 49897

        for (int k=22; k<=28; k++){
            fourth = fourth+8; //9, 17, 25, 33, 41, 49, 57
            third = third+fourth*8; //129, 265, 465, 729, 1057, 1449, 1905
            sec = sec+third*8;  //2937, 5057, 8777, 14609, 23065, 34657, 49897
            num = num +sec*8;  //73393, 113849, 184065, 300937, 485457, 762713, 1161889
        }
        System.out.println(num);

    }}





