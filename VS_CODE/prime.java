public static void CheckPrimeNumber(int number){
    int n = number;
    if(n <= 1 ){
        IO.println("It is not a prime number");
        return;
    }

    for(int i=2; i< n/i; i++){
        if(n % i == 0){
            IO.println("It is not a prime number");
            return;
            
        }
    }
    IO.println("It is a prime number");
}

public static void CheckPrimeUsingCount(int number){
    int count = 0;

    if(number <= 0){
        IO.println("It is not a prime number");
        return;
    }
    for(int i=1; i<= number; i++){
        if(number % i == 0){
            count++;
        }
    }

    if(count == 2){
        IO.println("It is a prime number");
    }else{
        IO.println("It is not a prime number");
    }
}
 
void main(){
    Scanner sc = new Scanner(System.in);
    IO.print("Enter a number: ");
    int number = sc.nextInt();
    CheckPrimeNumber(number);
}

