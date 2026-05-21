package creatingClassesAndObjects;

class Account{
     public  String userName;
     private String password;

     // setters is used to set the value of private variable
     void setPass(String password){
         this.password = password;
     }
    // getters is used to return the value of private variable
    public String getPassword() {
        return this.password;
    }

}
public class BankAccount {
    public static void main(String[] args) {
        Account myAcc = new Account();
        myAcc.userName = "Vishal kushwaha";
        myAcc.setPass("kashyap2");
        System.out.println(myAcc.userName);
        System.out.println(myAcc.getPassword());
    }
}
