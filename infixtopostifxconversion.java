// public class infixtopostifxconversion{
//     /**
//  * determines the procedence of an character
//  * @param op  the operator character
//  * @return an integer representing the precedence
//  */

//     private static int getprecendence(char op){
//         switch (op){
//             case'+':
//             case '-':
//                 return 1; //lowest precendence :addition and subtraction  
//             case '*':
//             case '/':
//                 return 2; //medium precendece :multiplication and division
//             case '^':
//             case '$': 
//                 return 3; //highest precendece:exponentiation and cdollar sign
//             default :
//                 return 0;   

//         }
//     }

// public static String converttopostfix(String infixExpression){
// //  1. create a stringbuilder to build the final postfix expresssion
//  StringBuilder postfixResult = new StringBuilder ();
//  // 2. create a stack to hold the operators and paranthesisis
//         Stack<Character> operatorStack =new Stack<>();

//  // 3. Loop through  every character in the infix expression
//         for(int i=0; i< infixExpression.length(); i++){
//             char token = infixExpression.charAt(i);

//         // Ignore any blank spaces
//         if(Character.isWhitespace(token)){
//             continue;
//         }

//         // CASE 1: The yoken is an operand (letter or Digit)
//         if(Character.isLetterOrDigit(token)){
//             // if it is a number or a varaiable, jusdt add it directly to the postfix result
//             postfixResult.append(token);
//         }

//         // CASE 2: The token is opening paramethesis '('
//         else if(token =='('){
//             // push '(' on to the stack. 
//             operatorStack.push(token);
//         }

//         // CASE 3: The token is closing paranthesisi ')'
//         else if (token ==')'){
//             //  pop operators fromt the stack and append to the postfix result
//             // until the matchinh '(' is found.

//             while(!operatorStack.isEmpty()&& operatorStack.peek()!='('){
//                 postfixResult.append(operatorStack.pop());
//           }

//           // if the stack is not empty, discard/remove '('
//           if(!operatorStack.isEmpty()&& operatorStack.peek()== '('){
//             operatorStack.pop();
//           }
//         }
    
//           // CASE 4: The token is an operator ( +, - *,/)--
//          else{
//            // while the stack is not empty AND the top iperator has
//          // greater or equal precedence than the currunt token:

//          while(!operatorStack.isEmpty()&& getPrecedence(operatorStack.peek())>= getPrecedence(token))
//          {
//             // crucial check: Dont push the opening paranthesis '('
//             // it belongs to case 3

//             if(operatorStack.peek()=='('){
//                 break;
//             }

//             // pop the higher precendence operator and push it to the result
//             postfixResult.append(operatorStack);
//          }

//          // Now, push the current operator on to the stack
//          operatorStack.push(token);

//     }

//         }

//         // 4. After scanning the expression, opp all the remaining operators from the stack
//         while(!operatorStack.isEmpty()){
//             postfixResult.append(operatorStack.pop());
//         }

//         return postfixResult.toString();
//      }

//      public static void main (String[] args){
//         String infixExpression = "a+b*c";
//         String postfixResult=converttopostfix(infixExpression);
//         System.out.println("infix expression"+infixExpression);
//         System.out.println("postifix expression"+ postfixResult);
//      }
   
//         }
  
 


