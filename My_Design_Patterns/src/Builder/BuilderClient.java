package Builder;

public class BuilderClient {

	public static void main(String[] args) {

		BankAccount ac = new BankAccount.Builder(123L).withName("vishal")
				.withBalance(345.65).withBranch("Vizag").withIntereset(8.3)
				.build();

		System.out.println(ac.toString());
	}

}
