import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class AprenderCucumber {

	@Dado("^que criei o arquivo corretamente$")
	public void queCrieiOArquivoCorretamente() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

	@Quando("^executa-lo$")
	public void executaLo() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

	@Então("^a especificação deve finaliazr com sucesso$")
	public void aEspecificaçãoDeveFinaliazrComSucesso() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

	private int contador = 0;

	@Dado("^que o valor do contador é (\\d+)$")
	public void queOValorDoContadorÉ(int arg1) throws Throwable {
		contador = arg1;
	}

	@Quando("^eu incrementar em (\\d+)$")
	public void euIncrementarEm(int arg1) throws Throwable {
		contador = contador + arg1;
	}

	@Então("^o valor do contador sera (\\d+)$")
	public void oValorDoContadorSera(int arg1) throws Throwable {

	}

}
