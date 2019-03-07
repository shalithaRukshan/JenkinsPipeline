public class Application {

    public static void main(String[] args){
        int target = -5;
int num = 3;

target =- num;  // Noncompliant; target = -3. Is that really what's meant?
target =+ num; // Noncompliant; target = 3
        System.out.println("simp            tg");
        System.out.println("taaa  ssss  aaadffg");
        
                try {
            URL mySite = new URL("http://www.cs.utexas.edu/~scottm");
            URLConnection yc = mySite.openConnection();
            Scanner in = new Scanner(new InputStreamReader(yc.getInputStream()));
            int count = 0;
            while (in.hasNext()) {
                System.out.println(in.next());
                count++;
            }
            System.out.println("Number of tokens: " + count);
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

