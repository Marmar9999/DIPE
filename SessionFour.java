import java.util.*;
class SessionFour{
    public static void main(String[] args){
 // session4
int days;
      for(int i=1; i<=12;i++){
          if(i%2==0 && i!=2){ days=30;}
          else if(i%2!=0){ days=31;}
          else{days=28;}
          for(int j=1; j<=days;j++){
          System.out.println("month" +i +" / day"+ j);
          }
          System.out.println("-------------------------");
      }
// stars
for(int i=1; i<=5;i++){
            for(int j=1; j<=i;j++){
            System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        
        for(int i=5; i>=1;i--){
            for(int j=1; j<=i;j++){
            System.out.print("* ");
            }
            System.out.println();
        }
//array
int[] numbers={12,10,5,20};
        int max=numbers[0];
        int min=numbers[0];
        for(int i=0; i< numbers.length;i++){
            if(numbers[i]>max) {max=numbers[i];}
            else if(numbers[i]<min) {min=numbers[i];}
        }
        System.out.println("the minimum is "+ min +" the maximum is "+ max);
        System.out.println();
        
        String[] names= new String[5];
        for(int i=0; i< names.length;i++){
            System.out.println("enter name of "+ (i+1));
            names[i]=new Scanner(System.in).nextLine();
        }
        System.out.println("-----------------");
        System.out.println("fourth: "+ names[3]);
        System.out.println("number of elements is "+ names.length);
        for(int i=0; i< names.length;i++){
            System.out.println(names[i]);
        }
        System.out.println("looking for who? ");
String name =new Scanner(System.in).nextLine(); 
boolean isFound= false;
int index=0;

for(int i=0; i< names.length;i++){
    if (names[i].equals(name)){
        isFound=true;
        index=i;
    }
}
    if(isFound == false){System.out.println(name + " Not Found");}
    else{System.out.println(name + " is found at index "+index);}
    }
    ////sort????????
 //System.out.println("-----------------");
// int[] numbers={24, 12, 5, 60, 10, 33};
// int temp;

// for(int i=0; i< numbers.length;i++){ 
//     for(int j=1; j<i ;j++){
//     if(numbers[j]<numbers[i]){
//         temp=numbers[j];
//         numbers[j]=numbers[i];
//         numbers[i]=temp;
//   }
        
//  }}
 //2 arrays
int[] numbers={24, 12, 5, 60, 10, 33};
int sum=0;
int[] numbersRev= new int[numbers.length];
//reverse the array
for(int i=0; i< numbers.length;i++){ 
    sum+=numbers[i];
    numbersRev[i] = numbers[numbers.length - 1 - i];
 }
 int j=0;
/*for(int i= numbers.length - 1; i>0;i--){ 
    sum+=numbers[j];
    numbersRev[j] = numbers[i];
    j++;
 }*/
 System.out.println("The Sum is " + sum);
//print the reversed array 
for(int i=0; i< numbersRev.length; i++){
            System.out.println(numbersRev[i]);
            
            

        }   
}
