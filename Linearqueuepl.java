// import java.util.Scanner;

// public class Linearqueuepl {
//     static int N = 10;  //maximum size of a queue
//     static int[] queue=new int[N];
//     static int F = -1;
//     static int R = -1;

//     //method to check if queue is FUll

//     public static boolean isFull(){
//         if (R ==N-1){
//             return true;

//         }else{
//             return false;
//         }   
//      }
//      //method to check if the queue is EMPTY

//      public static boolean isEmpty(){
//         if (F==-1|| F>R){
//             return true;
//         } else {
//             return false;
//         }
//      }
//      /**
//       * ENQUEUE operation
//       * logic: if(ifFull()) write overflow
//       */

//      public static void enqueue(int Item ){
//         // check if the queue is full
//          if (isFull()){
//             System.out.println("overflow : queue is full");
//             return;
//          }

//          //check if it is first element
//          if (F== -1){
//             F=0;
//             R=0;
//          } else {


//             //increment rear
//             R=R+1;

//          }
//          queue [R] = Item;
//          System.out.println(Item + "is inserted successfully");
        
//      }

//      public static void dequeue(){
//         if (isEmpty()){
//             System.out.println("underflow: queue is empty");
//             return;
//         }
//          int Item=queue[F];
//          if(F==R){
//             F=-1;
//             R=-1;
//          } else {
//             F=F+1;
//          }
//          System.out.println(Item +" is removed from queue");
//      } 


//      public static void main (String[] args){
//       // create menu for enqueue

//       Scanner sc =new Scanner (System.in);
//       int choice;
//       while (true){

//          System.out.println("========Queue Menu");
//           System.out.println("1. isEmpty?");
//           System.out.println("2. isFull?");
//           System.out.println("3. Enqueue ?");
//           System.out.println("4. Dequeue?");
//           System.out.println("5. display?");
//           System.out.println("6. exit?");
//          choice=sc.nextInt();
//          switch (choice){
//             case 1:System.out.println("queue is empty"+isEmpty());
//             break;

//             case 2: System.out.println("queue is full "+isFull());
//             break;

//             case 3: System.out.println("enter the element to insert");
//              int element=sc.nextInt();
//             enqueue(element);
//             break;

//             case 4:
//                dequeue();
//                break;

//             case 5:
//                if(isEmpty()){
//                   System.out.println("underflow");
//                   return;
//                }
//             System.out.println("element in the queue:");
//             for(int i=F;i<=R;i++){
//                System.out.println(queue[i]+"");
//             }
//             System.out.println();
//                break;
               
               
//             case 6:
//                System.out.println("existing.....");
//                System.exit(0);
//                break;

//              default:  System.out.println("invalid choice");
//              break;
//          }   
//       }
//      }
// }
