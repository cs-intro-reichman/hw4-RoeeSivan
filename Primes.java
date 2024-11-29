public class Primes {
    public static void main(String[] args) 
    {
        // Replace this statement with your code
        int N = Integer.parseInt(args[0]);
        boolean [] found = new boolean [N+1];
        int [] numArrray = new int [N+1];
        found[0] = false;
        found[1] = false;
        numArrray[0]=0;
        numArrray[1]=1;
        int i =2,j=2;
        int countPrimes=0;
        System.out.println("Prime numbers up to "+N+":");
        while(i!=found.length)//initilizing true in every element except 0 and 1
        {
            found[i]=true;
            numArrray[i]=i;
            i++;
        }
        while(j!=numArrray.length)
        {
            if(isPrime(numArrray[j]))
            {   countPrimes++;
                found[j]=false;
                System.err.println(numArrray[j]);
            }
            else
            {
                found[j]=true;
            }
            j++;
        }
        long precent = (countPrimes*100)/N;
        System.out.println("There are "+countPrimes+" primes between 2 and "+N+" ("+precent+"% are primes)");
    }
    public static boolean isPrime(int n) // a method that check if a number is prime
    {
        int counter=0;
        for(int t=2;t<n;t++)
        {
            if(n%t==0)
            {
                counter++;
            }
        }
        if(counter==0) return true;
        return false;
    }
}
        