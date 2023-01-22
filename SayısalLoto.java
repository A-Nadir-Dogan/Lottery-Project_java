//
///*
//Project: Numerical Lotto Application
//// generate n random numbers for the ticket.
//// generate the lottery result with n random numbers.
//// There should be no repeated numbers in the numeric lottery.
////
//// n(number of digits), min and max values for numbers
//// get it from the user.
////
//// compare result and ticket, how many matches there are
//// notify the user.
//
//*/
//
//import java.util.Random;
//import java.util.Scanner;
//
//public class SayısalLoto {
//    public static void main(String[] args) {
//        startLoto();
//
//
//    }
//
//    public static void startLoto() {
//        Scanner inp=new Scanner(System.in);
//        System.out.println("Enter the number of digits for the lottery: ");
//        int slots=inp.nextInt();
//        System.out.println("Enter the min value for the numbers:");
//        int min=inp.nextInt();
//        System.out.println("Enter the max value for the numbers ");
//        int max=inp.nextInt();
//        //başlangıçta hepsi 0
//        int[] lotoArr=new int[slots];
//        int[] ticketArr=new int[slots];
//
//        Random random=new Random();
//        int randomNumber1=0;
//        int randomNumber2=0;
//        boolean isRepeated;
//        for(int i=0;i<slots;i++){
//            //We want int numbers between 0-11, but between [0,10], [5-10] including 10
//            //[5,15]
//            // random.nextInt(6)+5;-->[0,5]+5-->[5,10]
//            //lotoArr yi doldur
//            do {
//                isRepeated=false;
//                randomNumber1=random.nextInt(max+1-min)+min;
//                //tekrar varmı kontrol et.
//
//                for (int j=0;j<i;j++){
//                    if(lotoArr[j]==randomNumber1){
//                        isRepeated=true;
//                        break;
//                    }
//                }
//
//            }while(isRepeated);
//            lotoArr[i]=randomNumber1;
//
//            //ticketArr yi aynı şekilde doldur
//            do {
//                isRepeated=false;
//                randomNumber2=random.nextInt(max+1-min)+min;
//                for (int j=0;j<i;j++){
//                    if(ticketArr[j]==randomNumber2){
//                        isRepeated=true;
//                        break;
//                    }
//                }
//
//            }while(isRepeated);
//            ticketArr[i]=randomNumber2;
//        }
//        System.out.println("my ticket: ");
//        for(int i=0;i<slots;i++){
//            System.out.print(ticketArr[i]+" ");
//        }
//        System.out.println();
//        System.out.println("Lotto result: ");
//        for(int i=0;i<slots;i++){
//            System.out.print(lotoArr[i]+" ");
//        }
//        System.out.println();
//        int result=compareArr(ticketArr,lotoArr);
//        if (result>0) {
//            System.out.println("Congratulations! " + result + "there is a match.");
//        }else {
//            System.out.println("Unfortunately no matches, next time.");
//        }
//
//    }
//    public static int compareArr(int[] arr, int[] brr){
//        int counter=0;
//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j< brr.length;j++){
//                if(arr[i]==brr[j]){
//                    counter++;
//                }
//            }
//        }
//        return counter;
//    }
//
//
//}
//
