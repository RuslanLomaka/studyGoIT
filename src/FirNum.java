class FirNum{

    public int calc(int number) {
        return number;
    }
}

class FirNumSum extends FirNum{
    @Override
    public int calc(int number){
        int result =0;
        for(int i=number;i>0;i--){
            result +=i;
        }
              return result;
    }
}

class FirNumFactorial extends FirNum{
    @Override
    public int calc(int number){
        int result =1;
        for(int i=number;i>0;i--){
            result *=i;
        }
        return result;
    }
}

class FirNumMultiplyOdd extends FirNum{
    @Override
    public int calc(int number){
        int result =1;
        for(int i=number;i>0;i--){

            if(i%2==1) result *=i;
        }
        return result;
    }
}

class FirNumFizzBuzz extends FirNum{
    @Override
    public int calc(int number){
        int result =0;
        for(int i=number;i>0;i--){

            if((i%3==0||i%5==0) && !(i%3==0 && i%5==0)) result +=i;

        }

        return result;
    }
}

class FirNumBasis extends FirNum{
    @Override
    public int calc(int number){
        int result =0;
        for(int i=number;i>0;i--){

            if(i%2==0) result +=i;

        }

        return result/2;
    }
}




class FirTest {
    public int test(FirNum firNum, int number) {
        return firNum.calc(number);
    }

    public static void main(String[] args) {
        FirNum firNum = new FirNumBasis();
        FirTest firTest = new FirTest();

        //Should be 20
        System.out.println(firTest.test(firNum, 254));
    }
}