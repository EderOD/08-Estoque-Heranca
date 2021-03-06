import java.time.LocalDate;
import java.time.LocalDateTime;

public class BemDeConsumo extends Produto {
	private LocalDate dataValidade;

	public LocalDate getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(LocalDate dataValidade) {
		// a data de fabrica��o deve ser anterior � data de validade.
		if (getDataFabricacao().isBefore(dataValidade.atStartOfDay()))
			this.dataValidade = dataValidade;
	}

	public BemDeConsumo() {
		super();
		// o default � uma validade de 6 meses.
		dataValidade = LocalDate.now().plusMonths(6);
	}

	public BemDeConsumo(String d, float p, int q, LocalDateTime f, LocalDate v) {
		super(d, p, q, f);
		setDataValidade(v);
	}	
}
