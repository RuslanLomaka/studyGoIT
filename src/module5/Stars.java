package module5;

public class Stars {

        private int count;
        public int getCount() {
            return count;
        }
        public void setCount(int count) {
            this.count = count;
        }


        @Override
        public String toString() {
            int[] starDigits = {1000, 100, 10, 1};
            int remainder = count;
            StringBuilder starNumber = new StringBuilder();

            for(int digit: starDigits){
                int currentDigitCount=remainder/digit;
                for(int i=currentDigitCount;i>0;i--){
                    switch (digit){
                        case 1000: {
                            starNumber.append('X');
                           break;
                        }
                        case 100: {
                            starNumber.append('Y');
                           break;
                        }
                        case 10: {
                            starNumber.append('Z');
                           break;
                        }
                        case 1:{
                            starNumber.append('*');
                           break;
                        }
                        default: {
                            starNumber.append("");
                            System.out.println("Digit not found");
                           break;
                        }
                    }
                    remainder=remainder-digit;

                }

            }
            return starNumber.toString();
        }

        public static void main(String[] args) {
            Stars stars = new Stars();
            stars.setCount(36279);
            System.out.println(stars);
            System.out.println(stars.getCount());
        }
    }
