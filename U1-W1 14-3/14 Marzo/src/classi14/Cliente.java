package classi14;

public class Cliente {
    private long codiceCliente;
    private String nome;
    private String cognome;
    private String email;
    private String dataIscrizione;

    public Cliente(long codiceCliente, String nome, String cognome, String email, String dataIscrizione) {
	this.codiceCliente = codiceCliente;
	this.nome = nome;
	this.cognome = cognome;
	this.email = email;
	this.dataIscrizione = dataIscrizione;
    };

    public long getCodiceCliente() {
	return codiceCliente;
    }

    public void setCodiceCliente(long codiceCliente) {
	this.codiceCliente = codiceCliente;
    }

    public String getNome() {
	return nome;
    };

    public void setNome(String nome) {
	this.nome = nome;
    };

    public String getCognome() {
	return cognome;
    };

    public void setCognome(String cognome) {
	this.cognome = cognome;
    };

    public String getEmail() {
	return email;
    };

    public void setEmail(String email) {
	this.email = email;
    };

    public String getDataIscrizione() {
	return dataIscrizione;
    };

    public void setDataIscrizione(String dataIscrizione) {
	this.dataIscrizione = dataIscrizione;
    };

}