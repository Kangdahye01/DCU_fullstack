
public class Account {
		//속성
		int balance;
		
		//메소드
		void deposit(int amount) {
			balance += amount;
		}
		void withdraw(int amount) {
				balance -= amount;
			}
		void showBalance() {
			System.out.println("현재 잔액은 " + balance + "입니다.");
		}
		}
		
