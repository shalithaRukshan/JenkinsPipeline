public class Application {

    public static void main(String[] args){
        int target = -5;
int num = 3;

target =- num;  // Noncompliant; target = -3. Is that really what's meant?
target =+ num; // Noncompliant; target = 3
        System.out.println("simp            tg");
        System.out.println("taaa  ssss  aaadffg");
    }
}

public boolean equals(Object obj) {
  MyClass mc = (MyClass)obj;  // Noncompliant
  // ...
}
