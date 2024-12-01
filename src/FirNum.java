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



class FirTest {
    public int test(FirNum firNum, int number) {
        return firNum.calc(number);
    }

    public static void main(String[] args) {
        FirNum firNum = new FirNumFactorial();
        FirTest firTest = new FirTest();

        //Should be 120
        System.out.println(firTest.test(firNum, 5));
    }
}